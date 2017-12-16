pipeline {agent any
    stages {
        stage('Build') {
            dir("../builds/${BUILD_NUMBER}/") {
        sh "cp -r cucumber-html-reports $WORKSPACE"
    }

    archive "cucumber-html-reports/*" 
            steps {
                sh 'mvn clean install package'
            }
        }
    }
}