pipeline {agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean install package'
                 dir("../builds/${BUILD_NUMBER}/") {
        sh "cp -r cucumber-html-reports $WORKSPACE"
    }

    archive "cucumber-html-reports/*"
            }
        }
    }
}