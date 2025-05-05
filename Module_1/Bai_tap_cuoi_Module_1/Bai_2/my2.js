const a = parseInt(prompt("Nhập cạnh a:"));
const b = parseInt(prompt("Nhập cạnh b:"));
const c = parseInt(prompt("Nhập cạnh c:"));
if (a <= 0 || b <= 0 || c <= 0) {
    alert("Các cạnh phải lớn hơn 0.");
}
if ( a + b > c && a + c > b && b + c > a) {
    if ( a == b && b == c && c == a) {
        alert(" Tam giác đều");
    }
    else if ( a == b || a == c || b == c) {
        alert("Tam giác cân");
    }
    else if ( a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
        alert("Tam giác vuông");
    }
    else {
        alert("Tam giác thường");
    }
}  else {
    alert("Ba cạnh không tạo thành một tam giác.");
}