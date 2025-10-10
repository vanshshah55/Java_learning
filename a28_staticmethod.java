class mobile{
    String brand;
    int price;
    String version;
    //String name;
    static String name;

    // public void show(){
    //     System.out.println(brand + " - " + price + " : " + name);
    // }

    public static void show1(mobile obj){
        System.out.println(obj.brand + " - " + obj.price + " : " + obj.name);
    }
}



public class a28_staticmethod {
    public static void main(String a[]){
    mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 80000;
        //obj1.name = "iphone";
        mobile.name="phone";

        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 10000;
        //obj2.name = "Galaxy";

        // obj1.show();
		// obj2.show();

        mobile.show1(obj1);
        mobile.show1(obj2);
}
}
