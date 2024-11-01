
addEventListener("DOMContentLoaded", main);

var hourHand = null;
var minuteHand = null;
var secondHand = null;



function main() {

    hourHand = document.querySelector('#hourId');
    minuteHand = document.querySelector('#minuteId');
    secondHand = document.querySelector('#secondId');


    setClock();

    setInterval(setClock, 1000);
}


function setClock() {
    const currentDate = new Date();
    const secondsRatio = currentDate.getSeconds() / 60;
    const minutesRatio = (secondsRatio + currentDate.getMinutes()) / 60;
    const hoursRatio = (minutesRatio + currentDate.getHours()) / 12;

    setRotation(secondHand, secondsRatio);
    setRotation(minuteHand, minutesRatio);
    setRotation(hourHand, hoursRatio);
}

function setRotation(element, rotationRatio) {
    element.style.setProperty('--rotation', rotationRatio * 360);
}