// [1] 상속이란 ?
// 말 그대로 부모 클래스가 가지고 있는 속성, 기능을 그대로 물려받아서 클래스를 만드는 것
// 새로운 클래스를 만드는 것 !!!!
// 상속을 활용하면 물려 받은 것들은 사용하고, 거기에 덧붙여 새로운 것만 만들기 때문에 간편함
// 이때 , 물려 받게 되는 원본 클래스를 부모 클래스 또는 슈퍼 클래스라고 불른다.
// 상속을 받아서 새롭게 만들어지는 클래스는 자식클래스 서브 하위 클래스로 부른다.


//[2] 상속의 장점
// 가장 큰 장점 --> 재활용성 !
// 완전히 새로운 것을 만드는 것이 아니라 기존 부모로 부터 상속을 받아 더 만드는 것
// 부모 클래스에 정의 되어져 있는 멤버 필드(변수)나 메서드 들을 그대로 상속 받아 사용하면 된다.
// 상속받은 메서드라고 해도 필요에 따라서 자식클래스에서 용도를 변경해서 사용하는 것도 가능

//[3] 상속의 사용
// 기존 부모 클래스를 확장한다는 개념
// 부모 클래스의 멤버 필드, 메서드는 상속이 가능하나 생성자는 상속이 안된다.
// 부모클래스의 접근제한자 private인 경우에는 아무리 자식 클래스가 상속을 받았다 하더라도 접근이 불가능

class Person {
    //Field
    int gender;
    int power;
    // Constructor
    Person(){
        this.gender = 1;
        this.power = 100;
    }

    //Method
    void walk(){
        System.out.println("걸어갑니다.");
    }
}

class Hero extends Person{
    //Field
    String name;
    int age;

    //Constructor
    Hero(){}
    Hero(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Method
    void walk(){
        System.out.println("2배로 걸어간다.");
    }

    void eat(){
        System.out.println("밥먹고 있습니다.");
    }

    void displayPerson(){
        System.out.println("이름 : " + name + " 나이 : " + age + " 성별 : " + gender+ " 파워 : " + power);
    }
}

class Villain{}

public class Oop7 {
    public static void main(String[] args) {
        //[1] 객체 생성
        Person p1 = new Person();
        p1.walk();

        //[2] 상속을 통한 슈퍼맨 객체 생성

        Hero h1 = new Hero("슈퍼맨", 20);
        System.out.println(h1.age);
        System.out.println(h1.name);
        System.out.println(h1.gender); //부모클래스
        System.out.println(h1.power); //부모클래스
        h1.eat();
        h1.displayPerson();
        h1.walk();
        p1.walk();

        //[3] 원더우먼 객체 생성
        Hero h2 = new Hero("원더우먼",30);
        h2.displayPerson();
        h2.gender=2;
        h2.power =300;
        h2.displayPerson();
    }

}
