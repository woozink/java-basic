package algorithmbasic;

//정수로 이루어진 배열에서 가장 큰 값을 구하는 최댓값 알고리즘을 구현해보시오
// 이 문제는 배열내 정수 값들 에서 최대값을 구하는 알고리즘에 대해서 아는지를 묻는 문제이다.

public class MaxAlgorithm {
    public static void main(String[] args) {

        //[1] 배열 선언
        int[] ar = {1, 3, 15, 26, -1};

        //[2] max, min 함수
        System.out.println(Math.max(10, 4)); //10
        System.out.println(Math.min(10, 4)); //4

        //[3] 일단 배열 내 첫번째 원소의 값이 제일 크다고 가정하고 초기화
        int max1 = Integer.MIN_VALUE; // -> 가장 큰값을 넣으면 비교하면서 큰값을 찾는 것이 불가능 , 만약 음수가 없다는 조건이면 0도 가능
        System.out.println("현재 배열내 가장 큰 값은 ? " + max1); // 정수형 중에서 가장 작은 값이 출력이 됨

        //[4]반복문을 돌면서 비교해서 출력
        int max = ar[0];

        for (int i = 1; i < ar.length; i++) {
            System.out.print(ar[i]+" ");

            if (max < ar[i]) {
                max = ar[i];
            }
        }
        System.out.println();
        System.out.println("현재 배열내 가장 큰 값은 ? " + max);
    }
}
