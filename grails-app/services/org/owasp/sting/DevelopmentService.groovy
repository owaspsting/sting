package org.owasp.sting

import org.owasp.sting.models.Requirement
import org.owasp.sting.models.RequirementCatalog

/**
 * DevelopmentService
 * A service class encapsulates the core business logic of a Grails application
 */
class DevelopmentService {

    static transactional = true
	
	def requirementService
	def requirementCatalogService

    def addSomeJunkRequirements() {
		
		if(!RequirementCatalog.findByName("devStuff"))
			new RequirementCatalog(name:"devStuff", description: "Test Katalog").save()
			
		requirementService.addRequirement("devStuff", 
			new Requirement(title: "Scala SOLLTE besser dokumentiert sein.", 
							shortDescription: "Ein kurzer Text.",
							longDescription: "Ein langer Text."+System.currentTimeMillis()))
		
		requirementService.addRequirement("devStuff",
			new Requirement(title: "PLAY steht dem in nichts nach.", 
						shortDescription: "Ein kurzer Text.",
						longDescription: "Ein langer Text."+System.currentTimeMillis()))

    }
}
