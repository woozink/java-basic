// 두번째 인자 값으로 진수를 지정 -> 해당 진수에 맞는 값이 됨
// Integer.parseeint("1000", '2') --> 2진수


public class ParseInt {
    public static void main(String[] args) {

        //[1] 숫자끼리의 연산
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);

        //[2] 문자열 끼리의 연산
        String a1 = "1";
        String b1 = "2";
        String c1 = a1+b1;
        System.out.println(c1);

        System.out.println(c1.getClass().getName());

        // [3] 문자열 --> 숫자로 변환 후 연산
        int a2 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(b1);
        int c2 = a2+b2;
        System.out.println(c2);

        //[4] 진수 지정
        System.out.println("---------------진수지정");
        System.out.println(Integer.parseInt("2022"));
        System.out.println(Integer.parseInt("2022", 10));
        System.out.println(Integer.parseInt("1001", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("1004", 8));

        System.out.println("----------------잔수지정");
    }
}
