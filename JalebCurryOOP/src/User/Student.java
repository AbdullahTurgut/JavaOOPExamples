package User;

public class Student extends User{
    public void verify(){
        System.out.println("Verifying for Student bro");
        setVerified(true);
    }
}
