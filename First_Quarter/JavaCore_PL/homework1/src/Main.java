import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            //First exercise
            String [] s = {"First", "Second", "Third"};
            ArrayElementsSwap.swap(s, 0, 2);
            System.out.println("Altered array:"+ Arrays.toString(s));


            //Second exercise
        String [] s1 = {"First1", "Second1", "Third1"};
        ArrayToArrayList.arrayToArrayList(s1);
        System.out.println("Converted array: " + Arrays.toString(s1));

        //Third exercise
        String [] s2 = {"First1", "Second1", "Third1"};
        ArrayToArrayList.arrayToArrayList(s1);
        System.out.println("Converted array: " + Arrays.toString(s1));

    }

}
