import java.util.ArrayList;

public class Contacts {

    private String name;
    private String number;
    private String email;
    private ArrayList <Message>message;


    public Contacts(String name, String number, String email, ArrayList <Message>message) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.message= message;
    }

    public Contacts(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
        //wn creating new ontact- save array mess as empy list
        this.message= new ArrayList<>();

    }

    public void getInfo(){
        System.out.println("Name " + name + "\n Number "+ number+ "\nEmail "+ email);

    }
}
