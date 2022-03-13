package math;

import java.io.IOException;

public class UsingMath {
    public static void main(String[] args) throws IOException {

        //버림 처리 <int형에 소수점이 들어 오면 자동으로 버립니다.>
        int a = (int) 3.4;
        int b = (int) 3.5;
        int c = (int) 3.6;

        System.out.println("a의 값 : " + a);
        System.out.println("b의 값 : " + b);
        System.out.println("c의 값 : " + c);
        System.out.println();
        System.out.println("---------------------------");

        //String.Format 이용한 반올림
        String x = String.format("%.0f", 3.5); // 첫째자리 반올림
        String y = String.format("%.2f", 3.555); // 셋째자리 반올림
        String z = String.format("%.4f",3.12121); // 5째자리 반올림

        System.out.println("x의 값 : " + x);
        System.out.println("y의 값 : " + y);
        System.out.println("z의 값 : " + z);
        System.out.println();
        System.out.println("---------------------------");
        //Math 클래스를 이용하여 간단하게 반올림, 올림, 내림이 가능하다.
        double t = 3.1415926764;

        System.out.println("첫째자리 반 올림 : " + Math.round(t));
        System.out.println("둘째자리 반 올림 : " + Math.round(t *10 / 10.0));
        System.out.println("---------------------------");
        System.out.println("첫째자리 올림 : " + Math.ceil(t));
        System.out.println("셋째자리 올림 : " + Math.ceil(t *100)/100.0);
        System.out.println("---------------------------");
        System.out.println("첫째자리 버림 : " + Math.floor(t));
        System.out.println("넷째자리 버림 : " + Math.floor(t *1000 /1000.0));
    }
}
