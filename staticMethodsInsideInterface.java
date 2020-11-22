interface myInterface {

    //static method
    static void staticMethod() {
        System.out.println("Hello: " + "Static Method Inside Interface");
    }

    //abstract method
     void abstractSayHello();

}

public class staticMethodsInsideInterface implements myInterface {
    @Override
    public void abstractSayHello() {
        System.out.println("Hello: " + "Abstract Method implementation");
    }

    public static void main(String args[]) {
        staticMethodsInsideInterface st = new staticMethodsInsideInterface();
        //calling abstract method
        st.abstractSayHello();
        //calling static method inside interface
        myInterface.staticMethod();
    }
}
