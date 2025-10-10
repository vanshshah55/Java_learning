class Human{
    private int age;
    private String name;


    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }


    //USING SOURCE ACTION SETTING - GETTERS & SETTERS

    // public int getAge() {
    //     return age;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }

    

}

public class a30_encapsulation {
    public static void main(String a[]){
        Human obj1 = new Human();
        obj1.setAge(20);
        obj1.getAge();
        obj1.setName("Vansh");
        obj1.getName();

        System.out.println(obj1.getName()+" : "+obj1.getAge());

    }
}
