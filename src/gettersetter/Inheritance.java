package gettersetter;

class Person {
    // Field
    private String name;
    private int age;
    private int height;
    private int weight;

    // Constructor
    Person() {

    }

    Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void move() {
        System.out.println("이동중");
    }

}

class Villain extends Person {
    //Field
    private String uniqueKey;
    private int weapon; //
    private double power;

    //Constructor
    Villain() {
    }

    Villain(String name, int age, int height, int weight, int weapon, String uniqueKey, double power) {
        super(name, age, weight, height);
        this.uniqueKey = uniqueKey;
        this.power = power;
        this.weapon = weapon;

    }

    //Method
    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public String getWeaponName(int a) {
        String weapon;
        switch (a) {
            case 1:
                weapon = "창";
                break;
            case 2:
                weapon = "방패";
                break;
            case 3:
                weapon = "총";
                break;
            default:
                weapon = "----";
                break;
        }
        return weapon;
    }

    public void printPerson() {
        System.out.println("악당이름 : " + getName());
        System.out.println("악당나이 : " + getAge());
        System.out.println("악당무기 : " + getWeaponName(getWeapon()));
        System.out.println("악당키 : " + getHeight());
        System.out.println("악당무게 : " + getWeight());
        System.out.println("악당파워 : " + getPower());
        System.out.println("악당성별 : " + getUniqueKey());
        System.out.println("--------------------------------");

    }
}

class Hero extends Person {
}


public class Inheritance {
    public static void main(String[] args) {

        //[1] 객체 생성
        Villain v1 = new Villain("좀비", 20, 80, 180, 3, "1", 99.5);
        v1.printPerson();
        System.out.print(v1.getName() + " ");
        v1.move(); // 부모 클래스의 move()메서드를 호출


        //[2] 객체 생성
        Villain v2 = new Villain("도깨비", 30, 110, 120, 1, "1", 99.5);
        v2.printPerson();
        System.out.print(v2.getName() + " ");
        v2.move(); // 부모 클래스의 move()메서드를 호출
    }
}









