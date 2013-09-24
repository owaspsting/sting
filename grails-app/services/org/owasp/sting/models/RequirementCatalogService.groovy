package org.owasp.sting.models

/**
 * RequirementCatalogService
 * A service class encapsulates the core business logic of a Grails application
 */
class RequirementCatalogService {

    static transactional = true

    def createRequirementCatalog(RequirementCatalog catalog) {
		catalog.save()
    }
}
