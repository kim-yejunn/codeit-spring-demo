package com.example.demo;

import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Member baron = new Member("Baron", "baron@example.com");
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
		}
    }
}