function search(){
let message ="";
let currentYear = new Date();

let year = currentYear.getFullYear();
let ageMale = +document.getElementById('ageMale').value;
let ageFemale =  +document.getElementById('ageFemale').value ;
let ageNegativeMale = ageMale + 1;
let ageNegativeFemale = ageFemale + 1;

    document.getElementById('resultMale').innerHTML = "Tuổi âm của bạn Nam"+ " "+ ageNegativeMale;
    document.getElementById('resultFamale').innerHTML = "Tuổi âm của bạn Nữ"+ " " + ageNegativeFemale;
}


