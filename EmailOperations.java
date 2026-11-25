import java.util.Scanner;

class EmailOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        System.out.println("Length: " + email.length());

        int pos = email.indexOf("@");

        String username = email.substring(0, pos);
        String domain = email.substring(pos + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        if (domain.equals("bmsce.ac.in"))
            System.out.println("Valid BMSCE email");
        else
            System.out.println("Not a BMSCE email");

        System.out.println("Lowercase: " + email.toLowerCase());

        System.out.print("Enter prefix: ");
        String prefix = sc.nextLine();

        if (email.startsWith(prefix))
            System.out.println("Email starts with prefix");
        else
            System.out.println("Email does not start with prefix");

        if (email.endsWith("bmsce.ac.in"))
            System.out.println("Email ends with valid domain");
        else
            System.out.println("Email does not end with valid domain");

        System.out.println("Updated email: " +
                email.replace("bmsce.ac.in", "cse.bmsce.ac.in"));

        System.out.print("Enter sequence to search: ");
        String seq = sc.nextLine();

        if (email.contains(seq))
            System.out.println("Sequence found");
        else
            System.out.println("Sequence not found");

        System.out.println("Trimmed email: " + email.trim());

        System.out.print("Enter another email: ");
        String email2 = sc.nextLine();

        if (email.trim().equalsIgnoreCase(email2.trim()))
            System.out.println("Both emails are identical");
        else
            System.out.println("Emails are different");

        sc.close();
    }
}