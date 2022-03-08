package basic;

public class Java100_switch_Basic001 {
    public static void main(String[] args) {
        //[1] 변수 선언
        int age = 10;

        //switch문 선언
        //주의 할점 정수형만 가능 int byte short -> long 형 x -> char가능 대신 'A'
        //break, default 선언


        switch (age) {
            case 10:
                System.out.println(age + " 대 입니다. 참고서 코너는 A 입니다.");
                break;
            case 20:
                System.out.println(age + " 대 입니다. 취업용 코너는 B 입니다.");
                break;
            case 30:
                System.out.println(age + " 대 입니다. 자기계발 코너는 C 입니다.");
                break;
            case 40:
                System.out.println(age + " 대 입니다. 재태크 코너는 D 입니다.");
                break;
            case 50:
                System.out.println(age + " 대 입니다. 재취업 코너는 E 입니다.");
                break;
            default:
                System.out.println("60대 이상입니다. 나가세요");
                break;
        }
    }
}

