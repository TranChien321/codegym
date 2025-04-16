function changeImageOne() {
    let imgOne= document.getElementById("img-1");
    let currentImage= imgOne.getAttribute("src");
    if(currentImage === "Imge/funny-cat1_part1x1.jpg"){
        imgOne.setAttribute("src","Imge/monkey_part1x1.jpg");
    } else if(currentImage === "Imge/monkey_part1x1.jpg"){
        imgOne.setAttribute("src","Imge/panda_swap_part1x1.jpg");
    } else{
        imgOne.setAttribute("src","Imge/funny-cat1_part1x1.jpg");
    }
}

function changeImageTwo() {
    let imgTwo= document.getElementById("img-2");
    let currentImage= imgTwo.getAttribute("src");
    if(currentImage === "Imge/funny-cat1_part2x1.jpg"){
        imgTwo.setAttribute("src","Imge/monkey_part2x1.jpg");
    } else if(currentImage === "Imge/monkey_part2x1.jpg"){
        imgTwo.setAttribute("src","Imge/panda_swap_part2x1.jpg");
    } else{
        imgTwo.setAttribute("src","Imge/funny-cat1_part2x1.jpg");
    }
}
function changeImageThree() {
    let imgThree= document.getElementById("img-3");
    let currentImage= imgThree.getAttribute("src");
    if(currentImage === "Imge/funny-cat1_part3x1.jpg"){
        imgThree.setAttribute("src","Imge/monkey_part3x1.jpg");
    } else if(currentImage === "Imge/monkey_part3x1.jpg"){
        imgThree.setAttribute("src","Imge/panda_swap_part3x1.jpg");
    } else{
        imgThree.setAttribute("src","Imge/funny-cat1_part3x1.jpg");
    }
}
function changeImageFour() {
    let imgFour= document.getElementById("img-4");
    let currentImage= imgFour.getAttribute("src");
    if(currentImage === "Imge/funny-cat1_part4x1.jpg"){
        imgFour.setAttribute("src","Imge/monkey_part4x1.jpg");
    } else if(currentImage === "Imge/monkey_part4x1.jpg"){
        imgFour.setAttribute("src","Imge/panda_swap_part4x1.jpg");
    } else{
        imgFour.setAttribute("src","Imge/ funny-cat1_part4x1.jpg");
    }
}
function changeImageFive() {
    let imgFive= document.getElementById("img-5");
    let currentImage= imgFive.getAttribute("src");
    if(currentImage === "Imge/funny-cat1_part5x1.jpg"){
        imgFive.setAttribute("src","Imge/monkey_part5x1.jpg");
    } else if(currentImage === "Imge/monkey_part5x1.jpg"){
        imgFive.setAttribute("src","Imge/panda_swap_part5x1.jpg");
    } else{
        imgFive.setAttribute("src","Imge/ funny-cat1_part5x1.jpg");
    }
}