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

**Chi tiết:** Xem [week2.md](src\md\week2.md)

---

### Tuần 3: Cypress E2E Testing – SauceDemo
**Đề bài:** Thực hành kiểm thử End-to-End (E2E) cho ứng dụng web bằng **Cypress**, thông qua website demo https://www.saucedemo.com.

**Nội dung chính:**
- Kiểm thử chức năng đăng nhập (thành công & thất bại)
- Kiểm thử chức năng thêm sản phẩm vào giỏ hàng
- Kiểm thử chức năng sắp xếp sản phẩm theo 

**Chi tiết:** Xem [week3.md](src/md/week3.md)

---

### Tuần 4: Kiểm thử Hiệu năng với JMeter
**Đề bài:** Thực hành kiểm thử hiệu năng (Performance Testing) bằng **Apache JMeter** trên một trang web tự chọn.

**Nội dung chính:**
- Thiết kế 3 kịch bản kiểm thử (Thread Group) với các tham số khác nhau
- Thu thập và phân tích các chỉ số: Response Time, Throughput, Error Rate
- Đánh giá khả năng chịu tải của hệ thống

**Kịch bản kiểm thử:**
| Kịch bản | Threads | Cấu hình | Mục đích |
|---|---|---|---|
| Thread Group 1 | 10 | Loop: 5 | Kiểm thử cơ bản |
| Thread Group 2 | 50 | Ramp-up: 30s | Kiểm thử tải nặng |
| Thread Group 3 | 20 | Duration: 60s | Kiểm thử tùy chỉnh |

**Cấu trúc thư mục:**
```
jmeter/
├── test-plan.jmx
├── readme.md
├── results/
│   ├── results_tg1.csv
│   ├── results_tg2.csv
│   └── results_tg3.csv
└── screenshots/
    ├── tg1.png
    ├── tg2.png
    └── tg3.png
```

**Chi tiết:** Xem [week4.md](src/md/week4.md)

---
## Ghi chú
- Mỗi tuần sẽ có bài tập riêng với file markdown chi tiết
- Unit tests sử dụng JUnit 5
- Tuân thủ Java coding conventions