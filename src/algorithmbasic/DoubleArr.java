package algorithmbasic;

public class DoubleArr {
    public static void main(String[] args) {
        int c = 5;
        int r = 5;

        String[][] arr = {
                {"ㅁ","ㅁ","ㅁ","ㅁ","ㅁ"},
                {"ㅁ","ㅁ","ㅁ","ㅁ","ㅁ"},
                {"ㅁ","ㅁ","X","ㅁ","ㅁ"},
                {"ㅁ","ㅁ","ㅁ","ㅁ","ㅁ"},
                {"ㅁ","ㅁ","ㅁ","ㅁ","ㅁ"}
        };

        System.out.println("------------------------------");

        for(int i = 0; i < r; i++){
            for(int j = 0; j <c; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");
    }
}
