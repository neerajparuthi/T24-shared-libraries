def call() {
//docker.build("52.44.217.82:8083/numericapp:${TAG}")
  sh 'docker build -t 52.44.217.82:8083/numericapp:v1 .'
}
