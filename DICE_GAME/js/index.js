// Player 1
var randomNumber1 = Math.floor(Math.random() * 6 ) + 1;
var randomImg1 = "images/dice" + randomNumber1 + ".png";

var img1 = document.querySelectorAll("img")[0];
img1.setAttribute("src",randomImg1);

// Player 2
var randomNumber2 = Math.floor(Math.random() * 6 ) + 1;
var randomImg2 = "images/dice" + randomNumber2 + ".png";
var img2 = document.querySelectorAll("img")[1];
img2.setAttribute("src",randomImg2);


// Player 3
var randomNumber3 = Math.floor(Math.random() * 6 ) + 1;
var randomImg3 = "images/dice" + randomNumber3 +".png";
var img3 = document.querySelectorAll("img")[2];
img3.setAttribute("src",randomImg3);




if(randomNumber1>randomNumber2)
{
    if(randomNumber1>randomNumber3){
        document.querySelector("h2").innerHTML="Players 1 Wins"
    }else{
        document.querySelector("h2").innerHTML="Players 3 Wins"
          }
}else{
    if(randomNumber2>randomNumber3)
    {
        document.querySelector("h2").innerHTML="Players 2 Wins"
    }
    else{
        document.querySelector("h2").innerHTML="Players 3 Wins"
    }
}
