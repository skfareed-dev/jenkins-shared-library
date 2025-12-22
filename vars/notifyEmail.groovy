def call(String status) {
    try {
        emailext(
            subject: "Jenkins Build ${status}: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
            body: """
            <h3>Build ${status}</h3>
            <p><b>Job:</b> ${env.JOB_NAME}</p>
            <p><b>Build Number:</b> ${env.BUILD_NUMBER}</p>
            <p><b>Build URL:</b> <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>
            """,
            to: "jsp82767@gmail.com"
        )
    } catch (e) {
        echo "Email notification failed: ${e.getMessage()}"
    }
}
