var pacientes = document.querySelectorAll(".reserva");
var botao = document.querySelectorAll(".reserva");

var tabela = document.querySelector("#tabela-reserva");

tabela.addEventListener("dblclick", function(event) {
    event.target.parentNode.classList.add("fadeOut");

    setTimeout(function() {
        event.target.parentNode.remove();
    }, 500);

});


