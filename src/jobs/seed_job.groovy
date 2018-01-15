pipelineJob('Build Angular') {

    def repo = 'https://github.com/exploitx3/angular-app.git'

    triggers {
        scm('* * * * *')
    }
    description("Pipeline for $repo")

    definition {
        cpsScm {
            scm {
                git {
                    remote { url(repo) }
                    branches('master', '**/feature*')
                    scriptPath('Jenkinsfile')
                    extensions { }
                } }
        }
    }
}

pipelineJob('Build Ruby') {

    def repo = 'https://github.com/exploitx3/sample_app.git'

    triggers {
        scm('* * * * *')
    }
    description("Pipeline for $repo")

    definition {
        cpsScm {
            scm {
                git {
                    remote { url(repo) }
                    branches('master', '**/feature*')
                    scriptPath('Jenkinsfile')
                    extensions { }
                } }
        }
    }
}
