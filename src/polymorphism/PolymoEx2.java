package polymorphism;
// 추상클래스와 상속을 사용해서 다형성의 예제를 만들어봅니다.
// 이 문제는 추상 클래스와 상속의 개념을 정확하게 이해하고 이를 활용하여 다형성을 구현할 수 있는지를 묻는 문제이다.

abstract class Car{
    abstract void run();
}

class Ambulance extends Car{
    void run(){
        System.out.println("앰뷸런스 지나간다.");
    }
}

class Cultivator extends Car{
    void run(){
        System.out.println("경운기 지나간다.");
    }
}

class SportsCar extends Car{
    void run(){
        System.out.println("스포츠카 지나간다.");
    }
}

public class PolymoEx2 {
    public static void main(String[] args) {
        //[1] 객체 생성
        Car c1 = new Ambulance();
        Car c2 = new Cultivator();
        Car c3 = new SportsCar();

        //[2] 메서드 호출
        c1.run();
        c2.run();
        c3.run();
    }
}
