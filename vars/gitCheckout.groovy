def call(Map stageParams){

	checkout([
           $class: 'GitSCM', 
           branches: [[name: '*/main']],
           extensions: [], 
           userRemoteConfigs: [[url: 'https://github.com/neerajparuthi/jenkins_shared_libs.git']]])

}
