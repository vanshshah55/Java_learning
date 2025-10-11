abstract class car{
    // public void drive(){

    // }

    public abstract void drive();
    public abstract void fly();

    public void playmusic(){
        System.out.println("playing...");
    }
}

abstract class gaadi extends car{

    public void drive(){
        System.out.println("Driving...");
    }
}

class motor extends gaadi{
    public void fly()
	{
		System.out.println("Flying...");
	}
}



public class a45_abstractkeyword {
    public static void main(String[] args) {
        //car obj = new car();
        //car obj = new gaadi();
        car obj = new motor();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}
