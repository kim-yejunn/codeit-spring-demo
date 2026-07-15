package com.example.demo;

import com.example.demo.studentmanagement.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

/*    private static final Map<Integer, Person> people = new HashMap<>(){
        {
            put(1, new Person(1, "Aaron", 10));
            put(2, new Person(2, "Baron", 12));
            put(3, new Person(3, "Caron", 15));
            put(4, new Person(4, "Daron", 17));
            put(5, new Person(5, "Earon", 21));
        }
    };

    private static Optional<Person> retrieve(int id){
        // Optional 사용 시 내부에 값이 "있는" 상태
        Person retrieved = people.get(id);

        return Optional.ofNullable(retrieved);
    }*/

    public static void main(String[] args) {


/*        Optional<Person> optionalExist = retrieve(1);
        System.out.println(optionalExist);*/


/*        OrderController orderController = new OrderController(
                new OrderService(new OrderRepository()),
                new PaymentService(new OrderRepository()),
                new DeliveryService(new OrderRepository())
        );
        orderController.process();*/

/*        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while(run) {
            System.out.println("\\n=== 메뉴 ===");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 보기");
            System.out.println("4. 학생 점수 조회");
            System.out.println("5. 종료");
            System.out.println("선택: ");

            int menu = sc.nextInt();
            sc.nextLine(); // 버퍼 제거

            switch (menu) {
                case 1:
                    System.out.println("이름 입력: ");
                    String name = sc.nextLine();
                    System.out.println("나이 입력: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("학번 입력: ");
                    String studentId = sc.nextLine();
                    System.out.println("점수 입력: ");
                    int score = sc.nextInt();
                    sc.nextLine();

                    Student newStudent = new Student(name, age, studentId);
                    manager.addStudent(newStudent, score);
                    break;

                case 2:
                    System.out.println("삭제할 학생 이름 입력: ");
                    String delName = sc.nextLine();
                    manager.removeStudent(delName);
                    break;

                case 3:
                    manager.printAllStudents();
                    break;

                case 4:
                    System.out.println("조회할 학생 이름 입력: ");
                    String searchName = sc.nextLine();
                    manager.printScore(searchName);
                    break;

                case 5:
                    run = false;
                    System.out.println("[Info] 프로그램을 종료합니다. ");
                    break;

                default:
                    System.out.println("[Error] 잘못된 입력입니다.");

            }
        }
        sc.close();*/
    }
}