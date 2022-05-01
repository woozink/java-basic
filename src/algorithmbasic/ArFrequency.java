package algorithmbasic;

public class ArFrequency {
    public static void main(String[] args) {
        int[] target = {1,2,3,1,2,0,1,0,2};

        int[] arr = new int[4];

        for(int i = 0; i< target.length; i++){
            arr[target[i]] ++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(i + "의 개수는 "+arr[i] +"개");
        }
    }
}
