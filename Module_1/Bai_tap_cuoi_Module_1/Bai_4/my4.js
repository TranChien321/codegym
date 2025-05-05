const numerator = parseInt(prompt("Nhập tử số:"));
const denominator = parseInt(prompt("Nhập mẫu số:"));
if (denominator === 0) {
    alert("Mẫu số không được bằng 0");
} else if (numerator === 0) {
    alert("Tử số là 0 => bằng 0");
} else {
    function gcd(a, b) {
        if (b === 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    const greatestCommonDivisor = gcd(numerator, denominator);
    const reducedNumerator = numerator / greatestCommonDivisor;
    const reducedDenominator = denominator / greatestCommonDivisor;
    if (reducedNumerator % reducedDenominator === 0) {
        alert("Phân số đã rút gọn là: " + reducedNumerator / reducedDenominator);
    } else {
        alert("Phân số đã rút gọn là: " + reducedNumerator + "/" + reducedDenominator);
    }
}
