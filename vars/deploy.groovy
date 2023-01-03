def call(){
     sh "docker stop numericApp | true"
     sh "docker rm numericApp | true"
     sh "docker run --name numericApp -d -p 8085:8080 52.44.217.82:8083/numericapp:env.TAG"
}
