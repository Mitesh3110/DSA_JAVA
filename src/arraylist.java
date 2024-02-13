import java.util.ArrayList;

public class arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

//        list.remove(2);
//        list.set(3,50);
        System.out.println(list.contains(50));
        System.out.println(list.get(3));
        System.out.println(list);
    }
}
