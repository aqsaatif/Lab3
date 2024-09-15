import java.util.ArrayList;
public class AddressBook {
    private ArrayList <BuddyInfo> addressBook;

    public AddressBook() {
        addressBook = new ArrayList <BuddyInfo>();
    }
    public void addBuddy(BuddyInfo newBuddy){
        addressBook.add(newBuddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy);
    }
    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
