var pacientes = document.querySelectorAll(".reserva");
var botao = document.querySelectorAll(".reserva");

var tabela = document.querySelector("#tabela-reserva");


function funcao1()
{
var x;
var r=confirm("Deseja realmente excluir essa Reserva?");
if (r==true)
  {
  x=true;
  }
else
  {
  x=false;
  }
return x;
}

tabela.addEventListener("dblclick", function(event) {
    event.target.parentNode.classList.add("fadeOut");

    if(funcao1()){
    setTimeout(function() {
        event.target.parentNode.remove();
    }, 500);
    }
});


