def call(){

	checkout([
           $class: 'GitSCM', 
           branches: [[name: '*/main']],
           extensions: [], 
           userRemoteConfigs: [[url: 'https://github.com/neerajparuthi/T24-shared-libraries.git']]])

}
