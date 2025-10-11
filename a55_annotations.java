
@Deprecated
class a{
    public void show(){
        System.out.println("in a show");
    }
}

class b extends a{

    // @Override
    // public void show() {
    //      TODO Auto-generated method stub
    //     super.show();
    // }
    @Override
    public void show(){
        System.out.println("in b show");
    }

    

}


public class a55_annotations {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
    }
}
