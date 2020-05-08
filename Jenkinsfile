 pipeline {
    
    agent any
  
    stages {
        
        stage('compile stage') {
            steps {
                maven(maven : 'maven_3.6.3') {
                    sh 'mvn clean compile install'
                }
            }
        }
        
    }
}