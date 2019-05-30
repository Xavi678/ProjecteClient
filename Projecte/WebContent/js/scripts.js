/**
 * 
 */

/* $("#registrar").submit(function (event) { 
        event.preventDefault();
       
        
        
        swal({
        	  title: "Are you sure?",
        	  text: "Once deleted, you will not be able to recover this imaginary file!",
        	  icon: "warning",
        	  buttons: true,
        	  dangerMode: true,
        	})
        	.then((willDelete) => {
        	  if (willDelete) {
        	    swal("Poof! Your imaginary file has been deleted!", {
        	      icon: "success",
        	    });
        	    
        	  } else {
        	    swal("Your imaginary file is safe!");
        	    return false;
        	  }
        	});
        
        $(this).unbind('submit').submit(); 
        //$(this).unbind('submit').submit(); 
    });*/


	

	




/*$('#enviar').on('click',function(e){
    e.preventDefault();
    var form = $(this).parents('form');
    swal({
        title: "Are you sure?",
        text: "You will not be able to recover this imaginary file!",
        type: "warning",
        showCancelButton: true,
        confirmButtonColor: "#DD6B55",
        confirmButtonText: "Yes, delete it!",
        closeOnConfirm: false
    }, function(isConfirm){
        if (isConfirm) form.submit();
    });
});*/

//$("#ocult").hide();

$('#enviar').on('click',function(e){
	e.preventDefault();
	

/* swal("Click on either the button or outside the modal.")
.then((value) => {
  //form.submit();
  
  $('form[name="prova"]').submit();
});*/
	//$('form[name="registre"]')[0].checkValidity();
	var el = document.createElement("a");
	el.href = "https://apdcat.gencat.cat/web/.content/01-autoritat/normativa/documentos/LLEI-ORGANICA-3-2018-BOE-A-2018-16673-C.pdf";
	el.innerText = "Clica Aquí!";

swal({
	  title: "Acceptes la llei de protecció de dades personals 3/2018 del 5 de desembre?",
	  text: " Més informació: ",
	  icon: "info",
	  buttons: true,
	  dangerMode: false,
	  cancelButtonText: 'Cancel·lar',
	  confirmButtonText: 'Acceptar',
	  closeOnClickOutside: false,
	  content: el
	})
	.then((willDelete) => {
	  if (willDelete) {
	    
	    //$('form[name="registre"]').submit();
		  
		  $("#ocult").click();
	  } else {
	    
	  }
	});







});

