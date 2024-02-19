public class Main {
    public static void main(String[] args)
    {
        int[] arr = new int[]{12,32,41,54,12,43,1,45,1,78,12,45,778,23,12,12,67,332,5,12,5,76,23,566,34,54,23,5,34,65,34};

        QuickSort q = new QuickSort();

        int point = q.partition(0,(arr.length-1));
    }
}