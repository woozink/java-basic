package algorithmbasic;

import java.io.IOException;

public class EvenOddNum {
    public static void main(String[] args) throws IOException {
        int number = 1;// 변수 초기화

        while(number <=30){
            if(number % 2 !=0){
                number ++;
                continue;
            }
            System.out.println(number);
            number++;

        }
    }
}
