public class ThreeOperateor {
    public static void main(String[] args) {
        //[1] 변수 선언
        int a = 12;

        //[2] 10보다 작으면 100을 곱해서 출력하고 아닐경우 그냥 출력하세요
        int v = 10>=a ? a*100 : a;
        System.out.println(v);

        //[3] 12시 이전은 오전, 12시 이후는 오후를 출력하세요

        String str = a>=12 ? "오후" : "오전";
        System.out.println(str);
    }
}
