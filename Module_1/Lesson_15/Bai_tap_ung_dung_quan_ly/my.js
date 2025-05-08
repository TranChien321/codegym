let listProduct = [
    ["Iphone 14", "2000$", "21"],
    ["Iphone 14 Pro", "3000$", "22"],
    ["Iphone 14 Pro Max", "4000$", "23"],
];


function displayListProduct() {
    let html = "";
    listProduct.forEach((item, index) => {
        html += `<tr>
            <td>${index + 1}</td>
            <td>${item[0]}</td>
            <td>${item[1]}</td>
            <td>${item[2]}</td>
            <td><button onclick="editProduct(${index})">Edit</button></td>
            <td><button onclick="deleteProduct(${index})">Xóa</button></td>
        </tr>`
    })
    document.getElementById("container-product").innerHTML = html;
}

displayListProduct();


function deleteProduct(index) {
    if (confirm("Bạn có chắc chắn muốn xóa không?")) {
        listProduct.splice(index, 1);
        displayListProduct();
    }
}


function editProduct(index) {
    let name = prompt("Nhập tên sản phẩm", listProduct[index][0]);
    let price = prompt("Nhập giá sản phẩm", listProduct[index][1]);
    let quantity = parseInt(prompt("Nhập số lượng sản phẩm", listProduct[index][2]));
    if (name && price && quantity) {
        listProduct[index] = [name, price, quantity];
        displayListProduct();
    }
}

function addProduct() {
    let name = document.getElementById("name").value;
    let price = "0$";
    let quantity = 0;
    if (name.value === "") {
        alert("Tên sản phẩm không được để trống");
        return;
    }
    listProduct.push([name,price,quantity]);
    alert("Thêm sản phẩm thành công");
    displayListProduct()
}
