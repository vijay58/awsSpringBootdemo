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
                   dimage =  sh 'docker images -q my-image:spring-boot-service'
                   echo(dimage);
                    if (dimage) {
                      sh 'docker rmi images my-image:spring-boot-service'
                      echo("docker images exists");
                      } else {
                        echo("docker images doesn't exists");
                        }

                 
                     }    
               }
           }
        
        stage('docker build') {
            steps {
            script {
                docker.build("my-image:spring-boot-service").run("-p 9082:9082")
              }
                                
                
            }
        }
		
	 
   }
}
 