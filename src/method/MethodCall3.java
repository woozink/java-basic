package method;

public class MethodCall3 {


    public static void sum(TestNumber a){
        //System.out.println(a);
        a.num += 400;
        System.out.println(a.num);
    }
    public static void main(String[] args) {
        //객체 변수 선언
        TestNumber a= new TestNumber(100);
        sum(a);
       // System.out.println(a);
        System.out.println("--------------");
        System.out.println(a.num);
    }
}

class TestNumber{
    int num;
    TestNumber(int num){
        this.num = num;
    }
}