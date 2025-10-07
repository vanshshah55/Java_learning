
class computer{
    public void playmusic(){
        System.out.println("Playing music......");
    }

    public String pickmusic(int seconds){
        if (seconds>=300)
            return ("not valid");
        else
            return ("valid");
    }
}

public class a17_methods {
    public static void main(String[] args){
        computer obj = new computer();
        obj.playmusic();

        System.out.println(obj.pickmusic(340));


    }
}
