class Human{
    private int age;
    private String name;

    public Human(){
        age =20;
        name = "Vansh";
        System.out.println("in constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

public class a32_constructor {
    public static void main(String a[]){
        Human obj1 = new Human();
        //Human obj2 = new Human();
        System.out.println(obj1.getName()+" : "+obj1.getAge());

        obj1.setAge(21);
		obj1.setName("Shah");
        System.out.println(obj1.getName()+" : "+obj1.getAge());


    }
}
