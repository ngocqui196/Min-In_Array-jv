import java.util.Scanner;

public class MethodSeach {
    public int MinValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public int Index (int[] ar) {
        int index = 0;
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
                index = i;
            }
        }
        return index;
    }
}
