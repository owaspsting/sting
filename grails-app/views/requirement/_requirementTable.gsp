<table class="table">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th colspan="2">Action</th>
    </tr>
    <g:each var="req" in="${requirements}">
	    <tr>
	        <td>${req.id}</td>
	        <td><a href="#" OnClick="readRequirement(${req.id})" >${req.title}</a></td>
	        <td><a href="#" OnClick="editRequirement(${req.id})" class="btn">Edit</a></td>
	        <td><g:remoteLink class="delete btn" url="[mapping: 'requirement', params:[id:req.id]]" method="DELETE" update="[success:'requirementsTable', failure:'errorMessage']">Delete</g:remoteLink></td>
	    </tr>
    </g:each>
</table>