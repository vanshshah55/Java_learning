class vanshexception extends Exception{
    public vanshexception(String string){
        super(string);
    }
}

class a{
    public void show() throws ClassNotFoundException{
        	try
   	{
   		Class.forName("Cfeg");
   	}
   	catch(ClassNotFoundException e)
   	{
   		System.out.println("Not able to find the class");
   	}
		
//Class.forName("huyh");
    }
}


public class a62_DuckingExceptionsUsingThrows {
    static{
            System.out.println("class loader");
        }
    public static void main(String[] args) {

       

        a obj = new a();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
