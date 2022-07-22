import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] ns = { 1, 4, 9, 16, 25 };
        List<Integer> ls= Arrays.asList(ns);
        ls=new ArrayList<>(ls);
        Collections.reverse(ls);
        System.out.println(ls);
        System.out.println(Arrays.toString(ns));
    }
}