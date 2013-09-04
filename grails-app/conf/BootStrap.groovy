import org.owasp.sting.models.*

class BootStrap {

    def init = { servletContext ->
        def lhotseRequirementCatalog = new RequirementCatalog(name:"otto-lhotse", description:"Sicherheitsrichtlinien Lhotse").save()

        lhotseRequirementCatalog.addToRequirements(new Requirement(title:"Eine Session MUSS durch einen eindeutigen Session-Identifier festgelegt werden", shortDescription:"Die Länge der Session-Identifier MUSS mindestens 120 Bit (vollständig nach dem Zufallsprinzip generiert) betragen. (120 Bit => 36 Ziffern[0..9] oder 20 Character [A..Z, a..z, 0..9])", longDescription:"")).save()
    }
    def destroy = {
    }
}
