/**
*   Ajax call to delete the requirement with the id
*   refreshs the requirements table
*/
function deleteRequirement( id )
{
jsRoutes.controllers.RequirementController.deleteRequirement(id).ajax(  {
    success: function(response){
               $("#requirementsTable").html(response);
           }
       });
}

/**
*   Shows the edit modal Dialog
*/
function editRequirement( id )
{
    $('#editRequirementModal .modal-title').text("Edit Requirement")
    $('#editRequirementModal').init
    $('#editRequirementModal').modal
        ({
            keyboard: "true",
            remote: jsRoutes.controllers.RequirementController.editRequirement(id).absoluteURL()
        })
}

/**
*   Shows the read modal Dialog
*/
function readRequirement( id )
{
    $('#editRequirementModal .modal-title').text("Details")
    $('#editRequirementModal').modal
        ({
            keyboard: "true",
            remote: jsRoutes.controllers.RequirementController.readRequirement(id).absoluteURL()
        })
}




$( document ).ready(function() {

//hide delete buttons
var showDeleteButtonToggle = false
toggleShowElements("a.delete")

/**
*   Shows/Hides the Delete Buttons for the requirements inside the table/list
*/
$("#showDeleteRequirement").click(function() {
    if(showDeleteButtonToggle)
    {
        toggleShowElements("a.delete")
        $("#showDeleteRequirement").text("Delete Requirement(s) ...")
        showDeleteButtonToggle = false
    }
    else
    {
        toggleShowElements("a.delete")
        $("#showDeleteRequirement").text("Hide delete-Buttons")
        showDeleteButtonToggle = true
    }
})

/**
*   Shows the create modal Dialog
*/
$("#showCreateRequirementModal").click(function() {
    $('#editRequirementModal .modal-title').text("Create Requirement")
    $('#editRequirementModal').modal({
                                        keyboard: "true",
                                        remote: jsRoutes.controllers.RequirementController.createRequirement().absoluteURL()
                                      })
})

/**
    Reset Modal dialog when hidden
*/
$("#editRequirementModal").on("hidden", function() {
    $("#editRequirementModal").removeData()
});


/**
*   Two sortable Lists of Tags
*/
$('#editRequirementModal').on('shown', function () {
    $( "#taskListCurrent, #taskListAvailable" ).sortable({
        connectWith: ".connectedSortable",
        //get all tag-ids and create a List inside the hidden field
        stop: function(event, ui) {
            var fruitOrder = $(this).sortable('toArray').toString();
            $("#tagIds").val($("#taskListCurrent").sortable('toArray').toString().replace(/tag_/g, ""));
        }
    }).disableSelection();
})


})
