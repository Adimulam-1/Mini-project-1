pipeline {
    agent any 

       stages {

          stage ('Checkout'){
            steps {
                sh 'Checkout Scm'
            }
          }

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
       }
}
