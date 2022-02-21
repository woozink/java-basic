import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9};
        int[] ar2 = {2,3,5,17,58,12,12,3,4,5};

        //배열 복사하기 System.arraycopy()
        System.arraycopy(ar,2,ar2,4,3);
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
    }
}
