package method;

public class ObjArray {
    public static void main(String[] args) {
       Person[] pa;
       pa = new Person[5];

       for(int i = 0; i <= pa.length; i++){
           pa[i] = new Person(i+ "번 후보자",i+20);

           System.out.println(pa[i].getName() + "--> 나이 " +pa[i].getAge());

//           System.out.println(pa[i].name + pa[i].age);

       }
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
