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

        stage("Package Artifact Jar") {
            sh "mvn package -DskipTests=true"
        }
       
    }
}
