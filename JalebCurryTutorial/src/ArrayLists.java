import java.util.*;

public class ArrayLists {
    public static void main(String[] args) { //method
        List<Integer> allGrades = Arrays.asList(5, 3, 2, 1, 4, 6);
        //-------Sort and Reverse a List with Collections.sort & Collections.reverse
        Collections.sort(allGrades);
        Collections.reverse(allGrades);
        for (int grade : allGrades) {
            System.out.println(grade);
        }


//        int[] grades = new int[allGrades.size()];
//
//        for (int i = 0; i < allGrades.size(); i++) {
//            grades[i] = allGrades.get(i);
//        }
//        System.out.println(Arrays.toString(grades));


//        List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
//        allGrades.add(Arrays.asList(5,1,2,3,4,6));
//        allGrades.add(Arrays.asList(5,11,22,33,44,61));
//        allGrades.add(Arrays.asList(5,13,24,35,46,62));
//
//        //---Nested For Each Loop
//        for (List<Integer> grades : allGrades){
//            for(int grade : grades){
//                System.out.print(grade + " ");
//            }
//            System.out.println();
//        }

//        List<Integer> grades = new ArrayList<Integer>(); //bir arrayList oluşturduk (LinkedList <-> ArrayList)
//        List<Integer> grades = Arrays.asList(5,3,4,2,1,7); // bu şekilde de bir dizi listesi oluşturulabilir
//        System.out.println(Arrays.toString(grades.toArray()));
//        System.out.println(grades.size());
//        for (int i= 0; i<grades.size();i++){
//            grades.set(i, grades.get(i) * 2);
//            System.out.println(grades.get(i));
//        }

        //-----FOR EACH LOOP
//        for(int grade : grades){
//            System.out.println(grade);
//        }


        //List<Integer> grades = new LinkedList<Integer>(); bunuda yapabiliriz
//        grades.add(5);
//        grades.add(2,11);
//        int input;
//        for (int i = 0; i<5;i++){
//            input = scanner.nextInt();
//            grades.add(i,input);
//        }
//        System.out.println(grades.size());
//        System.out.println(grades.get(3));
        //System.out.println(grades.get(0));
//        grades.add(5);
//        grades.add(10);
//        grades.add(1,7); //1.indexi 7 yapar 10 2.indexe kayar
//        System.out.println(grades.isEmpty()); // liste boşsa true dolu ise false döndürür(Returns boolean depends on list)
//        System.out.println(grades.indexOf(7)); // 7 olan indexi döndürür yoksa -1 döndürür
//        System.out.println(grades.contains(7)); // 7 varsa true döndürür yoksa false (Returns boolean)
//        grades.clear(); // Listeyi temizler(Siler void fonksiyon bu yüzden konsol bastıramayız)
//        System.out.println(grades.size()); // 0 döndürdü cleardan sonra



        /*
         * Array List<Integer> grades = new ArrayList<Integer>();
         * grades.add(5); // listeye eleman eklemek için
         * grades.get(0); // listenin 0.indexini döndürür (Returns)
         * grades.set(0,10); //listenin 0.indexine 10 atanır
         * grades.size(); // listenin size'ını döndürür (Returns)
         *
         * */
    }
}
