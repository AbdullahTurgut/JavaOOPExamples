
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDuplicates("abdullah"));

        //        Duplicates Character in String
//        String str = "maheshbabu";
//        int length = str.length();
//
//        char[] ch = str.toCharArray();
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j < length; j++) {
//                 if(ch[i] == ch[j]){
//                     System.out.println("Duplicates -> " + ch[j]);
//                 }
//
//            }
//        }


        //----Duplicate Characters in string
//        String sentence = "How many duplicates are there?";
//        //sentence.charAt(0); index sayısına göre characteri döndürür
//
//        String characters = "";
//        String duplicates = "";
//        for(int i= 0; i < sentence.length();i++){
//            String current = Character.toString(sentence.charAt(i));
//            if(characters.contains(current)){
//                if(!duplicates.contains(current))
//                    duplicates += current + ",";
//            }
//            characters += current;//sentence'deki karakterleri atama yaptık
//
//        }
//        System.out.println(duplicates);


        //Given a list of integers, find the max element in it:
//        List<Integer> myList = Arrays.asList(2,5,7,1,8,-3,25);
//
//        System.out.println(findMax(myList));
//        System.out.println(findMin(myList)); // negatif değer olmadan
    }

    public static String findDuplicates(String str) {

        char[] ch = str.toCharArray();
        String duplicatesChar = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j]){
                    duplicatesChar += ch[j];
                    break;
                }

            }
        }
        return duplicatesChar;
    }

    //Find max element in a given list
    public static Integer findMax(List<Integer> myList) {
        //eğer listede hiç eleman yoksa
        if (myList.isEmpty())
            System.out.println("There is no element in list");
        //eğer listede bir eleman varsa
        if (myList.size() == 1)
            return myList.get(0);

        Integer maxEl = myList.get(0); // bu kısım önemli 0 vermektense listenin ilk elemanını almak lazım

        for (Integer element : myList) {
            if (element > maxEl) maxEl = element;
        }
        return maxEl;
    }

    //Find min element in a given list
    public static Integer findMin(List<Integer> myList) {
        //eğer listede hiç eleman yoksa
        if (myList.isEmpty())
            System.out.println("There is no element in list");
        //eğer listede bir eleman varsa
        if (myList.size() == 1)
            return myList.get(0);
        Integer minElement = myList.get(0);

        for (Integer element : myList) {
            if (element < minElement && element > 0) minElement = element;
        }
        return minElement;
    }
}