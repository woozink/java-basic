public class MethodEx {
    // 스테틱은 스테틱으로 부른다.
    public static void helloWorld() {
        System.out.println("Hello World");
    }

    // 메서드의 정의와 기본적인 자바의 메서드를 작성해보시오
    // 이문제는 자바의 메서드 개념과 메서드가 가지는 여러 특징들에 대해서 알고 있는지를 묻는 문제이다.


    //[1] 메서드란 무엇인가?
    // 1 메서드는 다른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위이다.
    // 2 반복적인 작업을 처리해야하는 경우 메서드로 만드러 높으면 이후에 필요할 때 다시 재사용 할수 있어서 아주 유용하다.
    // 3 메서드는 호출시 어떤 결과를 반환하기도 하지만, 결과를 반환하지 않는 메서드도 있디ㅏ.
    // 4 메서든는 호출시 어떤 인자값들을  넘겨서 호출하는 경우도 있지만 인자 값없이 호출하는 경우도 있다.

    //[2] : 메서드의 종류 ==> 크게 4가지
    // 1 반환값 ==> x 받는 인자값 ==> x
    // 2 반환값 ==> x 받는 인자값 ==> o
    // 3 반환값 ==> o 받는 인자값 ==> x
    // 4 반환값 ==> o 받는 인자값 ==> o
    public static void showMenu() {
        System.out.println("showMenu()메서드 호출");
    }

    public static void plusMethod(int a, int b) {
        //단순출력
        System.out.printf("인자로 넘겨 받은 2개의 값은 %d와 %d 입니다.\n", a, b);
        int x = a + b;
        System.out.println(x);
    }

    public static void main(String[] args) {
        //[1]메서드 호출
        helloWorld();

        // 1 반환값 ==> x 받는 인자값 ==> x
        showMenu();

        // 2 반환값 ==> x 받는 인자값 ==> o
        // 메서드가 받는 인자값이 있다는 것은 호출부에서 파라미터값을 넘긴다는 뜻
        int a = 100;
        int b = 200;
        plusMethod(a, b);

        // 3 반환값 ==> o 받는 인자값 ==> x


        // 4 반환값 ==> o 받는 인자값 ==> o
    }

}
