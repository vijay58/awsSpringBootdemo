 pipeline {
    
    agent any
  
    
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