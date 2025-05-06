let listStudent = [
    ['012', 'Phùng Khánh Linh', '01/01/2004', 'Nữ', 'USSH112', 'https://hthaostudio.com/wp-content/uploads/2022/09/Anh-tot-nghiep-2-min.jpg.webp'],
    ['013', 'Nguyễn Thu Trang', '02/02/2004', 'Nữ', 'USSH113', 'https://icdn.dantri.com.vn/thumb_w/1280/2019/09/28/hot-girl-dh-ngoai-thuong-dep-diu-dang-trong-anh-ky-yeu-thoi-sinh-viendocx-1569676201922.jpeg'],
    ['014', 'Phạm Thu Phương', '03/03/2004', 'Nữ', 'USSH114', 'https://cdn-i.vtcnews.vn/files/ctv.giaoduc/2018/11/19/1-17-0900122.jpg'],
];

function showStudentList() {
    let html = "";
    listStudent.forEach((item, index) => {
        html += `<tr>
            <td>${item[0]}</td>
            <td>${item[1]}</td>
            <td>${item[2]}</td>
            <td>${item[3]}</td>
            <td>${item[4]}</td>
            <td><img src="${item[5]}" alt="Student Image" width="200" height="200"></td>
            <td><button onclick="editStudent(${index})">Edit</button></td>
            <td><button onclick="deleteStudent(${index})">Xóa</button></td>
        </tr>`;
    });
    document.getElementById("container-student").innerHTML = html;
}

showStudentList();

function deleteStudent(index) {
    if (confirm("Bạn có chắc chắn muốn xóa không?")) {
        listStudent.splice(index, 1);
        showStudentList();
    }
}

function editStudent(index) {
    let id = prompt("Nhập mã học viên", listStudent[index][0]);
    let name = prompt("Nhập tên học viên", listStudent[index][1]);
    let date = prompt("Nhập ngày sinh", listStudent[index][2]);
    let gender = prompt("Nhập giới tính", listStudent[index][3]);
    let className = prompt("Nhập tên lớp học", listStudent[index][4]);
    let image = prompt("Nhập đường dẫn ảnh", listStudent[index][5]);

    if (id === "" || name === "" || date === "" || gender === "" || className === "") {
        alert("Không được để trống thông tin");
        return;
    }
    if (name.length > 50) {
        alert("Tên học viên không được quá 50 ký tự");
        return;
    }
    if (!date.match(/^(0[1-9]|[12]\d|3[01])\/(0[1-9]|1[0-2])\/\d{4}$/)) {
        alert("Ngày sinh phải đúng định dạng dd/MM/yyyy");
        return;
    }
    if (!/^https?:\/\/.+\.(jpg|jpeg|png|webp)$/.test(image) && !/^images\/.+\.(jpg|jpeg|png|webp)$/.test(image)) {
        alert("Đường dẫn ảnh không đúng định dạng hợp lệ");
        return;
    }
    listStudent[index] = [id, name, date, gender, className, image];
    alert("Sửa thông tin thành công");
    showStudentList();
}

function addStudent() {
    let id = document.getElementById("id").value;
    let name = document.getElementById("name").value;
    let date = document.getElementById("date").value;
    let gender = document.getElementById("gender").value;
    let className = document.getElementById("className").value;
    let fileInput = document.getElementById("image");

    if (!fileInput.files[0]) {
        alert("Vui lòng chọn ảnh.");
        return;
    }

    let image = URL.createObjectURL(fileInput.files[0]);

    if (id === "" || name === "" || date === "" || gender === "" || className === "") {
        alert("Không được để trống thông tin");
        return;
    }

    if (name.length > 50) {
        alert("Tên học viên không được quá 50 ký tự");
        return;
    }

    if (!date.match(/^(0[1-9]|[12]\d|3[01])\/(0[1-9]|1[0-2])\/\d{4}$/)) {
        alert("Ngày sinh phải đúng định dạng dd/MM/yyyy");
        return;
    }

    listStudent.push([id, name, date, gender, className, image]);
    alert("Thêm thông tin thành công");
    showStudentList();
}
