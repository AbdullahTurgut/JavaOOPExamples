import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysMain {
    public static void main(String[] args) { //method

        // 2D Arrays

        int[][] grades = {
                {1,2,3},
                {4,5,6,11,12,13},
                {7,8,9}
        };

        for (int row=0; row< grades.length;row++){
            System.out.print("[ ");
            for (int column = 0; column< grades[row].length;column++){
                System.out.print(grades[row][column] + " ");
            }
            System.out.println("]");
        }


        System.out.println(grades.length);
        System.out.println(grades[1][1]);
        System.out.println(Arrays.deepToString(grades));






//        String[] grades = new String[5];
//        Arrays.fill(grades,"");
//        System.out.println(Arrays.toString(grades));
//        List<String> testing =  Arrays.asList(grades); //returns List<String>
//
//        System.out.println(testing);




//        int[] grades = {1, 2, 5, 4};
//        int[] grades2 = {1, 2, 5, 4};
//
//        if(grades == grades2)
//            System.out.println("equal"); //çalışmadı
//
//        if(grades.equals(grades2))
//            System.out.println("equall"); //çalışmadı
//
//        if (Arrays.equals(grades,grades2))
//            System.out.println("Finally equals"); // çalıştı!





//        System.out.println(Arrays.toString(grades));
//        for (int i = 0; i < grades.length; i++) {
//            if (grades[i] == 3)
//                System.out.println("FOUND!!" + " -> " + grades[i] +" found at index " + i);
//        }


//        int[] grades = {1, 2, 3, 4, 5, 6, 11, 7, 8,};
//        int[][] grades1 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
//        System.out.println(Arrays.toString(grades)); // konsolda yazdırmak için
//        System.out.println(Arrays.deepToString(grades1)); // bu matrix arrays için
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] grades = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            int x = input.nextInt();
//            grades[i] = x;
//        }
//        System.out.println(Arrays.toString(grades));
    }

}
