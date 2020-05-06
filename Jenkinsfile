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
                    docker image 'awsspringboot:latest'
                    chmod 666 /var/run/docker.sock
                    args '-v /var/run/docker.sock:/var/run/docker.sock'
                  
            }
        }
        
    }
}