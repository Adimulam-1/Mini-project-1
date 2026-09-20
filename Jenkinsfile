pipeline {
    agent any
       tools {
          maven 'Maven-3.8.7'
         } 

       stages {

          stage ('Build'){
            steps {
                sh 'mvn clean compile'
            }
          }

          stage ('Test'){
            steps {
                sh 'mvn test'
            }
          }

          stage ('Package') {
            steps {
                sh 'mvn clean package'
            }
          }

          stage ('SonarQube') {
            steps {
                sh 'mvn sonar:sonar'
            }
          }
          stage('SonarQube Analysis') {
           steps {
              withCredentials([string(credentialsId: 'sonarqube-token', variable: 'SONAR_TOKEN')]) {
            sh '''
                mvn clean verify sonar:sonar \
                -Dsonar.token=$SONAR_TOKEN
            '''
        }
    }
} 
       }
}
 
