package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
/*		Member baron = new Member("Baron", "baron@example.com");
		System.out.println(baron);
		System.out.println(baron.toString());

		Administrator arron = new Administrator("Aaron", "aaron@example.com", "DEVELOPER");

		System.out.println(arron);
		System.out.println(arron.getName());
		System.out.println(arron.toString());
		//System.out.println(arron.name);

		int score =92;
		String result=(score>=90) ? "A학점" : "B학점";
		System.out.println("결과: "+result);

		int age = 30;
		double temperature = 36.6;
		boolean isOpen = false;

		System.out.println("나이: " + age);
		System.out.println("체온: " + temperature);
		System.out.println("영업 여부: " + isOpen);

		Administrator a = new Administrator("Aaron", "aaron@example.com", "DEVELOPER222");
		Member b = a;
		System.out.println(b.toString());

		Member c = new Administrator("Aaron", "aaron@example.com222");
		if (c instanceof Administrator) {
			Administrator d = (Administrator) c;
			System.out.println(d.toString());
		}

		int p=10;
		Integer r=Integer.valueOf(p);

		Integer re=null;
		int pp=(re != null) ? re.intValue() : 0;
		System.out.println(pp);

		Member[][] members={
				{new Member("a", "aa"), new Member("b", "bb")},
				{new Member("c", "cc"), new Member("d", "dd")},
				{new Member("e", "ee"), new Member("f", "ff")},
				{new Member("j", "jj"), new Member("i", "ii")},
				{new Member("k", "kk"), new Member("p", "pp")},
		};
		for (int i=0; i<members.length; i++){
			for (int j=0; j<members[i].length; j++){
				System.out.print(members[i][j]+"   ");
			}
			System.out.println();
		}*/

/*		Person person1 = new Person("Aaron", 10);
		System.out.println(person1);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.toString());

		Administrator am = new Administrator("name", 100, "DD");
		System.out.println(am);*/

/*		Integer a = 128;
		Integer b = 128;
		System.out.println(a == b);
		System.out.println(a.equals(b));*/

/*		Person person1 = new Person("Aaron", 10);
		Person person2 = new Person("Aaron", 330);
		System.out.println(person1.equals(person2));

		Administrator am = new Administrator("Aaron", 10, "DD");
		Administrator am2 = new Administrator("Aaron", 10, "DD");
		System.out.println(am.equals(am2));*/

/*		Member aaron = new Member();
		aaron.setName("Aaron");
		aaron.setEmail("aa@naver.com");
		Member baron = new Member();
		baron.setName("Baron");
		baron.setEmail("ba@naver.com");
		System.out.println(aaron);
		System.out.println(baron);*/

/*		MemberCreateRequestDto requestDto = new MemberCreateRequestDto("Baron", "Ba@naver.com");
		System.out.println(requestDto);

		Member baron = Member.from(requestDto);
		System.out.println(baron);*/

/*	Member.MemberBuilder builder = Member.builder(); // 빌더 정의
    builder
            .name("Aaron")
            .email("A@aa.com"); // 필드 설정
    Member aaron = builder.build(); // 객체 생성
    System.out.println(aaron);

    Member baron = Member.builder()
            .email("B@bb.com")
            .name("Baron")
            .build(); // 빌더 정의, 필드 설정, 객체 생성을 한 번에
    System.out.println(baron);*/

/*        Member aa = new Member(1, "aa", 200, "aa@aa.com");
        System.out.println(aa);

        Member bb = Member.builder()
                .name("bb")
                .email("bb@bb.com")
                .age(102)
                .build();
        System.out.println(bb);*/

/*        String request = "CC";

        // 템플릿할 공통 인자 작성하여 빌더 정의
        Member.MemberBuilder builder = Member.builder()
                .age(20)
                .email("example@codiet.com");

        // 조건을 통해 다른 필드 추가 작성
        if (request.equals("CC")){
            builder
                    .id(1)
                    .name("CC");
        }else{
            builder
                    .id(2)
                    .name("other");
        }

        // 객체 생성
        Member cc = builder.build();

        System.out.println(cc);*/

/*        Member aa = Member.builder()
                .name("wefa")
                .email("waefefa")
                .age(1231)
                .build();
        System.out.println(aa);*/

/*		Member baron = Member.builder()
                .name("Baron")
                .age(1200)
                .email("Ba@codeit.com")
                .favorite("book")
                .favorite("cook")
                .favorite("apple")
                .build();

        System.out.println(baron);*/

		Member m = new Member(12, "weaf", "awef", Collections.singletonList("awef"));
        System.out.println(m);
    }
}