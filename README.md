# MyBatis

## Run MySQL (by using Docker)

```shell
## mysql:latest pulling
$ docker pull mysql
## check mysql image
$ docker images
## image > container
$ docker run -d -p 3306:3306 
  -e MYSQL_ROOT_PASSWORD=joybeanie 
  --name joybeanie-mysql mysql:latest 
  --character-set-server=utf8mb4 
  --collation-server=utf8mb4_unicode_ci
```

```shell
## set bash env
$ docker exec -it joybeanie-mysql bash
# mysql -u root -p
mysql> SHOW DATABASES; 
```

## MyBatis

### Method Mapping

```java
@Insert("INSERT INTO company(company_name, company_address) VALUES(#{company.name}, #{company.address})")
@Options(useGeneratedKeys = true, keyProperty = "id")
int insert(@Param("company") Company company);
```
Insert 쿼리 수행 후 `auto_increment`된 id값을 전달받아 파라미터로 받아온 Company 객체에 넣어준다.

```java
@Select("SELECT * FROM company")
@Results(id = "CompanyMap", value = {
        @Result(property = "id", column = "id", id = true),
        @Result(property = "name", column = "company_name"),
        @Result(property = "address", column = "company_address"),
        @Result(property = "employeeList",
                column = "id",
                many = @Many(select = "io.beaniejoy.bootapiserver.mapper.EmployeeMapper.getByCompanyId")
        )
})
List<Company> getAll();
```
OneToMany로 Join된 테이블 조회 시 위와 같이 many에 서브쿼리로 실행될 mapper 메서드를 지정해준다.
이 때 column으로 지정한 칼럼이 매개인자로 서브쿼리에 전달된다.

```java
@ResultMap("CompanyMap")
```
위에서 `@Results`에서 설정된 id와 같으면 지정한 설정내용을 그대로 가져올 수 있다.