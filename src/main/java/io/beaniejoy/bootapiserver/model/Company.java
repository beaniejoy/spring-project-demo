package io.beaniejoy.bootapiserver.model;

import lombok.*;

import java.util.List;

// Entity 정의한 Class에는 Default Constructor & All Arguments Constructor 둘다 있어야한다.
// 그래야 default mapper mapping이 가능하다.
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private Long id;

    private String companyName;

    private String companyAddress;

    private List<Employee> employeeList;

    public void updateInfo(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }
}
