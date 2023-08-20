//Реализовать алгоритм пирамидальной сортировки (HeapSort).
public class HW3 {
    public static void main(String args[]) {
        int[] arr = { 10, 8, 7, 22, 18, -3, 0, 99 };

        HeapSort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    private static void HeapSort(int[] arr) {
        int lenArr = arr.length;
        for (int i = lenArr / 2 - 1; i >= 0; i--)
            heapArr(arr, i, lenArr);
        // с max элемента (0ой) - в конец массива
        for (int i = lenArr - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapArr(arr, 0, i);
        }
    }

    // метод, по которому родитель всегда MAX по сравнению со своими потомками:
    private static void heapArr(int[] arr, int i, int lenArr) {
        int leftSon = i * 2 + 1; // левай потомок
        int rightSon = i * 2 + 2; // правый потомок
        int maxEl = i;

        if (leftSon < lenArr && arr[leftSon] > arr[maxEl])
            maxEl = leftSon;
        if (rightSon < lenArr && arr[rightSon] > arr[maxEl])
            maxEl = rightSon;
        // поменяли местами , если потомки больше родителя:
        if (i != maxEl) {
            int temp = arr[i];
            arr[i] = arr[maxEl];
            arr[maxEl] = temp;
            // для последующих потомков ... до конца
            heapArr(arr, maxEl, lenArr);
        }

    }

}
