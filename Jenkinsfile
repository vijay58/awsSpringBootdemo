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
                  docker. rm images "my-image:spring-boot-service";
                  docker.build("my-image:spring-boot-service")
              }

                                            
                
            }
        }
   }
}
