
/**
*   Shows or hides elements
*   elementClass: the class of the elements to hide/show ex.: "a.delete"
**/
function toggleShowElements(elementClass)
{
    if( $(elementClass).first().hasClass("hide"))
    {
        $(elementClass).each(function(){
            $(this).removeClass("hide")
        })
    }
    else
    {
        $(elementClass).each(function(){
            $(this).addClass("hide")
        })
    }
}

$( document ).ready(function() {

//Questionaire Color Changer
$(document).on('change', '#radiogroup input:radio', function () {
    var selectedVal = $(this).val();
    var questionLabel = $(this).parents('div #radiogroup').children('#radiogroupCaption');

    switch (selectedVal) {
        case "yes": questionLabel.attr('class', 'questionnaire green'); break;
        case "no": questionLabel.attr('class', 'questionnaire red'); break;
        case "none": questionLabel.attr('class', 'questionnaire orange'); break;
    }
});


})
