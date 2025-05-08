function searchWords() {
    const wordsEnglish = ["Hello", "Good Moning", "Good Afternoon", "Good Evening", "Good Night", "Goodbye", "See you later", "Thank you", "Please", "Excuse me"];
    const wordsVietnamese = ["Xin chào", "Chào buổi sáng", "Chào buổi chiều", "Chào buổi tối", "Chúc ngủ ngon", "Tạm biệt", "Hẹn gặp lại", "Cảm ơn bạn", "Làm ơn", "Xin lỗi"];
    let result = document.getElementById("result");
    const inputWords = document.getElementById("inputWords").value;
    console.log(inputWords);
    for (let i = 0; i <= wordsEnglish.length; i++) {
        if (inputWords === wordsEnglish[i]) {
            result.innerHTML = wordsVietnamese[i];
            break;
        } else {
            result.innerHTML = "Không tìm thấy từ này";
        }
    }
}