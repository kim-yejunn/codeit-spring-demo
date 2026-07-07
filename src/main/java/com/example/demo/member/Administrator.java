package com.example.demo.member;

import java.time.LocalDate;

public class Administrator extends Member{
    private String role;
    private LocalDate allocaledAt;

    public Administrator(){

    }

    public Administrator(String name, String email, String role){
        super(name, email);
        this.role = role;
        this.allocaledAt=LocalDate.now();
    }

    public Administrator(String aaron, String s) {
    }

    public String toString(){
        return String.format(
                "Member(id=%s, name=%s, age=%s, email=%s, role=%s, allocated=%s)",
                super.id, super.name, super.age, super.email, this.role, this.allocaledAt
        );
    }

    public String getRole() {
        return role;
    }
}
