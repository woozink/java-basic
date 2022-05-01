package algorithmbasic;

public class DoubleFor {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int output = i*10+j;
                if(output % 2 !=0) continue;
                else{
                    System.out.print(output+ " ");
                }
            }
            System.out.println();
        }
    }
}
