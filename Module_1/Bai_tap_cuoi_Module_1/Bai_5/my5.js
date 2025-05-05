let n = parseInt(prompt("Nhập vào một số nguyên dương có nhiều hơn 1 chữ số: "));

function findMaxNumber(n) {
    let str = n.toString();
    let max = 0;

    for (let i = 0; i < str.length; i++) {
        let newNumber = str.slice(0, i) + str.slice(i + 1);
        let maxNumber = parseInt(newNumber);

        if (maxNumber > max) {
            max = maxNumber;
        }
    }

    return max;
}

if (isNaN(n) || n > 9999) {
    alert("-1");

} else {
    let result = findMaxNumber(n);
    if (result !== 0) {
        alert("Số lớn nhất sau khi xóa 1 chữ số là: " + result);
    } else {
        alert("Không có số nào sau khi xóa 1 chữ số.");
    }
}
