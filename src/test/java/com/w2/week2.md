#### Yêu cầu kỹ thuật
- Validate điểm đầu vào (0 ≤ điểm ≤ 10)
- Xử lý danh sách rỗng và null
- Viết unit test với JUnit 5
- Code coverage đầy đủ các edge cases

#### Cấu trúc thư mục
```
src/
├── main/java/com/w1/
│   └── StudentAnalyzer.java      # Logic chính
└── test/java/com/w1/
    └── StudentAnalyzerTest.java  # Unit tests
pom.xml                            # Maven configuration
```

#### Cách chạy chương 

**Compile project:**
```bash
mvn clean compile
```

**Chạy tests:**
```bash
mvn test
```

**Kết quả mong đợi:**
```
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

#### Test Cases

**Test 1: Count Excellent Students**
- Input: `[9.0, 8.5, 7.0, 11.0, -1.0]`
- Valid scores: `[9.0, 8.5, 7.0]`
- Excellent scores (≥8): `[9.0, 8.5]`
- Expected: `2`

**Test 2: Calculate Valid Average**
- Input: `[9.0, 8.5, 7.0, 11.0, -1.0]`
- Valid scores: `[9.0, 8.5, 7.0]`
- Calculation: `(9.0 + 8.5 + 7.0) / 3 = 8.166...`
- Expected: `8.17` (±0.01)

**Test 3: Empty List**
- Input: `[]`
- Expected count: `0`
- Expected average: `0.0`

#### Kết quả thực hiện
- 2/2 test cases passed
- Logic xử lý điểm hợp lệ đúng
- Xử lý edge cases (empty list, invalid scores)

#### Dependencies
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.1</version>
    <scope>test</scope>
</dependency>
```

---

## Ghi chú
- Unit tests sử dụng JUnit 5 và Maven