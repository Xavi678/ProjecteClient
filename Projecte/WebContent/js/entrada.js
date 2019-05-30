/**
 * 
 */

$(document).ready(function () {
    
	hastr();
	 $('[data-toggle="tooltip"]').tooltip();  
   $("button.btn-lg").click(function () { 
       if($(this).hasClass("btn btn-primary btn-circle btn-lg")){
            $(this).removeClass();
            $(this).addClass("btn btn-default btn-circle btn-lg");
            
            $("#tbody").append("<tr id="+this.id+"tr> <td>"+this.id.substring(0,1)+"</td> <td>"+this.id.substring(1,2)+"</td> <td class='preutd'>"+ Math.floor(Math.random()*(100-25+1)+25)+"€</td>   </tr>");
          
           //$("afegirButaques").append(" <input type='hidden' name='llistaids' value="+this.id.trim()+" id='afegirButaques_llistaids'/> ");
           //$("afegirButaques").append(" <input type='text' name='llistaids' value="+this.id.trim()+" id='afegirButaques_llistaids'/> ");
            $('<input>').attr({
                type: 'hidden',
                id: this.id+"input",
                name: 'llistaids',
                value: this.id.trim(),
                class: this.id
            }).appendTo('form');
            
      hastr();
       
       }else{
        $(this).removeClass();
        $(this).addClass("btn btn-primary btn-circle btn-lg");
        
      // $(this.id+"tr").remove();
        
        $("#"+this.id+"tr").remove();
        $('.'+this.id).remove();
       //$("#71input").remove();
       
       //  document.getElementById(this.id+"tr").remove();
      hastr();
       
       }
    })
       
    
    
   
   
    /*document.getElementById("afegirButaques").addEventListener(function(){
        var num= Math.floor(Math.random()*100);

        if(num>=0 && num<=30){
            return false;
        }else{
            return true;
        }
            
        }); 
       */
      
           
       /* $("#boto").click(function (e) { 
            //e.preventDefault();

            var num= Math.floor(Math.random()*100);

            if(num>=0 && num<=30){
                $("#afegirButaques").submit();
            }else{
              e.preventDefault();
            }
            
        });
       */
    
    $("#afegirButaques").submit(function (event) { 
        event.preventDefault();
       /* var num= Math.floor(Math.random()*100);
        if(num>=0 && num<=15){
            swal({
                title: "Error",
                text: "Hi ha hagut un error a l'hora de processar la teva sol·licitud, torna-ho a intentar",
                icon: "error",
                button: "D'acord",
              });
            return false;
        }else{
        	$(this).unbind('submit').submit(); 
        }
        //$(this).unbind('submit').submit(); 
        */
       var preus= document.getElementsByClassName("preutd");
       var suma=0;
       for(var i=0;i<preus.length;i++){
    	   suma=suma+parseInt(preus[i].innerText.replace("€",""));
    	   
       }
        
        
        swal({
        	  title: "Estàs segur?",
        	  text: "Has comprat "+$("#tbody tr").length+" entrades per un preu total: "+suma+" ",
        	  icon: "warning",
        	  buttons: true,
        	  dangerMode: true,
        	})
        	.then((willDelete) => {
        	  if (willDelete) {
        		var r=  Math.floor(Math.random() * 10)
        		  if(r==4 || r==7){
        			  swal({
        				  title: "Error",
        				  text: "Hi ha hagut un error a l'hora de processar la seva Sol·licitud, torna-ho a intentar",
        				  icon: "error",
        				  button: "D'acord",
        				  allowOutsideClick: false,
        				});
        			  return false;
        		  }
        		  $(this).unbind('submit').submit(); 
        	  } else {
        	    return false;
        	  }
        	});
    });
  

  
  
});


function hastr() {
	if($("#table tbody tr").length==0){
    	$("#comprar").attr("disabled", 'disabled');
    	
    }else{
    	$("#comprar").removeAttr("disabled");
    }
}
