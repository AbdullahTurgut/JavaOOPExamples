package Inheritance;

import Interface.Talk;

public class Teacher extends InheritanceUser implements Talk {
    public Teacher(String fn, String ln) {
        super(fn, ln);
    }

    @Override
    public void sayHello() {
        System.out.println("Implemented sayHello method");
    }


//    @Override
//    public void sayHello() {
//        System.out.println("I'm a teacher.");
//    }
}
