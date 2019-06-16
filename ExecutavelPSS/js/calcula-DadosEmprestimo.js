
var modal = document.getElementById("myModal");

var btn = document.getElementById("baixar_emprestimoMulta");


var span = document.getElementsByClassName("close")[0];


btn.onclick = function() {
  modal.style.display = "block";
}


span.onclick = function() {
  modal.style.display = "none";
}

window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}



function recebeMulta(){
    var rebebeuMulta = document.querySelector(".recebe-multa");
    var itemSelecionado = rebebeuMulta.options[rebebeuMulta.selectedIndex].textt;

    var multaCliente = cliente.querySelector(".info-multa");
    multaCliente.textContent = itemSelecionado; 
}







