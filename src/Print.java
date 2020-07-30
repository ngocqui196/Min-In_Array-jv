import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        int[] arr = {4,2,5,8,1,6,7,3};

        int dom = new MethodSeach().MinValue(arr);
        int index = new MethodSeach().Index(arr);
        System.out.printf("Min value: %d index: %d",dom,index);


    }
}
