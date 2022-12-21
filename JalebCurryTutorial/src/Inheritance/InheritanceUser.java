package Inheritance;

import Interface.Talk;

//bu class abstract bu yüzden main classtan bir objesini oluşturamam
public abstract class InheritanceUser implements Talk {
    //  ENUM KULLANIMI
    public enum status { active , innactive , probation};

    private String firstName;
    private String lastName;

    public status status;


    //InheritanceUser için constructor
    public InheritanceUser(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }


//    public String firstName;
//    public String lastName;
//    public boolean verified = false;

    //bu methodu abstract yapıcam ve body kısmı olmayacak artık
//    public abstract void sayHello();

    //Super methodunun kullanımı için
//    public void sayHello(){
//        System.out.println("User version");
//    }


}
