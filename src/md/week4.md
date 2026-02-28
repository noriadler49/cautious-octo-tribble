# Tuần 4: Kiểm thử Hiệu năng với JMeter

---

## 1. Website được kiểm thử

**URL:** vnexpress.net  

---

## 2. Công cụ sử dụng

| Công cụ | Phiên bản |
|---|---|
| Apache JMeter | 5.6.3 |
| Java | 21 |

---

## 3. Kịch bản kiểm thử

### Thread Group 1 – Kịch bản cơ bản

| Tham số | Giá trị |
|---|---|
| Số lượng người dùng (Threads) | 10 |
| Loop Count | 5 |
| Hành vi | HTTP GET đến trang chủ `/` |

**Screenshot:**  
![Summary Report TG1](src\images\jmeter_1.png)

---

### Thread Group 2 – Kịch bản tải nặng

| Tham số | Giá trị |
|---|---|
| Số lượng người dùng (Threads) | 50 |
| Ramp-up Period | 30 giây |
| Loop Count | 1 |
| Hành vi | HTTP GET đến trang chủ `/` và trang con `/giai-tri` |

**Screenshot:**  
![Summary Report TG2](src\images\jmeter_2.png)

---

### Thread Group 3 – Kịch bản tùy chỉnh

| Tham số | Giá trị |
|---|---|
| Số lượng người dùng (Threads) | 20 |
| Thời gian chạy (Duration) | 60 giây |
| Hành vi | HTTP GET đến trang chủ `/` |

**Screenshot:**  
![Summary Report TG3](src\images\jmeter_3.png)

## 6. Tài liệu đính kèm

- [File JMeter Test Plan](src\jmeter\Assignment_vnexpress.jmx)
