import java.util.ArrayList;
import java.util.Arrays;

public class ReturnMethod {

    public static int[] testMethod(){
        int num1 = 100;
        int num2 = 200;
        return new int[]{num1,num2};
    }
    public static void main(String[] args) {


        //[1] 변수 선언 -> 배열 변수로 변경
        int[] result = testMethod();

        //출력
        System.out.println(result);
        System.out.println(result[0] + " " + result[1]);
        System.out.println(Arrays.toString(result)); // 모든 값 출력
    }
}
