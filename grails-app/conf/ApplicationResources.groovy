modules = {
    application {
        resource url:'js/application.js'
    }
	requirement {
		dependsOn 'application'
		resource url:'js/requirement.js'
	}
}