import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class a71_map {
    public static void main(String[] args) {
        //Map <String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>();

        students.put("A",1);
        students.put("F",2);
        students.put("K",5);
        students.put("S",9);
        students.put("L",22);

        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));            
        }



    }
}
