class AB{
    public AB(){
        System.out.println("OBJECT CREATED");
    }
    public void show(){
        System.out.println("in public void show");
    }
}

public class a35_anonymousobject {
    public static void main(String[] args) {
        

        System.out.println("########");
        
        new AB(); //ANONYMOUS OBJECT.
        System.out.println("########");
        new AB().show();
        System.out.println("########");
        System.out.println("-----------");


        AB obj;
        System.out.println("########");
        obj = new AB();
        System.out.println("########");
        obj.show();
        System.out.println("########");




    }
}
