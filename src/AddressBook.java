import java.util.ArrayList;
public class AddressBook {
    private ArrayList <BuddyInfo> addressBook;

    public AddressBook() {
        addressBook = new ArrayList <>();
    }
    public void addBuddy(BuddyInfo newBuddy){
        if (newBuddy != null){
            addressBook.add(newBuddy);
        }
    }
    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < addressBook.size()){
            return addressBook.remove(index);
        }
        return null;
    }
    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Homer", "Carleton", "623");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println("Buddy added!");
        addressBook.removeBuddy(0);
    }
}
