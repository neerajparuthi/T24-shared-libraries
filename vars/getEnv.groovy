def call(Map config = [:]) {
  def envContents = libraryResource "cg/t24/parameters/env.yaml"
  writeFile file: "env.yaml", text: envContents
  sh 'cat env.yaml'
}
