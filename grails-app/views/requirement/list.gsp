<html>

<head>
	<meta name="layout" content="main" />
	<r:require modules="requirement"/>
</head>

<body>
	<h1>Requirement List</h1>
    <hr/>
    <a href="#" class="btn" id="showCreateRequirementModal">Add Requirement</a>
    <a href="#" id="showDeleteRequirement" class="btn">Delete Requirement(s) ...</a>
    <hr/>
    
	<div id="requirementsTable">
		<g:render template="requirementTable" />        
	</div>
    
</body>
</html>