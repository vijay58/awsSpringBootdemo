pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/vijay58/awsSpringBootdemo.git'

            // Run Maven on a Unix agent.
            sh "mvn clean compile install -Dmaven.test.skip=true"
         }
      }
      
      stage('docker image') {
            steps {
              script {
                  
                  docker.build("my-image:${env.BUILD_ID}")
              }

                                            
                
            }
        }
   }
}
