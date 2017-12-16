pipeline {agent any
    stages {
        stage('Build') { 
            steps {
             dir("../builds/${BUILD_NUMBER}/") {
        sh "cp -r cucumber-html-reports $WORKSPACE"
    }

    archive "cucumber-html-reports/*"
                sh 'mvn clean install package'
            }
        }
    }
}