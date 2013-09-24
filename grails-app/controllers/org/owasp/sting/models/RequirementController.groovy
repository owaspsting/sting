package org.owasp.sting.models

import org.owasp.sting.DevelopmentService;

class RequirementController {
    
//    static scaffold = true
	
	def developmentService
	def requirementService
	
	def list(){
		[requirements : Requirement.list()]
	}
	
	def addSomeJunkRequirements(){
		developmentService.addSomeJunkRequirements()
		redirect url: "/requirements" 
	}
	
	def deleteRequirement(){
		requirementService.deleteRequirement( params.id )
		render(template: "requirementTable", model: [requirements : Requirement.list()])
	}
    
}
