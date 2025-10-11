
enum status{
    running, failed, pending, success;
}

public class a52_enum {
    public static void main(String[] args) {
        //status s = status.running;
        // status s = status.failed;
         //status s =  status.pending;
        // status s = status.success;

        // System.out.println(s);
        // System.out.println(s.ordinal());

        status[] ss = status.values();
        System.out.println(ss);

        for (status s : ss){
            System.out.println(s);
            System.out.println(s + " : "+ s.ordinal());
        }
    }
}
