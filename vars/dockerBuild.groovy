def call(Map params) {
  def registry = "<registry>"
  def image = params.image
  def proxy = params.withProxy ? '--build-arg https_proxy=http://<proxy>:8080' : ''
  
  node('docker') {
    sh "docker build -t ${registry}/${image} ${proxy} ."

    if (params.withScan) {
      def imageId = sh(
        script: "docker inspect ${registry}/${image} -f '{{.ID}}'",
        returnStdout: true,
       )
      scanImageForVulns(imageId: imageId)
     } 

     if (params.pushToRegistry) {
       withCredentials([usernamePassword(credentialsId: params.credentialsId)]) {
         retry(3) {
           sh "docker push ${registry}/${image}"
          }
       }
     } 
  }

}
