import java.util.ArrayList;
import java.util.Arrays;

public class Sort {

    public static int[] bubbleSort(int[] array) {
            
        return array;

    }

    public static String[] bubbleSort(String[] array) {

        return array;

    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {

        return list;

    }

    public static int[] selectionSort(int[] array) {
        int mIndex;
        int temp;
        for (int i = 0; i < array.length; i++){
            mIndex = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[i]){
                    mIndex = j;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;

    }

    public static String[] selectionSort(String[] array) {
        int mIndex;
        String temp;
        for (int i = 0; i < array.length; i++){
            mIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j].compareToIgnoreCase(array[mIndex]) < 0){ //compare to ignore case!!
                    mIndex = j;
                }
            }
            // find minimum index before swapping
            temp = array[i];
            array[i] = array[mIndex];
            array[mIndex] = temp;
        }


        return array;

    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        int mIndex;
        String temp;
        for (int i = 0; i < list.size(); i++){
            mIndex = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j).compareToIgnoreCase(list.get(mIndex)) < 0){
                    mIndex = j;
                }

            }
            temp = list.get(i);
            list.set(i,list.get(mIndex));
            list.set(mIndex,temp);
        }
        return list;

    }

}
