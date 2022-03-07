
class Person{
    //[1] 속성

    int age;
    String name;

    //[2] 생성자
    Person(){}
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    //[3] 메서드
    void printPerson(){
        System.out.println("나이 : "+ age+ " 이름 : "+ name);
    }

}


public class Oop6 {
    public static void main(String[] args) {
        //[1] 객체 생성
        Person p1 = new Person(20, "홍길동");
        Person p2 = new Person(40, "이순신");
        Person p3 = new Person(30, "징기스칸");
//        System.out.println(p1);
//        System.out.println(p1.age); //20
//        System.out.println(p1.name);// 홍길동

        p1.printPerson();
        p2.printPerson();
        p3.printPerson();
    }
}
