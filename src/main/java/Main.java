import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //we write logic for app here
    private static ArrayList<Contacts> contacts;
    private static Scanner scanner;

    public static void main(String[] args) {

        //initialize contacts ArrayList
        contacts = new ArrayList<>();
        System.out.println("Welc to pr world");
        //show t3 options
        showInitOptions();
    }

    private static void showInitOptions() {
        System.out.println("Please select one " + "\n\t1. Manage Contacts" + "\"\\n\\t2 Messages " + "\n\t3. Quit");
        //initialize scanner
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            case 3:
                searchForContact();
                break;
            case 4:
                deleteContact();
                break;
            case 5:
                showInitOptions();
                break;
        }
    }
    private static void deleteContact(){
        System.out.println("Please enter cont name");
        String name= scanner.next();
    }

    private static void manageContacts() {
        System.out.println("Pl select one " + "\n\t1. Select all contacts" + "\n\t2.Add a cont" + "\n\t3. Search for c");
        //we need users input, use scanner, we are not initalizing it here as we have already done that in show initial options method
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllContacts();
                break;
            case 2:
                addContacts();
                break;
            case 3:
                searchForContact();
                break;
            default:
                showInitOptions();
                break;
        }
    }

    private static void searchForContact() {
        System.out.println("Enter contact name");
        String name = scanner.next();
        if (name.equals(""))
            System.out.println("enter the name");
        searchForContact();
        else{
            boolean doesExist = false;
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    c.getDetails();
                }
            }

            if (!doesExist) {
                System.out.println("There is no such contact n yr phone");
            }
        }
        showInitOptions();
    }

    private static void addContacts() {
        System.out.println("Add a new contact ");
        String name = scanner.next();
        System.out.println("Enter contacs number");
        String number = scanner.next();
        if (name.equals("") || (number.equals(""))
        System.out.println("Please ener all info"));
        addContacts();
        else{
            Contact contact = new Contact(name, number);
            contacts.add(contact);
        }
        showInitOptions();


    }

    private static void showAllContacts() {
        for (Contacts c : contacts) {
            c.getInfo();
            showAllContacts();
        }
    }
}
