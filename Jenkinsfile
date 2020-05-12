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
                   dimage = docker.image("my-image:spring-boot-service")
                    if (dimage.exists()) {
                      sh 'docker rmi images my-image:spring-boot-service'
                      }
                 
                     }    
               }
           }
        
        stage('docker build') {
            steps {
            script {
                docker.build("my-image:spring-boot-service")
              }
                                
                
            }
        }
   }
}
