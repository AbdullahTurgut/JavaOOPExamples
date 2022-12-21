package User;

public class Teacher extends User{
    public void verify(){
        System.out.println("Verifying for Teacher bro");
        setVerified(true);
    }
}
