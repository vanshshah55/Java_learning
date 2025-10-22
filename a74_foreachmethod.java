import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class a74_foreachmethod {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(4,2,1,5,3);

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        Consumer<Integer> con = n -> System.out.println(n);


        nums.forEach(n->System.out.println(n));
        nums.forEach(con);
        nums.forEach(null);
    }
}
