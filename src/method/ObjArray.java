package method;

public class ObjArray {
    public static void main(String[] args) {
        int [] ar1 = {1,2,3,4,5};
        char[] ar2 = {'A','B','C','D','E'};
        Person[] pa = new Person[5];
        pa[0] = new Person("홍길동",20);
        pa[1] = new Person("양길동",21);
        pa[2] = new Person("한길동",22);
        pa[3] = new Person("이길동",23);
        pa[4] = new Person("김길동",24);

        for(int i = 0; i < ar1.length; i++){
            System.out.print(pa[i].getName() + "    ");
        }
        System.out.println();
    }
}

class Person{
    private String name;
    private int age;

    Person(){}
    Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
