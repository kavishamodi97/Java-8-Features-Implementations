import java.util.ArrayList;
import java.util.List;

public class lambdaExpressionWithForEach {

    public static void main(String args[]) {

        List<String> list = new ArrayList<String>();

        list.add("Sachin");
        list.add("Rahul");
        list.add("Dhoni");
        list.add("Virat");
        list.add("Rohit");

        // lambda expression
        list.forEach((l) -> System.out.println(l));
    }
}
