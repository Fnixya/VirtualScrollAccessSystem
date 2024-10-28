package richardlab21g01project2.utils.objects;

public class Account {
    protected int id, phoneNumber;
    protected String firstName, lastName, address, email, hashed_pwd;
    protected boolean isAdmin;

    public Account() {}

    public Account(String firstName, String lastName, String address, int phoneNumber, String email, String pwd, boolean isAdmin) {
        // this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hashed_pwd = pwd;
        this.isAdmin = isAdmin;
    }
    

    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.firstName;
    }
    
    public String getAddress() {
        return this.firstName;
    }
    
    public String getEmail() {
        return this.firstName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}