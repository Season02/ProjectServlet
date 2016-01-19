$(function()
{	
    var cubuk_seviye = $(document).scrollTop();
    var header_yuksekligi = $('.headline').outerHeight();

    $(window).scroll(function() 
    {
        var kaydirma_cubugu = $(document).scrollTop();

        if (kaydirma_cubugu > header_yuksekligi)
        {
        	$('.headline').addClass('g');
        } 
        else 
        {
        	$('.headline').removeClass('g');
        }

        if (kaydirma_cubugu > cubuk_seviye)
        {
        	$('.headline').removeClass('s');
        } 
        else 
        {
        	$('.headline').addClass('s');
        }				

        cubuk_seviye = $(document).scrollTop();	
    });
});