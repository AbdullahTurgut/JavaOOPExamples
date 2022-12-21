import Inheritance.InheritanceUser;
import Inheritance.Student;
import Inheritance.Teacher;
import Interface.Talk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //method

        Student s = new Student("Abdullah","Turgut");
//        s.sayHello();
        // enum örneği student class'ı üzerinden
        s.status = s.status.probation;
        System.out.println(s.status);
        switch (s.status){
            case probation:
                System.out.println("Ouch");
                break;
            case active:
                System.out.println("Great!");
                break;
            case innactive:
                System.out.println("come back");
                break;
        }

        List<Talk> thingsThatTalk = new ArrayList<Talk>();
        thingsThatTalk.add(s);




//        Student student = new Student(); // bu aslında bir default Constructor örneği
//        student.major = "Computer Engineer";
//        student.firstName = "Abdullah";
//        student.lastName = "Turgut";
//        Student s = new Student("Eray","Turgut");
//        Teacher t=new Teacher();
//        t.firstName = "Asya";
//        t.lastName = "Turgut";

//        List<InheritanceUser> users = new ArrayList<InheritanceUser>();
//        users.add(student);
//        users.add(t);
//        System.out.println(s.firstName);

//        Student superStudent = new Student("Lina","Turgut");
////        superStudent.sayHello();

//        for(InheritanceUser u : users){
//            u.sayHello();
//        }

//        String[] names = {"Abdullah","Asya","Eray"};
//        CalebCurryOOP name = new CalebCurryOOP();
//        name.setName("Abdullah");
//
//        CalebCurryOOP name1 = new CalebCurryOOP();
//        name1.setName("ASYA");
//
//        CalebCurryOOP name2 = new CalebCurryOOP();
//        name2.setName("Eray");
//
//        List<CalebCurryOOP> names = new ArrayList<CalebCurryOOP>(); // bu şekilde liste olarak da açabiliriz
//        names.add(name);
//        names.add(name1);
//        names.add(name2);
//        CalebCurryOOP.printNames(names);
//        System.out.println(name.output());
//        System.out.println(name.output(false));

//        System.out.println(CalebCurryOOP.searchList(names,"asya"));
//        System.out.println(name.equals(name.equals(name1)));
//        CalebCurryOOP.changeName(name2);
//        System.out.println(name2);

//        for(int i= 0; i< names.length;i++){
//            CalebCurryOOP c = new CalebCurryOOP();
//            c.setName(names[i]);
//            coops.add(c);
//        }
//
//        for(CalebCurryOOP c : coops){
//            System.out.println(c.getName());
//        }


//        CalebCurryOOP coop = new CalebCurryOOP();
//        CalebCurryOOP coop1 = new CalebCurryOOP();
//        CalebCurryOOP coop2 = new CalebCurryOOP();
//        coop.setName("Abdullah");
//        coop1.setName("Asya");
//        coop2.setName("Eray");
//        coop.setName("Abdullah");
//        System.out.println(coop.getName());
//        System.out.println(coop.multiplication(5,25));
//        coop.talk();
//        List<CalebCurryOOP> coops = new ArrayList<CalebCurryOOP>(); // bu şekilde liste olarak da açabiliriz
//        coops.add(coop);
//        coops.add(coop1);
//        coops.add(coop2);
//        System.out.println(coops.get(1).getName());


//      var x = new Main(); // creating a object main clas(java'nın oop ürünü olduğunu unutmayalım)
//        System.out.println(x.charAt(0)); h döndürür (x = "hello" örneğin)
//        String password = "let me in";
//        System.out.println("Guess the password:");
//
//        Scanner scanner = new Scanner(System.in);
//        String guess = scanner.nextLine();
//        System.out.println(password.equals(guess)); // bu true döndürürken
//        System.out.println(password == guess); // bu false döndürür çünkü biri object biri string (Refrence / Primitive)
//
//        String a = "hi";
//        String b = "hi";
//        System.out.println(a == b); // true döndürcek (Primitive / Primitive)
        // primitives - this works
        // objects - this does not work!
        // values of objects is a reference to the object
    }
}
// primitive types
// objects - instance of a class (class the data types )

// statically typed = variables are given data types. all  data types up front (before compiling)
// dynamically typed = variables do not have types

// data type - the type of data.
// literals - the value

// variable - stores some value
// expression - evaluates to a value
// operator - work on operands to produce a value
// operand - the thing(s) the operator works on

// class - Contains everything - has members
// methods - Do something
// arguments - What you pass to a method (part of the calling )
// parameter - Variables to store arguments ( part of definition )
// statements - Telling the computer something
// properties - Store something

// acces modifier (Burda public private protected falan) - Who can use?
// static - No instance of class is needed
// object - instance of class