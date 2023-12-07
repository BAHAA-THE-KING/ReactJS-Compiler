import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        System.out.println(asd.class.getSimpleName());
        asd dsa=new asd("koko", new ArrayList<>());

        System.out.println();

    }
}
class asd{
    String name;
    List<Integer> nums;
    public asd(String name,List<Integer> nums){
        this.name=name;
        this.nums=nums;
    }
}