def call() {  
withSonarQubeEnv(credentialsId: 'sonar_token', installationName: 'sonarqube') {
         sh '''$SCANNER_HOME/bin/sonar-scanner \
         -Dsonar.projectKey=java_application_t24 \
         -Dsonar.projectName=java_application_t24 \
         -Dsonar.sources=src/ \
         -Dsonar.java.binaries=target/classes/ \
         -Dsonar.exclusions=src/test/java/****/*.java \
         -Dsonar.java.libraries=/var/lib/jenkins/.m2/**/*.jar \
         -Dsonar.projectVersion=${BUILD_NUMBER}-${GIT_COMMIT_SHORT}'''
              }
  
}
