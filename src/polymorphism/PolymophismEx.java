package polymorphism;


// [1] 다형성이란?
// 다양한 형태 또는 특성 <다. 형. 성>
// 자바와 같은 객체 지향 언어에서의 의미는 부모 클래스를 상속받은 자식 클래스의 인스턴스가 부모의 객페로도 사용되고
// 뿐만 아니라 자식 클래스의 객체로도 사용될 수 있는 다야아한 상황을 의미한다.

// [2] 예시
// 부모 클래스에 Bird가 있고 이를 상속받은 자식클래스에는 Parrot가 있다고 가정하자
// 이때 "앵무새가 말을하네.. 허허" 이렇게 말하는 거와
// "새가 말을하네 .. 허허" 라고 말 할 수 있다.
// Perons s1 = new Student();

// [3] 결론
// 정리하자면, 하위클래스의 인스턴스(객체)는 보다 위인 상위클래스의 인스턴스(객체)로도 사용될 수 있다.
// 그런데 그 반대는 안된다.
// 왜냐하면 "앵무새"는 분명 그 상위인 "새"라고 말할 수 있지만 새는 종류가 많아서 모든 새는 앵무새가 아니다.
// 따라서 상위 클래스의 인스턴스(객체)는 하위 (자식)클래스의 인스턴스로 사용될 수 없다.


class Person {
    String str1 = "난 부모클래스 ";

    void method1() {
        System.out.println("에이에이에이");
    }

    void ppp() {
        System.out.println("ppp");
    }
}

class Student extends Person {
    String str2 = "난 자식클래스 ";
    void method1() {
        System.out.println("오버라이딩 - AAA");
    }
    void sss() {
        System.out.println("sss");
    }
    void x(){
        method1();
        super.method1();
    }
}

public class PolymophismEx {
    public static void main(String[] args) {

        //[1] 객체생성 --> 부모 +자식 클래스의 모든 자원을 다 쓸 수 있다.
        Student s1 = new Student(); //정상
        System.out.println((s1.str1));
        System.out.println(s1.str2);
        s1.method1();
        s1.sss();
        s1.ppp();
        System.out.println("------------------super사용");
        //[!] 자식클래스에서 오버라이딩 된 부모 클래스의 원본 메서드를 호출하고 싶다면 ? super 사용.
        s1.x();
        System.out.println("_____________________________");


        //[2] 객체생성 --> 부모타입으로 생성 --> 범위는 부모클래스의 자원만 쓸 수 있다 (?)
        Person s2 = new Student(); //정상
        System.out.println(s2.str1);
        s2.ppp();
        //s2.str2  -> err
        s2.method1(); // * 오버라이딩 한 것은 자식의 메서드로 실행이된다. *
        System.out.println("----------------------캐스트 사용!");
        // [!] 부모 클래스에서 자식메서드를 바로 호출하고 싶다면 ? 캐스트가 필요합니당 !!!!!!!
        ((Student)s2).sss();
        System.out.println("_____________________________");




        // [3]객체생성 -->
        Person aaa= new Person(); //정상
        aaa.method1();
        // aaa.sss -> err



        // 객체생성 --> 상위 클래스로 객체를 생성하면서 타입은 하위 타입을 쓰면 안된다.
        // Student s3 = new Person(); 반대는 안된디/

    }
}
