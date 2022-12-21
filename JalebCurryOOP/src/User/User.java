package User;

import java.util.List;

public class User {
    private String name;
    private String membership = "Bronze";

    private boolean verified = false;


    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public void verify(){
        System.out.println("Verifying...");
        setVerified(true);
    }
    public static List<User> admins;
    public static void print_admin_names(){
        for (User admin: admins) {
            System.out.println(admin.getName());
        }
    }

    //default constructor
    public User(){
        // constructor sayesinde extends edilen Student classı hata vermedi
    }

    // name ve membership'li constructor User clasına ait
    public User(String name,String membership){
        setName(name);
        setMembership(membership);

    }

    public User(String name) {
        setName(name);
    }

    // toString ve equals methodlarını override ettik
    public String toString(){
        return "Taichiiii";
    }
    public boolean equals(User u2){
        if(getName() == u2.getName() && getMembership() == u2.getMembership()){
            return true;
        }
        return false;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
//        System.out.println("Name is set");
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
//        System.out.println("Membership is set");
    }

    // Membership için bir class değilde enum oluşturacağım
    public void setMembership(Membership membership){
        this.membership = membership.name();
    }

    public enum Membership {
        Bronze,Silver,Gold,Switch;
    }
}
