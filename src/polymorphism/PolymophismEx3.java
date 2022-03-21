package polymorphism;
// 다형성을 사용하면 배열이나 매개변수 활용에서 좋다는데 자세히 코드로 설명하시오
// 이 문제는 다형성의 개념과 필요성 그리고 어떤 점에서 활용할 때 좋은지를 알고 있는지를 묻는 문제이다.

class People{}

class Batman extends People{}

class Human{}

class Superman extends Human{}


public class PolymophismEx3 {
    public static void main(String[] args) {
        // [1] 배열에서 다형성을 사용할 수 없다면
        // 배열 --> 동일한 타입의 데이터를 하나로 묶어서 관리하는 자료구조 --> 다형성이 없다면 각 객체별로 관리를 해야합니다.
        People[] peoples = new People[10]; // == People 전용
        peoples[0] = new People();
        peoples[1] = new People();

        Batman[] batmans = new Batman[10];
        batmans[0] = new Batman();
        batmans[1] = new Batman();

        // [2] 배열에서 다형성을 사용할 수 있다.
        Human[] humans = new Human[10];
        humans[0] = new Human();
        humans[1] = new Superman(); // 다형성을 사용하여 가능합니다.

        //[3] 매개변수의 다형성
        //프로그래밍 언어에서 함수나 메서드를 호출할 때는 그에 맞는 적절한 파라미터를 보내주어야합니다.
        // sout 메서드는 어떤타입, 객체를 매개변수로 받더라도 에러없이 해당 객체의 값을 출력 -
        // 그것이 가능한 이유는 다형성을 활용하고 있기 때문입니다.
        // 실제 메서드의 API를 보면 --> public void pritln(Object x) 로 되어져 있기에 어떤 객체 타입이 전달되어라도 출력이된다.
        System.out.println(new People());
        System.out.println(new Batman());
        System.out.println(new Human());
        System.out.println(new Superman());

    }
}
