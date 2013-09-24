class UrlMappings {

	static mappings = {
		
		/* 
		 * Pages without controller 
		 */
//		"/"				(view:"/index")
		"/about"		(view:"/siteinfo/about")
		"/blog"			(view:"/siteinfo/blog")
		"/systeminfo"	(view:"/siteinfo/systeminfo")
		"/contact"		(view:"/siteinfo/contact")
		"/terms"		(view:"/siteinfo/terms")
		"/imprint"		(view:"/siteinfo/imprint")
		"/nextSteps"	(view:"/home/nextSteps")
		
		/* 
		 * Pages with controller
		 * WARN: No domain/controller should be named "api" or "mobile" or "web"!
		 */
        "/"	{
			controller	= 'home'
			action		= { 'index' }
            view		= { 'index' }
        }
//		"/$controller/$action?/$id?"{
//			constraints {
//				controller(matches:/^((?!(api|mobile|web)).*)$/)
//		  	}
//		}
		
		"/requirements"(controller: "Requirement", parseRequest: true) {
			action = [GET: "list", POST: "unsupported", PUT: "unsupported", DELETE: "unsupported"]
		}
		name "requirement" : "/requirement/$id"(controller: "Requirement", parseRequest: true) {
			action = [GET: "unsupported", POST: "unsupported", PUT: "unsupported", DELETE: "deleteRequirement"]
		}
		"/requirements/addSomeJunk" (controller: "Requirement", action: "addSomeJunkRequirements")
		
		/* 
		 * System Pages without controller 
		 */
		"403"	(view:'/_errors/403')
		"404"	(view:'/_errors/404')
		"500"	(view:'/_errors/error')
		"503"	(view:'/_errors/503')
	}
}
