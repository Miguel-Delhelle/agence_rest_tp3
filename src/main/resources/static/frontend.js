
var listeHotel = document.getElementById("listeHotel");
var buttonShowHotel = document.getElementById("afficherAllHotel");
    
buttonShowHotel.addEventListener("click",displayHotel);

async function displayHotel(){
    
    let response = await fetch("http://localhost:8081/Agency/AllHotel")

	let dataHotel = await response.json();
	
	dataHotel.forEach(
		hotel => {
			let hotelDiv = document.createElement("div");
			hotelDiv.classList.add("box");
			let titre = document.createElement("h3");
			titre.textContent = hotel.nom;
			hotelDiv.appendChild(titre);
			
			let ulListe = document.createElement("ul");
			let elementListe = document.createElement("li");
			elementListe.textContent = "Ville: "+ hotel.adresse.ville;  
			ulListe.appendChild(elementListe);
			
			hotelDiv.appendChild(ulListe);
			
			listeHotel.appendChild(hotelDiv);
			
		});
    		
}

