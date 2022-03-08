package method;

public class MethodCall2 {

    public static void sum(Integer a){
        System.out.println(a);
    }
    public static void main(String[] args) {

        //[1] : 변수 선언 및 메서드 호출
        // Wrapper 클래스 Integer 클래스 타입으로 변수 a를 선언하고 new로 객체를 생성하여 해당 주소 값을 메서드로 보낸다.

        Integer a = new Integer(100);
        sum(a);

        //출력
        System.out.println(a);
    }
}
