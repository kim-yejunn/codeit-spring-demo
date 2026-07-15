package com.example.demo;

import com.example.demo.i0708.Hero;
import lombok.*;
import lombok.experimental.FieldDefaults;

@ToString
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Player {
    int id;
    String name;
    Side side;
    int kill;
    int assist;
    int death;
    Hero pickedHero;
}
