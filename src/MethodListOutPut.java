import java.util.Arrays;

public class MethodListOutPut {

    // 메서드를 이용해서 배열을 출력해보자
    // toString() 매서드를 사용합니다.
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int [] arr2;
        arr2 = new int[] {8,5,7,4,12,6,47,2};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
