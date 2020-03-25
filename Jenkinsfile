pipeline {
  agent any
  stages {
    stage('compile') {
      steps {
        build 'Project_Compile'
      }
    }

    stage('test') {
      steps {
        build 'Projeto_Test'
      }
    }

    stage('javadoc') {
      steps {
        build 'Project_Doc'
      }
    }

  }
}