 pipeline {
    
    agent {

        dockerFile true
    }
  
    
    stages {
        
        stage('compile stage') {
            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn clean install'
                }
            }
        }
        
    }
}