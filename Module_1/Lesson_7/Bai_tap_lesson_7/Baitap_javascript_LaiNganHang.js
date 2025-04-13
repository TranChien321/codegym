function getMoney() {
    let money = +document.getElementById('money').value;
    let mounth = +document.getElementById('mounth').value;
    let total = money+ money * mounth *7/(100*12);

    document.getElementById('result').innerHTML = total;
}