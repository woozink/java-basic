package interface2;


//Person class
class Person{
    //Field
    String name;
    int age;
    int weight;

    //Constructor
    Person(){

    }
    Person(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    // Method
    void wash(){
        System.out.println("씻다.");
    }
    void study(){
        System.out.println("공부하다.");
    }
    void play(){
        System.out.println("놀다.");
    }
}


// A 인터페이스(부모) <선언> imp
interface Allowance{
    //abstract 메서드만 사용가능
    abstract void in (int price, String name);
    abstract void out (int price, String name);
}

// B 인터페이스(부모) <선언>imp
interface Train{
    //abstract method
    abstract void train(int trainingPay, String name);
}

//Student 클래스 (자식) <구현>
class Student extends Person implements Allowance, Train{
    //Field

    //Constructor
    Student(){}
    Student(String name, int age, int weight){
        super(name, age, weight);
    }

    // Method
    public void in(int price, String name){
        System.out.printf("%s 에게서 %d원 용돈을 받았습니다.",name,price);
    }
    public void out(int price, String name){
        System.out.printf("%d 원 금액을 지출하였습니다. 지출용도 --> %s", price,name);
    }
    public void train(int trainingPay, String name){
        System.out.printf("[%s --> %d 원 입금완료]",name,trainingPay);
    }
}

//메인클래스 (메인 메서드가 포함)
public class interface2 {
    public static void main(String[] args) {
        //[1] 객체 생성
        Student s1 = new Student("홍길동", 20, 85);
    }
}
