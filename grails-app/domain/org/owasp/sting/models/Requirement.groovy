package org.owasp.sting.models

import org.grails.taggable.*

/**
*   Class to represent a policy, guideline or requirement. Implements Taggable fpr filtering issues
*/
class Requirement implements Taggable{
    
    String title
    String shortDescription
    String longDescription
    
    static constraints = {
    }
}
