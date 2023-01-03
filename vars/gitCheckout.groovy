def call(){

	checkout([
           $class: 'GitSCM', 
           branches: [[name: '*/main']],
           extensions: [], 
           userRemoteConfigs: [[url: 'https://github.com/neerajparuthi/java_application_t24.git']]])

}
