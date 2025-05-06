let listBook = [
    ["12345", "Toán", "2000", "3", true],
    ["12346", "Lý", "1998", "4", true],
    ["12347", "Hóa", "1999", "5", true],
];

function showBookManagement() {
    let html = "";
    listBook.forEach((item, index) => {
        let status = item[4] ? "Còn sách" : "Hết sách";
        html += `<tr>
            <td>${item[0]}</td>
            <td>${item[1]}</td>
            <td>${item[2]}</td>
            <td>${item[3]}</td>
            <td>${status}</td>
        </tr>`;
    });
    document.getElementById("container-book").innerHTML = html;
}

showBookManagement();

function deleteBook() {
    let id = prompt("Nhập mã sách cần xóa");
    let index = listBook.findIndex(item => item[0] === id);
    if (index !== -1) {
        listBook.splice(index, 1);
        alert("Xóa sách thành công");
        showBookManagement();
    } else {
        alert("Sách không tồn tại");
    }
}

function addBookNew() {
    let id = prompt("Nhập mã sách");
    let name = prompt("Nhập tên sách");
    let author = prompt("Nhập tên tác giả");
    let year = prompt("Nhập năm xuất bản");

    for (let i = 0; i < listBook.length; i++) {
        if (listBook[i][0] === id) {
            alert("Mã sách đã tồn tại");
            return;
        }
    }
    if (year.length !== 4 || isNaN(year)) {
        alert("Năm xuất bản phải là 4 chữ số");
        return;
    }
    if (id === "" || name === "" || author === "" || year === "") {
        alert("Không được để trống thông tin");
        return;
    }

    listBook.push([id, name, author, year, true]);
    alert("Thêm sách thành công");
    showBookManagement();
}

function addBook() {
    let id = prompt("Nhập mã sách cần thêm");
    let index = listBook.findIndex(item => item[0] === id);
    if (index !== -1) {
        let quantity = prompt("Nhập số lượng sách cần thêm");
        if (isNaN(quantity) || quantity <= 0) {
            alert("Số lượng sách không hợp lệ");
            return;
        }
        listBook[index][3] = parseInt(listBook[index][3]) + parseInt(quantity);
        listBook[index][4] = true;
        alert("Thêm sách thành công");
        showBookManagement();
    } else {
        alert("Sách không tồn tại");
    }
}

function borrowBooks() {
    let id = prompt("Nhập mã sách cần mượn");
    let index = listBook.findIndex(item => item[0] === id);
    if (index !== -1) {
        let quantity = prompt("Nhập số sách cần mượn");
        if (isNaN(quantity) || quantity <= 0) {
            alert("Số lượng sách không hợp lệ");
            return;
        }
        listBook[index][3] = parseInt(listBook[index][3]) - parseInt(quantity);
        listBook[index][4] = remainingBooks - quantity > 0;
        alert("Mượn sách thành công");
        showBookManagement();
    } else {
        alert("Sách hiện đang không đủ số lượng");
    }
}

function showMostBooks() {
    let maxBooks = Math.max(...listBook.map(item => parseInt(item[3])));
    let mostBooks = listBook.filter(item => parseInt(item[3]) === maxBooks);
    let html = "";
    mostBooks.forEach((item) => {
        let status = item[4] ? "Còn sách" : "Hết sách";
        html += `<tr>
            <td>${item[0]}</td>
            <td>${item[1]}</td>
            <td>${item[2]}</td>
            <td>${item[3]}</td>
            <td>${status}</td>
        </tr>`;
    });
    document.getElementById("container-book").innerHTML = html;

}

