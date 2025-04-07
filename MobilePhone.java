import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }
    public boolean addNewContact(Contact contact){
        for(Contact myContacts : myContacts){
            if(myContacts.getName().equals(contact.getName())){
                return false;
            }

        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldcontact, Contact newcontent){
        for(int i =0;i < myContacts.size() ;i++){
            if(myContacts.get(i).getName().equals(oldcontact.getName())){
                myContacts.set(i,newcontent);
                return true;
            }

        }
        return false;
    }

    public boolean removeContact(Contact contact){
        for(int i =0; i<myContacts.size();i++){
            if(myContacts.get(i).getName().equals(contact.getName())){
                myContacts.remove(i);
                return true;
            }
        }
        return false;
    }
    private int findContact(String contact){
        for(int i = 0; i <myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(contact)){
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }
    public Contact queryContact(String name){

        if(findContact(name) > 0){
            return myContacts.get(findContact(name));
        }
        return null;

    }

    public void  printContacts(){
        System.out.println("Contact List:");
        for(int i= 0; i< myContacts.size(); i++){
            String name = myContacts.get(i).getName();
            String phoneNumber = myContacts.get(i).getPhoneNumber();
            System.out.println((i + 1) + ". " + name + " -> " + phoneNumber);
        }

    }
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}