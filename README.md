# cautious-octo-tribble
Repository lưu trữ các bài thực hành môn SOFT4003 - Kiểm Thử Phần Mềm - Đinh Hoàng Phi - 23IT-GM - BIT230311

## Danh sách bài tập

### Tuần 1: Can't Unsee Challenge
- **File:** [`src/images/cantunsee.png`](src/images/cantunsee.png)
- **Mô tả:** Kết quả thực hiện bài kiểm tra Can't Unsee
- **Kỹ năng:** Nhận diện các lỗi UI/UX design

---

### Tuần 2: Student Analyzer - Unit Testing
**Đề bài:** Xây dựng chương trình phân tích điểm số học sinh với yêu cầu validate dữ liệu đầu vào và viết unit test.

**Yêu cầu:**
- JDK 17 trở lên
- Maven 3.6+

**Mô tả bài toán:**
Xây dựng lớp `StudentAnalyzer` với 2 phương thức chính:

1. **`countExcellentStudents(List<Double> scores)`**
   - Đếm số học sinh đạt loại Giỏi (điểm >= 8.0)
   - Bỏ qua điểm không hợp lệ (< 0 hoặc > 10)
   - Trả về 0 nếu danh sách rỗng

2. **`calculateValidAverage(List<Double> scores)`**
   - Tính điểm trung bình của các điểm hợp lệ (0-10)
   - Bỏ qua điểm không hợp lệ
   - Trả về 0.0 nếu không có điểm hợp lệ

**Chi tiết:** Xem [week2.md](src/test/java/com/w2/week2.md)

---

## Ghi chú
- Mỗi tuần sẽ có bài tập riêng với file markdown chi tiết
- Unit tests sử dụng JUnit 5
- Tuân thủ Java coding conventions