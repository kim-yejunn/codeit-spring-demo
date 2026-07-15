package com.example.demo.studentmanagement;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
@RequiredArgsConstructor
@ToString(includeFieldNames = false)
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Person {
    int id;
    String name;
    int age;
}
