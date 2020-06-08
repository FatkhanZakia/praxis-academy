public class App {
    public String getGreeting(){
        return "Hello Fatan";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
