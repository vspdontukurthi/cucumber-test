pipeline {agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean install package'
                 step([$class: 'CucumberReportPublisher', jsonReportDirectory: "./Build/temp/", jenkinsBasePath: '', fileIncludePattern: 'reports.json'])
            }
        }
    }
}