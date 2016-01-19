$(function()
{	
    var docTop = $(document).scrollTop();
    var header = $('.headline').outerHeight();

    $(window).scroll(function() 
    {
        var in_top = $(document).scrollTop();

        if (in_top > header)
        {
        	// $(".panel").slideToggle("slow");
        	//$('.headline').addClass('g');
        	//$(".headline").slideToggle("slow");
        	$(".headline").slideUp();
        } 
        else 
        {
        	//$(".headline").slideToggle("slow");
        	//$('.headline').removeClass('g');
        	$(".headline").slideDown();
        }

        if (in_top > docTop)
        {
        	//$(".headline").slideToggle("slow");
        	//$('.headline').removeClass('s');
        } 
        else 
        {
        	//$(".headline").slideToggle("slow");
        	//$('.headline').addClass('s');
        }				

        docTop = $(document).scrollTop();	
    });
});
$(document).ready(function()
{
	$(".contentPanel").click(function()
	{
		$(".area1").slideToggle("slow");
	});
});