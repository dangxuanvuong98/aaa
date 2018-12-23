------ HƯỚNG DẪN CÀI CẮM ------
1. STS - Spring Tool Suite - (phát triển trên Eclipse, và tích hợp các tool dành cho Spring) - cần cái này để chạy Run as Spring Boot App
https://spring.io/tools3/sts/all

2. Neo4j Desktop
https://neo4j.com/download/

3. Git
https://github.com/dinhhoangnam998/aaa/commits/master

4. Import Project 
 - mở STS 
 - File -> Import -> Existing Maven Project
 - Chờ một chút để Maven tải các thư viện về
--> tranh thủ tạo database

5. Tạo database
 - Bật Neo4j Desktop và tạo 1 db rỗng với password là "password"
 - Để ý cái HTTP port trong phần Manage --> copy vào phần cấu hình của project: tôi sẽ gửi ảnh lên sau cho dễ

6. chuột phải vào project -> chọn Run as -> Spring Boot App

chờ, chắc mất 1p

-- có thể trong quá trình cài gặp 1 số vấn đề, cứ inbox lên rồi t giải đáp nhé


------	 HƯỚNG DẪN MỘT CHÚT VỀ HỆ THỐNG -------

Hệ thống được chia là làm 4 gói chính: (+2 file)
# 4 Gói:
- <model> -- mô hình hóa dữ liệu, gồm 2 gói nhỏ:
 + entity: là các thực thể
 + relation: là các quan hệ

- <generator> -- đảm bảo nhiệm vụ sinh ngẫu nhiên dữ liệu, cũng gồm 2 gói nhỏ tương tự

- <repository>  -- thực hiện mọi truy vấn, bất kể truy vấn gì, thằng này cực khỏe, cái hay là mình không cần viết Cypher query, 

<service> -- các dịch vụ cung cấp cho người dùng
 + InitDb --> có nhiệm vụ lấy dữ liệu từ người dùng vào khởi tạo db theo yêu cầu
  * cụ thể: yêu cầu người dùng nhập: Muốn bao nhiêu thực thể mỗi loại, cụ thể:
   . muốn sinh bao nhiêu thực thể Person
   . muốn sinh bao nhiêu thực thể Location
   . muốn sinh bao nhiêu thực thể Event
   ..., 

 và

   . muốn sinh bao nhiêu Quan hệ (tổng số lượng quan hệ thôi, không yêu cầu số lượng cho mỗi loại)
 + QueryService: chứa các hàm truy vấn, cho người dùng lựa chọn và trả về kết quả

 + StatisticService: mới đầu định để các thứ liên quan đến thống kê ở đây, nhưng mà hình như k cần :v


# 2 file:
+ OopProAppEntry --> tương tự file main, đây là nơi chạy chương trình của mình
+ OopProApplication  --> file của Spring Boot, dùng để cấu hình hệ thống...


