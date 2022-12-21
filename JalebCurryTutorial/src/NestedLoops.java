public class NestedLoops {
    public static void main(String[] args) { //method
//        int i = 10;
//        while (i >= 0) {
//            int k = i;
//            while (k >= 0){
//                System.out.println(k + " ");
//                k--;
//            }
//            i--;
//        }
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
