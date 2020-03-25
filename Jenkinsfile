pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        build 'Project_Clean'
      }
    }

    stage('compile') {
      steps {
        build 'Project_Compile'
      }
    }

  }
}