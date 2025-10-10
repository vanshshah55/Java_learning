
class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age, Human obj){
        Human obj1 = obj;
        obj1.age = age;
    }

    //THIS KEYWORD does whatever done above.
    public void setName(String name){
        this.name = name;
    }

    // public void setAge(int a){
    //     age = a;
    // }

    



}

public class a31_this{
    public static void main(String a[]){
        Human obj = new Human();

        obj.setAge(30,obj);
        //obj.setAge(20);
        obj.setName("Vansh");

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}