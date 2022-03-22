package algorithmbasic;

public class MinAlgorithm {
    public static void main(String[] args) {
        //[1] 배열 선언
        int[] ar = {1, 3, 15, 26, -1};

        //[2] 일단 배열 내 첫번째 원소의 값이 제일 크다고 가정하고 초기화
        int min1 = Integer.MAX_VALUE; // -> 가장 큰값을 넣으면 비교하면서 큰값을 찾는 것이 불가능 , 만약 음수가 없다는 조건이면 0도 가능
        System.out.println("현재 배열내 가장 큰 값은 ? " + min1); // 정수형 중에서 가장 작은 값이 출력이 됨

        //[4]반복문을 돌면서 비교해서 출력
        int min = ar[0];

        for (int i = 1; i < ar.length; i++) {
            System.out.print(ar[i]+" ");

            if (min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println();
        System.out.println("현재 배열내 가장 작은 값은 ? " + min);
    }
}
