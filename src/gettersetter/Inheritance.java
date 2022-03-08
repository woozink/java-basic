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

    public void printPerson() {
        System.out.println("악당이름 : " + getName());
        System.out.println("나이 : " + getAge());
        System.out.println("웨폰 : " + getWeapon());
        System.out.println("키 : " + getHeight());
        System.out.println("무게 : " + getWeight());
        System.out.println("파워 : " + getPower());
        System.out.println("유니크키 : " + getUniqueKey());
        System.out.println("--------------------------------");

    }
}

class Hero extends Person {
}


public class Inheritance {
    public static void main(String[] args) {

        //[1] 객체 생성
       Villain v1 = new Villain("좀비",20,80,180,1,"1",99.5);
       v1.printPerson();
    }
}









