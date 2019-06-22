pipeline {
  agent {
    node {
      label 'master'
    }

  }
  stages {
    stage('process-dsl') {
      steps {
        jobDsl()
        jobDsl(targets: 'buildjobs/dsl/sample.dsl')
      }
    }
    stage('build job') {
      steps {
        build(job: 'Jenkins blue ocean job', propagate: true)
      }
    }
  }
}