# Transaction Test

```java
@Transactional
public void test1() {
    test2();
}
public void test2() {
    //...
}
```
상위 클래스에 transaction 설정되어있으면 하위로 전이 가능  
(반대는 안된다. transaction 기능이 아예 상실)

