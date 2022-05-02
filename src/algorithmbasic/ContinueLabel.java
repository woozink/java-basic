package algorithmbasic;


public class ContinueLabel {
    public static void main(String[] args) {
        outloop:
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                int output = i*10+j;

                if(output % 2 !=0) {
                    if(j == 1){
                        System.out.println();
                        continue outloop;
                    }
                    continue;
                }
                else{
                    System.out.print(output+ " ");
                }
            }
            System.out.println();
        }
    }
}
