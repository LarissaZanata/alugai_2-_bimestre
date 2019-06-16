var pacientes = document.querySelectorAll(".cliente");
var botao = document.querySelectorAll(".cliente");

var tabela = document.querySelector("#tabela-clientes");



tabela.addEventListener("dblclick", function(event) {
    event.target.parentNode.classList.add("fadeOut");

    if(funcao1()){
    setTimeout(function() {
        event.target.parentNode.remove();
    }, 500);
    }
});


function funcao1()
{
var x;
var r=confirm("Deseja realmente dar baixa nesse emprétimo?");
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