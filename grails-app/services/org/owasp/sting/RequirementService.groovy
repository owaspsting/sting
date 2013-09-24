package org.owasp.sting

import org.owasp.sting.models.Requirement
import org.owasp.sting.models.RequirementCatalog;

/**
 * RequirementService
 * A service class encapsulates the core business logic of a Grails application
 */
class RequirementService {

    static transactional = true
	def requirementCatalogService

	/**
	 * 
	 * @param catalogueName name of the requirement catalog
	 * @param req requirement to save
	 * @return
	 */
    def addRequirement(String catalogName, Requirement req) {
		def reqCatalog = RequirementCatalog.findByName(catalogName)
		reqCatalog?.addToRequirements(req)?.save()
    }
	
	def deleteRequirement(String id){
		
		if(!id.isLong())
			return
			
		log.error("Searching Req for id: "+id)
		def requirement = Requirement.get( id )
		log.error("Found: "+requirement.title)
		def reqCatalog = RequirementCatalog.findByRequirement( requirement )
		
		reqCatalog?.requirements?.remove(requirement)
		requirement.delete(flush: true)
		log.error("req should be deleted: "+requirement)
	}
}
