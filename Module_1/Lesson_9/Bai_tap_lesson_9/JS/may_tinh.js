function inputNumber(value) {
    document.getElementById("spreadsheet").value += value;
}
function inputAllowable(value) {
    const firstValue = document.getElementById("spreadsheet").value;
    document.getElementById("spreadsheet").value += value;
}
function deLete() {
    document.getElementById("spreadsheet").value = "";
}
function result(value) {
    let total = eval(document.getElementById("spreadsheet").value);
    document.getElementById("spreadsheet").value = total ;
}