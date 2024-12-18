public class Main {
    public static void main(String[] args) {
        User john = new User("john", 1946, "February", 6);
        john.displayInfo();
        System.out.println("  -----------------------------");
        //"nicolas", 1964 , "January", 7
        Admin nicolas = new Admin("nicolas", 1964 , "January", 7);
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
    }
}