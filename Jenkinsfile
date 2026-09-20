pipeline {
    agent any
       tools {
          maven 'Maven-3.8.7'
         } 

       stages {

          stage ('Build'){
            steps {
                sh '/usr/bin/mvn clean compile'
            }
          }

          stage ('Test'){
            steps {
                sh '/usr/bin/mvn test'
            }
          }

          stage ('Package') {
            steps {
                sh '/usr/bin/mvn clean package'
            }
          }

          stage ('SonarQube') {
            steps {
                sh '/usr/bin/mvn sonar:sonar'
            }
          }
       }
}
