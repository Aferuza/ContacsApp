import java.util.Scanner;

public class User {
    public String name;
   public static int choiceN;
    public static void main(String[]args){
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter Yr name");
        String name = scObj.nextLine();
        System.out.println("Hello " + name);

        System.out.println("1. Manage Contacts" +
                            "\n2. Messages" +
                            "\n3. Quit");

        Scanner scOjContacts = new Scanner(System.in);
        System.out.println("Choose from the options above");
        int choices = scObj.nextInt();
        if(choices ==1 ){
        System.out.println(choices  + " Show all contacts" +
                "\n2. Add a new contact");
        if(choices ==2){
            System.out.println("1. send a list of ll messages" +
                    "\n2. Send  new message");

            if(choices== 3){
                System.out.println("quit");
            }
        }



        }
    }
}
