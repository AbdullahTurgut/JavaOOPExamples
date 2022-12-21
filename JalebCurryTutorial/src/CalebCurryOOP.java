import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CalebCurryOOP {

    /*
     * BURASI FIELD OLARAK BİLİNİR CLASS İÇİ AMA METHOD DIŞI
     * BURAYA TANIMLANAN DEĞERLER GLOBALDİR
     * */


    // PRIVATE FIELD OLUŞTURUP
    private String name;

    //GETTER VE SETTER METHODLARI ILE DUZENLEME YAPABİLİRİZ VE DIŞARIYA AÇABILIRIZ
    //AYNI ZAMANDA GETTER VE SETTER METHODLARI BİR NEVİ ENCAPSULATION(KAPSÜLLEME) ÖRNEĞİDİR.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public void talk() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (name.length() <= 7) {
            System.out.println("Lütfen en az 8 karakterli bir isim girin!");
            name = scanner.nextLine();
        }
        System.out.println("Hoşgeldin, " + name);
    }

    public static void printNames(List<CalebCurryOOP> names) {
        for (CalebCurryOOP name : names) {
            System.out.println(name.getName());
        }
    }

    public String output() {
        return "Hi, my name is " + getName() + ".";
    }

    public String output(boolean nice) {
        if (nice) {
            return "You are a beautiful. - " + getName() + ".";
        }
        return "You are a freak. - " + getName() + ".";
    }

    public static int searchList(List<CalebCurryOOP> names, String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void changeName (CalebCurryOOP x){
        x.setName("Changed");
    }

    @Override
    public String toString() {
        return "CalebCurryOOP{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalebCurryOOP that = (CalebCurryOOP) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
