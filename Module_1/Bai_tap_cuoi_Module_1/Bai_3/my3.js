function testArrayAscending() {
    const input = document.getElementById("inputArray").value;
    const arr = input.split("").map(Number);
    const result = isAscending(arr);
    document.getElementById("result").innerText = result;
}
function isAscending(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return "YES";
        }
    }
    return "NO";
}
