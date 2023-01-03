def call(){
pipeline {
    agent any
    tools {
        maven 'maven-coe'
    }
    environment {
        DATE = new Date().format('dd.M')
        TAG = "${DATE}_${BUILD_NUMBER}"
    }
    stages {
        stage('Git Checkout') {
            steps {
                gitCheckout()
            }
        }
        stage('Compiling code') {
          steps {
            mvnBuild()
          }
        }
        stage('SonarQube Analysis') {
            environment {
                SCANNER_HOME = tool 'Sonar-Scanner'
            }
            steps {
               sonar_scan()
            }
        }
        stage('SonarQuality gates'){
           steps {
             sonar_qgates()  
           } 
        }
        stage('Docker image build'){
            steps{
                docker_build()
            }
        }
        stage('Docker image push to nexus'){
            steps{
                image_push_to_nexus()
            }
        }
        stage('Deploy'){
            steps{
                deploy()
            }
        }
        stage('Notify'){
            steps{
                notify(type: "teams")
            }
        }
        
    }
     post { 
        always { 
            cleanWs()
        }
    }
}
    
}
