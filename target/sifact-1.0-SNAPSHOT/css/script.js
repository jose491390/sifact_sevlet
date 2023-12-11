const btnRegistarUsuario = document.getElementById('btnGestionUsuarios');
const btnCerrarRP = document.getElementById('btncarrerregitroP');
var contenedorGestionUsuario = document.querySelector('.RegistroUsuarios');
var contenedorListaUsuarios = document.querySelector('.formularioTablaEmpleados');

btnRegistarUsuario.addEventListener('click', function(event){
    event.preventDefault();

    contenedorGestionUsuario.style.display = 'block';
    contenedorListaUsuarios.style.display = 'none';
});

btnCerrarRP.addEventListener('click', function(event){
    event.preventDefault();

    contenedorGestionUsuario.style.display = 'none';
    contenedorListaUsuarios.style.display = 'block';
});
