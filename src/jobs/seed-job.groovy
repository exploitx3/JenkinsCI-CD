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
