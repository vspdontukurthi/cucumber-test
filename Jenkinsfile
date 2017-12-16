pipeline {agent any
    stages {
        stage('Build') { 
            steps {
                step([$class: 'CucumberReportPublisher', jsonReportDirectory: "./Build/temp/", jenkinsBasePath: '', fileIncludePattern: 'reports.json'])
                sh 'mvn clean install package' 
            }
        }
    }
}