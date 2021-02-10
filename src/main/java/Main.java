import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //we write logic for app ere

    private static ArrayList<Contacts>contacts;
    private static Scanner scanner;
    public static void main(String[]args){

        //initialize contacts ArrayList
        contacts= new ArrayList<>();
        System.out.println("Welc to pr world");
        //show t3 options
        showInitOptions();

    }

    private static void showInitOptions() {
        System.out.println("Please select one "+ "\n\t1. Manage Contacts" + "\"\\n\\t2 Messages "+ "\n\t3. Quit");


        //initialize scanner
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                manageContacts();
                break;
                case2:
            manageMessages();
            break;
            default:
                break;
        }
    }

    private static void manageContacts() {
        System.out.println("Pl select one " +"\n\t1. Select all contacts" + "\n\t2.Add a cont" + "\n\t3. Search for c");
        //we need users input, use scanner, we are not initalizing it here as we have already done that in show initial options method
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
            showAllContacts();
            break;
            case 2:
                addContacts();
                break;
            case 3:
                searchForCon();
                break;
            default:
                showInitOptions();
            break;
        }
    }

    private static void addContacts() {

    }

    private static void showAllContacts() {
        for(Contacts c: contacts){
            c.getInfo();
            showAllContacts();
        }
    }
}
