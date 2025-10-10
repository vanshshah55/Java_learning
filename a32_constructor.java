class Human{
    private int age;
    private String name;

    public Human(){
       age =20;
        name = "Vansh";}


    // DEFAULT CONSTRUCTOR
    // public Human(){
    //     age =20;
    //     name = "Vansh";
    //     System.out.println("in constructor");
    // }

    public Human(String name){
        this.age = age;
        this.name = name;
    }


    //PARAMETERIZED CONSTRUCTOR
    public Human(int age, String name)
	{
		this.age=age;
		this.name=name;
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
        Human obj2 = new Human(22,"shhhaaahh");
        Human obj3 = new Human("Apollo");
        System.out.println(obj3.getName()+" : "+obj3.getAge());
        System.out.println(obj2.getName()+" : "+obj2.getAge());
        
        System.out.println(obj1.getName()+" : "+obj1.getAge());

        obj1.setAge(21);
		obj1.setName("Shah");
        System.out.println(obj1.getName()+" : "+obj1.getAge());


    }
}
