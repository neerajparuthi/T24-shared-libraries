def call() {
      node {
//        stage("Compile") {
//             sh "maven-coe clean compile"
//         }

//         stage("Unit Test") {
//             sh "maven-coe test"
//         }

//         stage("Integration Test") {
//             sh "maven-coe verify"
//         }

        
            sh "mvn package -DskipTests=true"
        
       
    }
}
