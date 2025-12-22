def call() { stage('Build') { 
    echo "Building application..." sh 'mvn clean package -DskipTests'
     } }