#### Các test case đã thực hiện:
- Đăng nhập thành công với tài khoản hợp lệ
- Hiển thị thông báo lỗi khi đăng nhập sai
- Thêm sản phẩm vào giỏ hàng
- Sắp xếp sản phẩm theo giá tăng dần (Price low to high)

#### Công cụ & kỹ thuật:
- Cypress
- End-to-End Testing
- Test isolation với `beforeEach`
- Kiểm thử UI dựa trên hành vi người dùng

#### Cấu trúc thư mục:
```
cypress/
 └── e2e/
     ├── login_spec.cy.js
     └── cart_spec.cy.js
cypress.config.js
```

## 1. Mục tiêu
- Làm quen với **Cypress** – công cụ kiểm thử End-to-End (E2E)
- Viết các test case mô phỏng hành vi người dùng trên ứng dụng web
- Kiểm thử các chức năng chính của website https://www.saucedemo.com
- Áp dụng kiến thức về **UI Testing** và **E2E Testing**

## 2. Công cụ & Công nghệ sử dụng
- **Node.js** (>= 16)
- **Cypress**
- Trình duyệt Chrome
- Website test: https://www.saucedemo.com

---

## 3. Các kịch bản kiểm thử đã thực hiện

### Kịch bản 1: Kiểm tra đăng nhập thành công

**Mục tiêu:**  
Xác minh người dùng có thể đăng nhập thành công khi sử dụng thông tin hợp lệ.

**Dữ liệu kiểm thử:**
- Username: `standard_user`
- Password: `secret_sauce`

**Các bước thực hiện:**
1. Truy cập trang https://www.saucedemo.com
2. Nhập username và password hợp lệ
3. Nhấn nút **Login**

**Kết quả mong đợi:**
- Đăng nhập thành công
- Trang được chuyển hướng sang danh sách sản phẩm
- URL chứa `/inventory.html`

**File kiểm thử:**  
[login_spec.cy.js](cypress-exercise/cypress/e2e/login_spec.cy.js)

---

### Kịch bản 2: Kiểm tra đăng nhập thất bại

**Mục tiêu:**  
Kiểm tra hệ thống xử lý đúng khi người dùng đăng nhập với thông tin không hợp lệ.

**Dữ liệu kiểm thử:**
- Username: `invalid_user`
- Password: `wrong_password`

**Các bước thực hiện:**
1. Truy cập trang https://www.saucedemo.com
2. Nhập username và password không hợp lệ
3. Nhấn nút **Login**

**Kết quả mong đợi:**
- Người dùng không đăng nhập được
- Hiển thị thông báo lỗi:
  > *Username and password do not match*

**File kiểm thử:**  
[login_spec.cy.js](cypress-exercise/cypress/e2e/login_spec.cy.js)

---

### Kịch bản 3: Kiểm tra chức năng thêm sản phẩm vào giỏ hàng

**Mục tiêu:**  
Xác minh người dùng có thể thêm sản phẩm vào giỏ hàng sau khi đăng nhập thành công.

**Điều kiện tiên quyết:**  
- Người dùng đã đăng nhập với tài khoản hợp lệ

**Các bước thực hiện:**
1. Đăng nhập vào hệ thống với tài khoản `standard_user`
2. Tại trang danh sách sản phẩm, chọn sản phẩm đầu tiên
3. Nhấn nút **Add to cart**

**Kết quả mong đợi:**
- Sản phẩm được thêm vào giỏ hàng
- Biểu tượng giỏ hàng hiển thị số lượng là **1**

**File kiểm thử:**  
[cart_spec.cy.js](cypress-exercise/cypress/e2e/cart_spec.cy.js)

---

### Kịch bản 4: Kiểm tra chức năng sắp xếp sản phẩm theo giá tăng dần  
*(Price – Low to High)*

**Mục tiêu:**  
Đảm bảo chức năng sắp xếp sản phẩm theo giá tăng dần hoạt động đúng.

**Điều kiện tiên quyết:**  
- Người dùng đã đăng nhập thành công

**Các bước thực hiện:**
1. Truy cập trang danh sách sản phẩm
2. Chọn bộ lọc **Price (low to high)** từ dropdown
3. Quan sát thứ tự các sản phẩm sau khi sắp xếp

**Kết quả mong đợi:**
- Danh sách sản phẩm được sắp xếp theo giá tăng dần
- Sản phẩm đầu tiên có giá thấp nhất (`$7.99`)

**File kiểm thử:**  
[cart_spec.cy.js](cypress-exercise/cypress/e2e/cart_spec.cy.js)

---

## 4. Đánh giá kết quả
- Tất cả các test case đều thực thi thành công
- Các chức năng chính của hệ thống hoạt động đúng theo mong đợi
- Cypress hỗ trợ tốt cho việc kiểm thử UI và luồng người dùng

---

## Ghi chú: 
Phần ảnh lưu trữ tại: src\images