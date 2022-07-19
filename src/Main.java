import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String names = scanner.next();
            a.add(i, names);
        }
        System.out.println(a);

        for (int i = 0; i < 5; i++) {
            String names = scanner.next();
            b.add(i, names);
        }
        System.out.println(b);

        ArrayList<String> c = new ArrayList<>();
        c.add(a.get(0));
        c.add(b.get(4));
        c.add(a.get(1));
        c.add(b.get(3));
        c.add(a.get(2));
        c.add(b.get(2));
        c.add(a.get(3));
        c.add(b.get(1));
        c.add(a.get(4));
        c.add(b.get(0));

        MyComparator myComparator = new MyComparator();

        Collections.sort(c, myComparator);
        System.out.println(c);





    }
}