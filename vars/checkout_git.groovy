def checkout_code(tag_name, Project_url){
  checkout([$class: 'GitSCM',
			branches: [[name: "$tag_name"]],
			doGenerateSubmoduleConfigurations: false,
			extensions: [],
			gitTool: 'Default',
			submoduleCfg: [],
			userRemoteConfigs: [[credentialsId: 'code-commit-user', url: "${Project_url}"]]
		])
}
def checkout1(project_url){
	sh 'git clone ${project_url}'
}
