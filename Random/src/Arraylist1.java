//Creating a list of unique elements taken from the user, then sorting and printing these elements using an ArrayList in Java

import java.util.*;

public class Arraylist1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String input = sc.nextLine();
            try {
                int temp = Integer.parseInt(input);
                if (!arr.contains(temp)) {
                    arr.add(temp);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer.");
                i--; // decrement i to try again
            }

        }

        Collections.sort(arr);
        System.out.println(arr);

    }
}

//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//                            ALTERNATE SOLUTION

//   Scanner sc = new Scanner(System.in);
//
//        ArrayList <Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            String input = sc.nextLine();
//            try {
//                int temp = Integer.parseInt(input);
//                arr.add(temp);
//
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input, please enter an integer.");
//                i--; // decrement i to try again
//            }
//
//        }

//        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
//        for (int i = 0; i < arr.size(); i++) {
//            int current = arr.get(i);
//            boolean isDuplicate = false;
//            for (int j = 0; j < i; j++) {
//                int previous = arr.get(j);
//                if (current == previous) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                uniqueElements.add(current);
//            }
//        }


//        Collections.sort(uniqueElements);
//        System.out.println(uniqueElements);







