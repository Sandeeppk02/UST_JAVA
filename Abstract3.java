abstract class SortingAlgorithm {
    abstract void sort(int[] arr);

    void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class BubbleSort extends SortingAlgorithm {
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        SortingAlgorithm sorter = new BubbleSort();

        System.out.println("Before Sorting:");
        sorter.display(arr);

        sorter.sort(arr);

        System.out.println("After Sorting:");
        sorter.display(arr);
    }
}
