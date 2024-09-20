public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;
    public String getName() {
        return name;
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "Carleton", "623");
        System.out.println("Hello world!");
        System.out.println(buddy.getName());
    }
}
