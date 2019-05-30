/**
 * 
 */

$(document).ready( function () {
	  $('#example').DataTable();
	$("#desfer").click(function (e) { 
		e.preventDefault();

		$("#searchData").val("null");
		$("#teatre").val("null");
		$("#espectacle").val("null");
		window.location.href = '/XaviTeatres/info.action';
		
	});
} );