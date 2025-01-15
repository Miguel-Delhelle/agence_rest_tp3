// Tout les déclencheurs et id utilisé

var overlay = document.getElementById("overlay");
export var user = ""; // Grosse faille de sécurité en vrai mais.. bon 
export var userMail = "";
export var userIsConnected = false;


export function showModalLogin() {
    var loginModal = document.getElementById("modalLogin");
    loginModal.style.visibility = "visible";
    overlay.style.visibility = "visible";
}

export function showModalRegister() {
    var registerModal = document.getElementById("modalRegister");
    registerModal.style.visibility = "visible";
    overlay.style.visibility = "visible";
}

export async function userConnect(){
    var mail = document.getElementById("userNameInput").value;
    var passwordInput = document.getElementById("passwordInput").value;

    try{
    const response = await fetch("http://localhost:8888/loginUser",{
        method: "POST",
        headers:{"Content-Type": "application/json"},
        body: JSON.stringify({mail,passwordInput})
    })
    var data = await response.json();
        if (!response.ok){
            alert("connexion échoué !");
        }
        if(response.ok){
            let prenom = data.prenom;
            let nom = data.nom;
            user = prenom + " " + nom; 
            userMail = mail;
            userConnected();
        }
        else{
            console.error(error);
        }
        }catch(error){
            console.error(error);
        }
}

async function userConnected(){
    userIsConnected = true;
    let registerButton = document.getElementById("registerButton");
    let loginButton = document.getElementById("loginButton");
    registerButton.style.visibility="hidden";
    loginButton.style.visibility ="hidden";

    registerButton.style.display ="none";
    loginButton.style.display ="none";

    let userConnected = document.getElementById("userConnected");
    userConnected.textContent=user;

    let boutonActivity = document.getElementById("newActivityButton");
    boutonActivity.style.visibility ="visible";
    boutonActivity.style.display = "flex"

    let boutonTypeActivity = document.getElementById("newTypeActivityButton");
    boutonTypeActivity.style.visibility = "visible";
    boutonTypeActivity.style.display = "flex";

    console.log(user);

    /* change */
    let userConnectedDiv = document.getElementById("userConnectedDiv")
    userConnectedDiv.style.visibility = "visible";
    userConnectedDiv.style.display = "flex";
    /* change */
}

/* Inscription */

export async function userRegister(){
    var mail = document.getElementById("usernameRegisterInput").value;
    var passwordInput = document.getElementById("passwordRegisterInput").value;
    var lastName = document.getElementById("nameRegisterInput").value;
    var firstName = document.getElementById("firstNameRegisterInput").value;
    var phoneNumber = document.getElementById("phonenumberRegisterInput").value;
    var passwordConfirmedInput = document.getElementById("passwordRegisterInputConfirmation").value;

    if (passwordConfirmedInput != passwordInput){
        alert ("mot de passe différents");
        return null;
    }

    console.log(mail);

    try{
    const response = await fetch("http://localhost:8888/register",{
        method: "POST",
        headers:{"Content-Type": "application/json"},
        body: JSON.stringify({mail,passwordInput,phoneNumber,lastName,firstName})
    })
    var data = await response.json();
        if (!response.ok){
            alert("inscription échoué !");
        }
        else{
            alert ("inscription réussi !");
            user = firstName+" "+lastName;
            userMail = mail;
            userConnected();
        }
    }catch(error){
        console.error(error);
    }
}