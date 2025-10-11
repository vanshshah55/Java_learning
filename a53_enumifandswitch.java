enum status{
	Running, Failed, Pending, Success;
}

public class a53_enumifandswitch {
    public static void main(String[] args) {
        status s = status.Pending;

        switch(s){
            case Running:
            System.out.println("Running...");
            break;

             case Failed:
            System.out.println("Failed...");
            break;

             case Pending:
            System.out.println("Pending...");
            break;

             case Success:
            System.out.println("Success...");
            break;}

        if(s==status.Running)
            System.out.println("Runninggggg");
            else if(s==status.Failed)
    		System.out.println("Try Again");
    	else if ( s==status.Pending)
    		System.out.println("Please Wait");
            else
    		System.out.println("Done");
    	
        
        
        

        
    }
}
