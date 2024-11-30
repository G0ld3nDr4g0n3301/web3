
let ctx;
const img = new Image();
let canvas;
let r = 3;

document.addEventListener("DOMContentLoaded",(e) => {
   canvas = document.getElementById("graphCanvas");
   ctx = canvas.getContext("2d");

   img.src = "../resources/images/graph.png";
   img.addEventListener("load", function () {
       ctx.drawImage(img, 0, 0, canvas.width, canvas.height);
   });

   canvas.addEventListener("click", (e) => {
       console.log(e.offsetX, e.offsetY);
       let {x, y} = coordsAbsoluteToDecart(e.offsetX, e.offsetY,r);
       drawDot(e.offsetX, e.offsetY, r, undefined, false);
       checkDot(x,y);
   });

});

window.coordsAbsoluteToDecart = function coordsAbsoluteToDecart(x,y,r){
    return {x: (x - canvas.width / 2)*r/250, y: (canvas.height / 2 - y)*r/250};
}

window.coordsDecartToAbsolute = function coordsDecartToAbsolute(src_x,src_y,r) {
    let x = (src_x*250/r + canvas.width / 2);
    let y = (-(src_y*250/r - canvas.height / 2));
    return {x: x, y: y};
}

window.clearDots = function clearDots() {
    ctx.clearRect(0,0,canvas.width, canvas.height);
    ctx.drawImage(img,0,0,canvas.width,canvas.height);
}


window.checkDot = function checkDot(x,y){
    $("#graph-form\\:xGraphValue").val(x);
    $("#graph-form\\:yGraphValue").val(y);
    $("#graph-form\\:handleClick").click();
}


window.drawDot = function drawDot(src_x,src_y, r, result, isDecart) {
    let x,y;
    if(isDecart === true){
        ({x,y} = coordsDecartToAbsolute(src_x,src_y,r));
    } else {
        x = src_x;
        y = src_y;
    }
    ctx.fillStyle = result === undefined ? "grey" : result ? "green" : "red";
    ctx.beginPath();
    ctx.arc(x, y, 5, 0, Math.PI * 2);
    ctx.fill();
}


window.clickOnClearBtn = function clickOnClearBtn(){
    $("#clear-points\\:clearPoints").click();
}

