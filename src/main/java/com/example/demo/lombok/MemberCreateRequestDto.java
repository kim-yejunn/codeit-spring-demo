package com.example.demo.lombok;

import lombok.*;
import lombok.experimental.FieldDefaults;

@ToString
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MemberCreateRequestDto {
    String name;
    String email;
}
