   
function eliminar(id) {
	console.log(id);
	swal({
		  title: "¿Eliminar el anime?",
		  text: "¡Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/eliminar/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("Anime Eliminado, mi amigo otacu  ", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/";
		    	}
		    });
		  } 
		});
}

