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


//     Types of Interface:-
// 1. Normal interface
// 	- an interface having two or more methods
// 2. Functional interface (SAM)
// 	- SAM => Single Abstract Method interface
// 3. Marker interface
// 	- an interface that as no methods (blank interface)
}
}

