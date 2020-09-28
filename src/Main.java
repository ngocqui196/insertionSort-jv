public class Main {
    static void insertionSort(int[] a) {
        int valueInsert;
        int j;
        for(int i = 0;i < a.length ;i++) {
            valueInsert = a[i];
            j = i-1;
            while(j >= 0  && a[j] > valueInsert) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = valueInsert;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,9,4,6,7,12,4,3,5,2,0};
        insertionSort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
