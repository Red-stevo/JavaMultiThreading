public class ThreadGenerator extends Thread{

    int[] arr;
    int start;

    int end;

    public ThreadGenerator(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    private QuickSort quickSort;
    @Override
    public void run() {
    quickSort = new QuickSort();

    quickSort.quickSort(arr,start,end);

    }
}
