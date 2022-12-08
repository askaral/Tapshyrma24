import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set1=new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(1);
        Set<Integer>set2=new HashSet<>();
        set2.add(1);
        set2.add(4);
        set2.add(3);
        System.out.println(symmetricDifference(set2,set1));
    }
    public static  Set<Integer> symmetricDifference(Set<Integer>set1,Set<Integer>set2) {
        Set<Integer>set3=new HashSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(set3);
        set1.addAll(set2);
        return set1;
        }

}