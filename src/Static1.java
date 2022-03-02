public class Static1 {


    public void helloWorld(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        //[1] 메서드 호출
        //helloWorld(); --메인 메서드는 스태틱 메서드만 호출할 수 있기에 에러

        //[2] 객체 생성 후 메서드 호출
        Static1 jes = new Static1();
        jes.helloWorld();
    }
}
