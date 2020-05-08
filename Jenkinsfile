pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
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
