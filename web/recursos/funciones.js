function validarForma(forma){
 //Pour valider   
  var usuario = forma.usuario;
  if (usuario.value === "" || usuario.value === "Escribir usuario"){
      alert("Debe proporcionar un nombre de usuario");
      usuario.focus();
      usuario.select();
      return false;
  
  }

// Validez le mot de passe
var password = forma.password;
    if (password.value === "" || password.value.length < 3){
        alert("Debes proporcionar un password al menos de 3 caracteres ");
         password.focus();
         password.select();
         return false;
     }
        
    //Validez les composant tenconlogies
   var tecnologias = forma.tecnologia;
   var checkSeleccionado = false;
   
            for ( i = 0; i < tecnologias.length; i++) {
                if(tecnologias[i].checked){
                    checkSeleccionado = true;
                }
            }
         if(checkSeleccionado){
             alert("Debe proporcional una tecnologia");
             return false;
         }
         
         // Validate le généreux
         var genero=forma.genero;
         var radioSeleccionado =  false;
         
            for ( i = 0; i < genero.length; i++) {
                if(genero[i].checked){
                    radioSeleccionado =true;
                }
            }
            if(!radioSeleccionado){
                 alert("Debe proporcional una genero");
             return false;
            }

//Validate le occupacion
         var occupacion = forma.ocupacion;
         if(occupacion.value === ""){
             alert("Debe proporcional una ocupacion");
             return false;
            }
         //formulaire validÉ
          alert("Formulario valido, enviando datos...");
          return true;
      }