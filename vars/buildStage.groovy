def call(steps, moduleName, dockerTag) {
    steps.stage("Build Docker Image: ${moduleName}") {
        steps.echo "Building ${moduleName} Docker image..."
        steps.sh "docker build -t ${moduleName}:${dockerTag} ${moduleName}"
    }
}
