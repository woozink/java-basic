package algorithmbasic;

public class Random {
    public static void main(String[] args)  {

        //[1] 정수 배열
        int[] arr = new int[10];

        //반복문으로 돌면서 정수 10개 랜덤값 설정
        for(int i =0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
