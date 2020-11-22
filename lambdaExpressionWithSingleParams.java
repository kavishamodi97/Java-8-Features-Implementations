@FunctionalInterface //it is optional
interface stringConcat {
    public String strConCat(String s);
}

public class lambdaExpressionWithSingleParams {

    public static void main(String args[]) {

        stringConcat str = (s) -> {
            return "Today is " + s;
        };
        System.out.println(str.strConCat("Sunny Day!"));

        stringConcat str1 = (s) -> {
            return "Today is " + s;
        };
        System.out.println(str.strConCat("Working Day!"));
    }

}
