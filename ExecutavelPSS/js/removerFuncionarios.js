var pacientes = document.querySelectorAll(".funcionario");
var botao = document.querySelectorAll(".funcionario");

var tabela = document.querySelector("#tabela-funcionarios");


function funcao1()
{
var x;
var r=confirm("Deseja realmente excluir o Funcionário!?");
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




