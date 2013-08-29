package org.owasp.sting.models

class Requirement {
    
    String origin
    String title
    String shortDescription
    String longDescription
    
    static constraints = {
        origin(nullable:true)
    }
}
