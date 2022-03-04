import java.util.Locale;

//public class ReturnMethod2 {
//    public static String[] Change(){
//
//        String a= "korea";
//        String b = "USA";
//
//        return new String[]{a.toUpperCase(),b.toLowerCase()};
//    }
//
//    public static void main(String[] args) {
//        String[] result = Change();
//        System.out.println(result);
//        System.out.println(result[0] + "-" + result[1]);
//    }
//}
public class ReturnMethod2 {

    public static String[] capitalMethod(String a, String b){
        String a1 = a.toUpperCase();
        String b1 = b.toLowerCase();

        //리턴 값 2개를 지정할 배열 변수 선언
        String[] ret = {a1,b1};
        return ret;
    }

    public static void main(String[] args) {
        //[1] 반환값 --> 0 받는 인자값 --> 0
        //반환값이 있다는 것 --> 메서드(호출) 호출에 따른 리턴 값이 있다는 것 --> 호출부에서 리턴 값을 받는 변수 정의

        String[] result = capitalMethod("korea", "USA");

        //출력
        System.out.println(result[0] + "- " +result[1]);
    }
}