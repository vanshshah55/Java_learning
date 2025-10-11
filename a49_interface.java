interface computer{
    void code();
}

class laptop implements computer{
    public void code(){
        System.out.println("Coding...");
    }
}

class desktop implements computer{
    public void code() {
        System.out.println("desktop coding...");
    }
}

class developer{
    //public void devapp(laptop obj);
    public void devapp(computer obj){
        obj.code();
    }

}

public class a49_interface {
    
public static void main(String[] args) {
    computer obj = new laptop();
    computer obj2 = new desktop();

    developer vansh = new developer();
    vansh.devapp(obj);
    vansh.devapp(obj2);
}
}

