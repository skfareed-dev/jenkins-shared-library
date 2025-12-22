def call(steps) {
    steps.stage('Build') {
        steps.echo "Building application..."
        steps.sh 'npm install'
    }
}
