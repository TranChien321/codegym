function amicableNumbers(a, b) {
    function sumOfDivisors(n) {
        let sum = 0;
        for (let i = 1; i <= n / 2; i++) {
            if (n % i === 0) {
                sum += i;
            }
        }
        return sum;
    }

    const sumA = sumOfDivisors(a);
    const sumB = sumOfDivisors(b);

    return (sumA === b && sumB === a);
}

const num1 = parseInt(prompt("Nhập số thứ 1:"));
const num2 = parseInt(prompt("Nhập số thứ 2:"));

if (isNaN(num1) || isNaN(num2)) {
    alert("Kiểm tra lại đầu vào");
} else {
    if (amicableNumbers(num1, num2)) {
        alert(num1 + " và " + num2 + " là cặp số thân thiết " + "- True ");
    } else {
        alert(num1 + " và " + num2 + " Không phải là cặp số thân thiết " + "- False ");
    }
}