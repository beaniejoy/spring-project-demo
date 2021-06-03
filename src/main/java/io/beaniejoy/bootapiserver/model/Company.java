package io.beaniejoy.bootapiserver.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

// Entity 정의한 Class에는 Default Constructor & All Arguments Constructor 둘다 있어야한다.
// 그래야 default mapper mapping이 가능하다.
@Getter
@RequiredArgsConstructor
public class Company {
    private Long id;

    private final String companyName;

    private final String companyAddress;

    private List<Employee> employeeList;

}
