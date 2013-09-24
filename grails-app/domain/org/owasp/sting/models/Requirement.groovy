package org.owasp.sting.models

import org.grails.taggable.*

/**
*   Class to represent a policy, guideline or requirement. Implements Taggable for filtering issues
*/
class Requirement implements Taggable, Comparable{
    
    String title
    String shortDescription
    String longDescription
	
//	static belongsTo = [requirementCatalog : RequirementCatalog]
	
    static constraints = {
    }

	@Override
	public int compareTo( Object other )
	{
		return ( other instanceof Requirement)?
			title <=> other.title ?: 
			shortDescription <=> other.shortDescription ?: 
			longDescription <=> other.longDescription
		: -1
	}
}
