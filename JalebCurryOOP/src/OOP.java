import User.User;
import User.Student;
import User.Teacher;
import java.util.ArrayList;
import java.util.List;

public class OOP {
    public static void main(String[] args) {

        //EXTENDING CLASS WITH INHERITANCE
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.setName("Student");
        teacher.setName("Teacher");
//        System.out.println(teacher.getMembership());
        //burda User ile oluşturduğumu setMembership gibi methodlarıda Student classı ile kullanabiliriz
//        System.out.println(student.getMembership());
//        System.out.println(student.isVerified());

        User.admins = new ArrayList<User>(); // static olarak açtığım admins listesinden hafıza aldım
        User.admins.add(student);
        User.admins.add(teacher);
        User.admins.add(new User("Serseri"));
        User.admins.add(new User("Krall"));
        User.admins.add(new User("Alcor"));
//        User.print_admin_names();

        for (User u: User.admins) {
            u.verify();
        }




        //Tip: her kurduğumuz yeni nesne ile bir constructor tetikliyoruz aslında
//        User u = new User(); //burda new User() ile default constructor tetikledik
//        u.setName("Abdullah");
        /*
        List<User> users = new ArrayList<User>(); // Soldaki List<User> aslında interface kullanıyor
        users.add(new User("Abdullah"));
        users.add(new User("Asya"));
        users.add(new User("Eray"));
        
        for (User u : users){
            System.out.println(u.getName());
        }

        */
        // FOREACH OLMAYAN HALİ
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i).getName());
//        }
















//        u.setName("Abdullah");
//        u.setMembership(User.Membership.Switch);
//        System.out.println(u.getName() + " has taken " + u.getMembership() + " packet in Knight Online World.");
//
//        User userConsructor = new User("Eray Turgut","Gold");
//
//        System.out.println(userConsructor.getName());
//        System.out.println(userConsructor.getMembership());
//        System.out.println(u); // toString ile oluşturduğum methodu döndürdü
//        System.out.println(u.equals(userConsructor)); //aynı nesneler olmadıkları için false döndürür(içerikleride farklı)
//        User u2 = new User("Abdullah","Switch"); //böyle açıp denersek
//        System.out.println(u.equals(u2)); //User classında oluşturduğumuz equals methodu ile true döndürür
 




//        User u = new User();
//        u.name = "Abdullah";
//        User u2= new User();
//        u2.name = "Asya";
//        System.out.println(u.name);
//        System.out.println(u2.name);
    }
}