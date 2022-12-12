def call(){

pipeline {
    agent none 
    stages {
        stage('gitCheckout') {
            //agent { docker 'maven:3.8.1-adoptopenjdk-11' } 
            agent any
            steps {
                echo 'Hello, Maven'
                
                gitCheckout()
            }
        }
        stage('Build code') {
            agent any 
            steps {
                echo 'Hello, JDK'
                sh 'mvn clean package'
            }
        }
    }
}



}
