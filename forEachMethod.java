import java.util.ArrayList;
import java.util.List;

public class forEachMethod {

    public static void main(String args[]) {

        List<String> list = new ArrayList<String>();

        list.add("Sachin");
        list.add("Rahul");
        list.add("Dhoni");
        list.add("Virat");
        list.add("Rohit");
        list.add("Gambhir");
        list.add("Rathi");
        list.add("Raj");

        //Iterating by passing Lambda Expression
        System.out.println("Iterating by passing Lambda Expression:-");
        list.forEach((name -> System.out.println(name)));

        //By Method Reference
        System.out.println("By Method Reference:-");
        list.forEach(System.out::println);

        //Using Stream with ForEach
        System.out.println("Using Stream With ForEach:-");
        list.stream().filter(name -> name.startsWith("R")).forEach(System.out::println);

        //parallel stream with forEach
        System.out.println("Using parallel Stream With ForEach:-");
        list.stream().filter(name -> name.startsWith("R")).parallel().forEach(n -> System.out.println(n));

        //parallel stream with forEachOrdered
        System.out.println("Using Parallel Stream With ForEachOrdered:-");
        list.stream().filter(name -> name.startsWith("R")).parallel().forEachOrdered(n -> System.out.println(n));

    }
}
