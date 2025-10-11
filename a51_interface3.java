

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends


interface a
{
//	public abstract void show();
//	public abstract void config();
	int age=20;            // final and static 
	String area="Mumbai";
	
	void show();
	void config();
}

interface x{
    void run();
}

interface y extends x{

}

class b implements a,y{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofig");
	}
	public void run()
	{
		System.out.println("running...");
	}
}


public class a51_interface3 {
    public static void main(String[] args) {
        a obj;
        obj = new b();
        obj.show();
        obj.config();

        x obj1 = new b();
        obj1.run();
    }
}
