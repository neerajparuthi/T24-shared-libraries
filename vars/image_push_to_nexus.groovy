def call() {
   docker.withRegistry('http://52.44.217.82:8083', 'nexusrepocreds') {
                        docker.image("52.44.217.82:8083/numericapp:env.TAG").push()
                        //docker.image("docker4028/hello-world:${TAG}").push("latest")
                    }
}
