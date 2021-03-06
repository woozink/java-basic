package class1;// [1] 클래스란 무엇인가?
// 클래스란 객체(또는 인스턴스)를 생성하는 하나의 공장(=틀, 템플릿, 프레임, 판형)이다.
// 시골 허허 벌판에 농기구를 만들어내는 공장(class)이 들어섰고, 농부들이 주문을 넣으면 농기구가 만들어진다.
//--> 그게 바로 객체
// 농기구 공장을 하나의 예로 들었을 뿐 얼마든지 내가 만들고자 하는 것을 클래스로 만들어 낼 수 있다.
// 자동차 클래스(공장), 동물 클래스(공장), AI 로봇 클래스(공장) -> 주문을 어떻게 넣느냐에 따른 다양한 객체를 만들어낼 수 있음


// [2] : 클래스 공장을 통해서 객체를 어떻게 만들어 내지?
// 사람들이 공장에 주문을 넣는 과정을 생각해보면 답은 쉽게 나온다.
// 예를 들면 어떤 농부가 경작용 트렉터를 주문한다고 하면, 가격을 고민하고, 색상도 고민하고, 연식도 고민할것이다.
// 뿐만 아니라 트랙터의 기능이나 성능 등 동작들에 대해서도 고민을한다.
// 고민하는 걸 2개정도로 압축을 하면 "특징" /// "동작" 이 됩니다.
// 클래스는 이러한 만들고자하는 객체의 "특징" 과 "동작"에 많은 시간을 들이고 집중하면서 설계를 하면 된다.


//[3] 위 사항들을 어려운 말로 정리를하면
// 객체의 특징 --> 속성(attribute)
// 객체의 동작 --> 메서드(method) 함수와 거의 동일
// 참고로 파이썬에서는 일반적으로 함수라는 표현을 쓰지만 클래스내에서의 함수는 메서드라고 부른다. 거의 함수와 동일하다.


// [4] 클래스는 왜나왔을까?
// 클래스 없이도 객체의 특징(속성)들은 변수로 정의할 수 있을 것이고, 동작은 함수로 정의할 수 있을 것이다.
// 그러나 프로그램의 규모가 커지고 여러 사람이 협업을 하는 과정에서 좀 더 체계적이고 분업화된 시스템으로 개발하고 확장해 날갈 필요성이 있다.
// 그런 일련의 과정에서 OOP객체지향 프로그래밍이 만들어졌다.
// 거의 모든 프로그래밍 언어에서 OOP문법을 지원하고 있고 하나의 언어로 OOP 문법을 공부하면 다른 언어에서도 겅의 동일하다.
// 즉, 자바 언어로 OOP을 배운 사람은 파이썬 php를 공부할 때 거의 거저 먹기 수준이다.
// 다만 프로그래밍 언어마다 OOP을 구현하는 방법은 제가각 틀리기 때문에 이런 부분을 공부하는 시간은 필요하다.


// [5] 클래스 만들기
// 객체의 특징 --> 속성
// 객체의 동작 --> 메서드

class FarmMachine{

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




public class WhatClass {
    public static void main(String[] args) {

        //[1] 객체의 생성
        FarmMachine fm = new FarmMachine();
        System.out.println(fm);

        //[2] 생성된 객체에 속성 값 입력하기
        fm.price =1000000;
        fm.year = 2020;
        fm.color ="red";

        //[3] 속성값 출력하기
        System.out.println(fm.price);
        System.out.println(fm.color);
        System.out.println(fm.year);

        //[4] 동작 수행시키기
        fm.move();
        fm.dig();
        fm.grind();
    }
}
