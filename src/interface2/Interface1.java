package interface2;

import java.io.IOException;
//인터페이스란 ?
// 사전적 의미 ->결합부 , 접속기 --> 사용자간 컴퓨터간 통신이 가능하도록 해주는 디바이스나 프로그램
// 큰틀에서 보다면 자바에서 인터페이스 개념도 사전적 의미와 비슷하다.
// 상호간 통신을 위해서 "규격"중요하다.
// 일본의 가전 기업들이 한국에서 전자제품을 팔고 싶다면 한국내 220 v 규격을 지켜서 만들어야만 판매가능
// 이러한 "규격"을 인터페이스라 할수 있고 인터페이스는 하나의 표준화를 제공하는 것이라고 볼 수 있다.

// 추상 클래스 vs 인터페이스
// 추상클래스와 거의 비슷하나 추상화 정도가 더 높다 (엄격하다.)
// --> 따라서 일반 메서드 멤버필드( 변수)의 유무가 다르다 . 추상 o 인터페이스 x
// 상수만 가능
// 자바에서의 인터페이스 문법
// 표준화 및 규격을 인터페이스로 제공
// 따라서 어떤 클래스가 해당 인터페이스를 사용 (상속)한다면 인터체이스에 선언되어져 있는 메서드를 구현해야한다.
//  인터페이스는 클래스 키워드를 사용하지 않고 별도의 키워드인 interface 키워드를 사용하다.
// 클래스는 --> extends 인터페이스는 --> implements (시행, 구현하다.)
// 추상클래스와 같이 메서드의 구체적인 내용은 구현되어져 있지 않으므로 인터페이스를 상속받은 클래스에서 재정의(오바라이딩)해서 사용해야한다.
// 상속 vs 구현
// 클래스와 인터페이스의 가장큰 차이점은 "상속이다."
// 클래스 = 단일 상속 / 인터페이스 = 다중 상속
// 인터페이스에서는 상속이라는 표현을 쓰지 않고 implements를 사용한다.(다중상속을 구현환다.)

// [1] 인터페이스
// -> 추상클래스와 비슷하나 그 추상화 정도가 더 높다 (엄격하다.) 일반 메서드나 멤버 필드를 가질 수 없다.
// 표준화 및 규격을 인터페이스로 제공 --> 일종의 "설계도" 개념.
// 따라서 어떤 클래스가 해당 인터페이스를 사용(상속_한다면 인터페이스에 선언 되어옂 이쓴ㄴ 메서드를 구현
// 인터페이스는 interface 키워드를 사용
// 추상클래스와 같이 메서드의 구체적인 내용은 기술 되어져 있지 않으므로 인터페이스를 상속받은 클래스에서 재정의(오버라이딩) 하여 사용.

//[2] 상속
// ㅋ믈래스는 단일 상속 인터페이스는 다중상속이된다.
// class -> extends interface -> implemaents -> 다중상속을 구현 -> A, B 콤마로분리
//[3] 장점
// 인터페이스를 이용하면 메서드의 추상적인 선언과 그 메서드들을 구체적인 구현 부분을 분리시킬 수 있다. -> 큰 장점
// 하청을 주는 대기업은 하청 업체에 interface 제공 -> 하청업체는 이를 준수하여 개발
// 분업화된 시스템을 구축하여 "갑 과 "을"이 독립적으로 프로젝트 개발을 해나갈 수 있다. --> 매우큰 장점
// [4] 우선순위(extends vs implements)
// 상속을 받는 extends 키워드와 구현을 하는 implements 키워드가 동시에 쓰일 때 항상 extends가 먼저 오도록 사용해야함
// 예시 )class Students Person implemnets a,b

public class Interface1 {
    public static void main(String[] args) throws IOException {
        //[1] 객체 생성

    }
}
