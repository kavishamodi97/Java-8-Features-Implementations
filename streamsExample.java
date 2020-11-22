import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;

public class streamsExample {

    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();

        list.add("Sachin");
        list.add("Rahul");
        list.add("Dhoni");
        list.add("Virat");
        list.add("Rohit");
        list.add("Raj");
        list.add("Gir");
        list.add("Rama");

        long count = list.stream().filter(str -> str.startsWith("R")).count();
        System.out.println(count);
        list.stream().filter(str -> str.startsWith("R")).forEach((n -> System.out.println(n)));

        List<String> filterList = list.stream().filter(str -> str.length() > 4).collect(Collectors.toList());
        System.out.println(filterList);

        Stream.iterate(1, i->i+1)
                .filter(i->i%2==0)
                .limit(5)
                .forEach(System.out::println);
    }
}
