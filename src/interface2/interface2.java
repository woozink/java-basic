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
    //인터페이스 내에 모든 메서드는 public abstract 이어야함 -> 생략이 가능합니당.
    public abstract void in (int price, String name);
    void out (int price, String name);

    public static final String aaa ="코리라";
    int bbb = 100;
}

// B 인터페이스(부모) <선언>imp
interface Train{
    //abstract method
    abstract void train(int trainingPay, String name);
}

//Student 클래스 (자식) <구현>
class Student extends Person implements Allowance, Train{
    //Field
    //변수는 안되나 상수로 지정하면됨 -> public static final 을 붙여주면 됨
    // 인터페이스내 모든 멤버 필드 (변수) 는 public static final -> 무조건 붙으니까 ->생략이 가능
    public static final String aaa = "Korea";
    public static final int bbb = 123;
    int aa; // -> 가능 "타입" + "상수명" 지정해서 쓰면 된다.
    //Constructor
    Student(){}
    Student(String name, int age, int weight){
        super(name, age, weight);
    }

    // Method
    public void in(int price, String name){
        System.out.printf("%s 에게서 %d원 용돈을 받았습니다. \n",name,price);
    }
    public void out(int price, String name){
        System.out.printf("%d 원 금액을 지출하였습니다. 지출용도 --> %s \n", price,name);
    }
    public void train(int trainingPay, String name){
        System.out.printf("[%s --> %d 원 입금완료] \n",name,trainingPay);
    }
}

//메인클래스 (메인 메서드가 포함)
public class interface2 {
    public static void main(String[] args) {
        //[1] 객체 생성
        Student s1 = new Student("홍길동", 20, 85);

        //[2] 클래스와 인터페이스로 부터 상속과 구현을 한 메서드들을 호출하기
        s1.wash();
        s1.study();
        s1.play();

        s1.in(10000,"엄마");
        s1.out(10000,"편의점");
        s1.train(500000,"아빠");

//      [3] 상수 필드 사용하기
        System.out.println(s1.aaa);
        System.out.println(s1.bbb);

        System.out.println(Allowance.aaa);
        System.out.println(Allowance.bbb);
    }
}
