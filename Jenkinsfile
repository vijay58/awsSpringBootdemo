 pipeline {
    
    agent  any
  
    
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
                                            
                docker.build("my-image:${env.BUILD_ID}")
            }
        }
        
    }
}