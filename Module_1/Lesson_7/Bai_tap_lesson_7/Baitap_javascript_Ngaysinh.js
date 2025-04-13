function getAge(){
    let birthday = document.getElementById('birthday').value;
    let date = new Date(birthday);

//     get year

    let year = date.getFullYear();
    //  lay year cua  nam hien thi tu dong
    let currentYear = new Date();
    let currentMonth =  currentData.getFullYear();

    let age = 2825 - year;
    document.getElementById("result").innerHTML =" Năm nay bạn đã:" + age + " tuổi xuân xanh";
}