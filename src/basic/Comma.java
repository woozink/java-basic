package basic;

public class Comma {
    public static void main(String[] args) {

        //[1] 객체의 생성
        FarmMachine1 fm1 = new FarmMachine1();
        System.out.println(fm1);

        //[2] 생성된 객체에 속성 값 입력하기
        fm1.price = 10000000;
        fm1.year = 2020;
        fm1.color = "red";

        //[3] 속성값 출력하기
        //String fm1_price = String.format("%,d",1000000);
        System.out.println(String.format("%,d",fm1.price));
        System.out.println(fm1.color);
        System.out.println(fm1.year);

        //[4] 동작 수행시키기
        fm1.move();
        fm1.dig();
        fm1.grind();
    }
}

class FarmMachine1{

    //[1] 속성 (특징)
    int price;//가격
    int year; //년식
    String color; //색상

    //[2] 동작 (기능, 행동) --> 농기계마다 동작이 다양하므로 공통적인 동작을 생각해본다.
    void move(){
        System.out.println("Farm-machine is moving");
    }

    void dig(){
        System.out.println("Farm-machine is digging");
    }

    void grind(){
        System.out.println("Farm-machine is grinding");

    }
}
