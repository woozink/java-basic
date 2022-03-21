package polymorphism;
// 추상클래스와 상속을 사용해서 다형성의 예제를 만들어봅니다.
// 이 문제는 추상 클래스와 상속의 개념을 정확하게 이해하고 이를 활용하여 다형성을 구현할 수 있는지를 묻는 문제이다.

abstract class Car {
    abstract void run();
}

class Ambulance extends Car {
    void run() {
        System.out.println("앰뷸런스 지나간다.");
    }
}

class Cultivator extends Car {
    void run() {
        System.out.println("경운기 지나간다.");
    }
}

class SportsCar extends Car {
    void run() {
        System.out.println("스포츠카 지나간다.");
    }
}

public class PolymoEx2 {
    public static void main(String[] args) {
//        //[1] 객체 생성
//        Car c1 = new Ambulance();
//        Car c2 = new Cultivator();
//        Car c3 = new SportsCar();
//
//        //[2] 메서드 호출
//        c1.run();
//        c2.run();
//        c3.run();

        //[1]  반복문을 이용한 객채 생성
        // 배열길이가 3인 Car 객체 배열 선언
//        Car[] cars = new Car[3];
//        System.out.println(cars[0]);  //Null
//
//        //cars 배열 초기화
//        cars = new Car[]{
//                new Ambulance(), new Cultivator(), new SportsCar()
//        };
//
//        System.out.println(cars[0]);
//        System.out.println(cars[1]);
//        System.out.println(cars[2]);

        //[2] 1번 방법 말고 -> 자식클래스로 객체 생성 -> 타입은 부모 타입으로 -> 이렇게 생성된 객체 초기화 -> 다형성 덕분에 가능.

        Car[] cars = {new Ambulance(), new SportsCar(), new Cultivator()};

        //[3] 반복문 돌면서 각 객체의 run()메서드 호출
        for (int i = 0; i < cars.length; i++) {
            cars[i].run();
        }

        //[4] 향상된 for 문 사용
        System.out.println("------------------------");

        for(Car obj : cars ){
            obj.run();
        }
    }
}
