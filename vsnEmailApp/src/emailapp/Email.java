
package emailapp;
import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int defaultPasswordLength = 10;
    private  int mailboxCapacity = 1000;
    private String alternateEmail;
    private String companySuffix = "gorecore.com";

    //constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL GENERATED: " + this.firstName + " " + this.lastName);
        // calls the method for asking the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //need to call for the random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combine all this to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + department + "." + companySuffix;
        System.out.println("your email is: " + email);
    }

    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for OPS\n2 for DEVELOPMENT\n3 for ADMIN\n0 for none\nENTER department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "OPS\n1"; }
        else if (depChoice == 2) { return "DEVELOPMENT"; }
        else if (depChoice == 3) {return "ADMIN";}
        else { return " "; }
    }

    private String randomPassword(int length) {
        String passwordSet =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            System.out.println(rand);
            System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}
}
