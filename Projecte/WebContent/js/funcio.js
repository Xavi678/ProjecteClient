/**
 * 
 */


		
		$(document).ready(function () {
			
			$("tbody tr").click(function (e) { 
				
				window.location.href="/XaviTeatres/elegirFuncio.action?id="+$(this).attr("id");
				
			});
		});