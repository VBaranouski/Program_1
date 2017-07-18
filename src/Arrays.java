/**
 * Created by Vlad on 7/17/17.
 */
public class Arrays extends Operations{


    public void showArray(int[] arr) {
        int i;
        for (i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    public void bubbleSorting(int[] arr) {
        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

        }


    }
}
