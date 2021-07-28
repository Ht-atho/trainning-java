package Ass6;
import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args){
        ArrayList<Integer>  count = new ArrayList<>();
        count.add(0);
        count.add(1);

        System.out.println("Original array list: " + count);
        int increase = 2;
        count.set(1,increase);
        System.out.print("Replace second element: ");
        int num=count.size();
        for (Integer integer : count) {
            System.out.print(integer + " ");
        }
    }
}