class Z{

}
class a implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++)
		{
			System.out.println("Vansh");
            try {
                 Thread.sleep(10);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class b implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("****");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class a67_runnablevsthrowable {
    public static void main(String[] args) {
        //Runnable obj1=new Runnable()
//    	{
//    		public void run()
//    		{
//    			for(int i=1;i<=5;i++)
//    			{
//    				System.out.println("Hello");
//    				try {
//    					Thread.sleep(10);
//    				}catch(InterruptedException e) {
//    					e.printStackTrace();
//    				}
//    			}
//    		}
//   		};

            Runnable obj1 =() ->{
                for (int i =1;i<=5;i++){
                    System.out.println("Shah");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                }
            };

            Runnable obj2 =() ->{
                for (int i =1;i<=5;i++){
                    System.out.println("--------");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                }
            };

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.start();
            t2.start();
    }
}
