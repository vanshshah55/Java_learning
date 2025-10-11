interface a{
    //public abstract void show();
    //public abstract void config();
    int age = 20; // Final and Static
    String area = "Nesco";

    void show();
    void config();
}

class b implements a{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}


public class a50_interface2 {
    public static void main(String[] args) {
        a obj;
        obj = new b();

        obj.show();
        obj.config();

        //a.area = "andheri";

        System.out.println(a.age);
    }
}
