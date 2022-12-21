package Inheritance;

import Interface.Talk;

public class Student extends InheritanceUser implements Talk {

    public boolean verified = true;
    public String major;

    public Student(String fn,String ln){
        super(fn,ln);
    }

    @Override
    public void sayHello() {
        System.out.println("Implemented");
    }


//
    //Student class'ı için custom constructor oluşturacağım
    //methoddan farkı constructorda dönüş tipi yok void,int string vs. gibi
//    public Student() {
        //burası boş kalabilir çünkü parametreli constructor açtık default olanda olması lazım
//    }
//
//    public Student(String f, String l) {
//        firstName = f;
//        lastName = l;
//    }


    //Super methodu örneği
//    @Override
//    public void sayHello() {
//        super.sayHello();
//        System.out.println("Hello my " + major + " friend.");
//    }
}
