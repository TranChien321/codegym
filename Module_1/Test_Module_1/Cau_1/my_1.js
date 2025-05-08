const n = parseInt(prompt("Nhập số phần tử của mảng:"));
const arr = [];

if (0 < n <= 50) {
    for (let i = 0; i < n; i++) {
        arr[i] = parseInt(prompt("Nhập phần tử thứ " + (i + 1) + "(là số nguyên dương):"));
    }
}
document.write("Mảng vừa nhập là: " + arr.join(", ") + "<br>");

let sum = 0;
let count = 0;
for (let i = 0; i < n; i++) {
    if (arr[i] % 2 !== 0 && i % 2 === 0) {
        sum += arr[i];
        count++;
    }
}

if (count > 0) {
    let average = sum / count;
    document.write("Trung bình cộng các số lẻ ở vị trí chẵn là: " + average);
} else {
    document.write("Không có số lẻ ở vị trí chẵn trong mảng.");
}