class a extends Thread{
    public void run(){
        for(int i=1;i<=100;i++)
		{
            System.out.println("vansh");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }
}

class b extends Thread{
    public void run(){
        for(int i=1;i<=100;i++)
		{
            System.out.println("****");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }
}


public class a66_threadpriorityandsleep {
    public static void main(String[] args) {
        a obj = new a();
        b obj1 = new b();

        //obj.show();
        //obj1.show();

        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());
        System.out.println(obj.getPriority());

        obj.start();
        try{
            Thread.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        obj1.start();
    }
}
