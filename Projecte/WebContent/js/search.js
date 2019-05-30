/**
 * 
 */
$(document).ready(function () {
	
	$(".borde").click(function (e) { 
		
		window.location.href="/XaviTeatres/obtenirfuncions.action?id="+$(this).attr("id");
		
	});
});

