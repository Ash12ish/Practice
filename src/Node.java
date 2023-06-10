import java.util.Arrays;
import java.util.List;

class LinkedList {

    public static void main(String args[])
    {
        List<Integer> ls = Arrays.asList(1,2,4,5,4,3,5,6,0);
        ls.stream().distinct().forEach(System.out::println);
    }

}
