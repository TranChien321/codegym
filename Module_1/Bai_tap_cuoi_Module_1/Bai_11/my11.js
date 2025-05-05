let listStudent = [
    ['HV-0001', 'Nguyễn Văn A', 'C1022G1', 'nguyenvana@gmail.com', '01/01/2004'],
    ['HV-0002', 'Nguyễn Văn B', 'C1022G1', 'nguyenvanb@gmail.com', '02/02/2004'],
    ['HV-0003', 'Nguyễn Văn C', 'C1022G1', 'nguyenvanc@gmail.com', '03/03/2004'],
]

function showStudentList() {
    let html = "";
    listStudent.forEach((item, index) => {
        html += `<tr>
            <td>${item[0]}</td>
            <td>${item[1]}</td>
            <td>${item[2]}</td>
            <td>${item[3]}</td>
            <td>${item[4]}</td>
        </tr>`
    })
    document.getElementById("container-student").innerHTML = html;
}

showStudentList();

function addStudent() {
    let id = prompt("Nhập mã học viên");
    let name = prompt("Nhập tên học viên");
    let className = prompt("Nhập tên lớp học");
    let email = prompt("Nhập email");
    let date = prompt("Nhập ngày sinh");

    if (listStudent.some(item => item[0] === id)) {
        alert("Mã học viên đã tồn tại");
        return;
    }
    let idRegex = /^HV-\d{4}$/;
    if (!idRegex.test(id)) {
        alert("Mã học viên không đúng định dạng HV-XXXX (với XXXX là 4 chữ số).");
        return;
    }
    if (listStudent.some(item => item[3] === email)) {
        alert("Email đã tồn tại");
        return;
    }
    if (name.length > 50) {
        alert("Tên học viên không được quá 50 ký tự.");
        return;
    }
    if (id.value === "" || name.value === "" || className.value === "" || email.value === "" || date.value === "") {
        alert("Thông tin không được để trống");
        return;
    }
    let dateRegex = /^(0[1-9]|[12]\d|3[01])\/(0[1-9]|1[0-2])\/\d{4}$/;
    if (!dateRegex.test(date)) {
        alert("Ngày sinh phải đúng định dạng dd/MM/yyyy.");
        return;
    }
    listStudent.push([id, name, className, email, date]);
    alert("Thêm học viên thành công");
    showStudentList()
}

function deleteStudent() {
    let id = prompt("Nhập mã học viên cần xóa");
    let index = listStudent.findIndex(item => item[0] === id);
    if (index === -1) {
        alert("Không tìm thấy mã học viên");
        return;
    }
    if (confirm("Bạn có chắc chắn muốn xóa không?")) {
        listStudent.splice(index, 1);
        alert("Xóa học viên thành công");
        showStudentList();
    }
}

function editStudent() {
    let id = prompt("Nhập mã học viên cần sửa");
    let index = listStudent.findIndex(item => item[0] === id);
    if (index === -1) {
        alert("Không tìm thấy mã học viên");
        return;
    }
    let name = prompt("Nhập tên học viên", listStudent[index][1]);
    let className = prompt("Nhập tên lớp học", listStudent[index][2]);
    let email = prompt("Nhập email", listStudent[index][3]);
    let date = prompt("Nhập ngày sinh", listStudent[index][4]);
    if (listStudent.some(item => item[0] === id && item[1] === name)) {
        alert("Mã học viên đã tồn tại");
        return;
    }
    if (id.value === "" || name.value === "" || className.value === "" || email.value === "" || date.value === "") {
        alert("Thông tin không được để trống");
        return;
    }
    listStudent[index] = [id, name, className, email, date];
    alert("Sửa học viên thành công");
    showStudentList();
}