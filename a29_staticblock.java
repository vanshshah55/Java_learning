class mobile{
    String brand;
    int price;
    String version;
    static String name;

    static{
        name = "Phone";
        System.out.println("in static block");
    }

    public mobile(){
        brand = "";
        price = 2000;
        //name = "Phone";
        System.out.println("in constructor");
    }

    public void show1(){
        System.out.println(brand + " - " + price + " : " + name);
    }
}

public class a29_staticblock {
    public static void main(String args[]) throws ClassNotFoundException{
        Class.forName("Mobile");

        //mobile obj1 = new mobile();
        //obj1.brand = "Apple";
        //obj1.price=1500;
		//Mobile.name="SmartPhone";

        //mobile obj2 = new mobile();
	

    }
}
