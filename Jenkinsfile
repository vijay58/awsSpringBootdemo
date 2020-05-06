 pipeline {
    
    agent { dockerfile true }
  
    
    stages {
        
        stage('compile stage') {
            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn clean install'
                }
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