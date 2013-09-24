<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="OWASP S.T.I.N.G"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'owasp_favicon.ico')}" type="image/x-icon">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		
		<r:require modules="jquery"/>
		<r:require modules="bootstrap"/>
		<r:require modules="bootstrap_utils"/>
		<r:require modules="application"/>
	
		<r:layoutResources />
		<g:layoutHead/>
	</head>
	<body>
		<div class="navbar">
          <div class="navbar-inner">
            <a class="brand" href="#">OWASP =S.T.I.N.G=</a>
            <ul class="nav">
              <li ${controllerName == 'home' ? 'class="active"' : ''}><a href="/sting">Home</a></li>
<%--              <li class='@(if(controller == "questionnaire")"active")'><a href="/questionnaire">Questionnaire</a></li>--%>
              <li ${controllerName.equals('requirement') ? 'class="active"' : ''}><a href="requirements">Requirements</a></li>
              <li class='dropdown'>
                <a data-toggle="dropdown" class="dropdown-toggle" href="#">Dev Stuff</a>
                <ul class="dropdown-menu">
                    <li><a href="requirements/addSomeJunk">Add Demo Requirements</a></li>
                </ul>
              </li>
            </ul>
          </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="span12">
                	<g:if test="${flash.message}">
                		<div class="flash">
                			${flash.message}
                		</div>
                	</g:if>
                	<div id="errorMessage" class="error"></div>
                    <g:layoutBody/>
                </div>
            </div>
        </div>
		<r:layoutResources />
	</body>
</html>
