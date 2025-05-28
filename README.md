# ITSS_Backend

Cách kết nối vs H2 db
- Run trên localhost:8080
- nhập URL = localhost:8080/h2console
- url=jdbc:h2:mem:testdb
  username=SA
pass: để trống
- Test connection, nếu oke thì connect.

**Cách tạo bảng mới db**
- Tạo 1 Entity, repository interface, service interface, service implement interface, controller tuương ứng
- Viết câu truy vấn Insert 
- https://www.baeldung.com/spring-boot-data-sql-and-schema-sql