import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }

    public void add(Contact c){
        contacts.add(c);
    }
    public Contact getContact(int i){
        if(i+1>contacts.size()){
            return null;
        }
        return contacts.get(i);
    }
    public String toString() {
        for(Contact a: contacts){
            System.out.println(a.toString());
        }
        return "";
    }

    public static void main(String args[]){
        AddressBook a = new AddressBook();
        a.toString();
        a.getContact(0);
    }
}
