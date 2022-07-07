package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("DALTON", "REIGNS");
        em1.setAlternateEmail("barfsack@mail.com");
        System.out.println(em1.getAlternateEmail());
    }
}