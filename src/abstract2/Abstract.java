package abstract2;


abstract class Animal{
    // 구체적인 내용을 작성하지 않고 공통적인 특징을 추성적으로 선언 ==> 리턴값 조차도 없이 메서드명만 선언
    abstract void cry();
}

class Dog extends Animal{
    void cry(){
        System.out.println("멍멍 ~");
    }
}

class Cat extends Animal{
    void cry(){
        System.out.println("야용 !");
    }
}

class Cow extends Animal{
    void cry(){
        System.out.println("음머 ~");
    }
}
class Animal2{
    void fly(){
        System.out.println("날다 !");
    }
}
public class Abstract {
    public static void main(String[] args) {
        //[1] 추상 클래스는 구체적인 내용이 없기 때문에 객체를 생성할 수 없다.
        Animal2 dragonfly = new Animal2();
        dragonfly.fly();

        //[2] 추상클래스 사용은? --> 상속을 받아서 사용
        // 즉. 추상클래스(부모역할)를 상속받은 자식 클래스에서 해당 메서드를 오버라이딩(재정의)해서 사용한다.

        Dog dog = new Dog();
        dog.cry();
        Cat cat = new Cat();
        cat.cry();
        Cow cow = new Cow();
        cow.cry();
    }
}
