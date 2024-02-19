public class ThreadGenerator extends Thread{

    private int[] arr;
    private int start;

    private int end;

    public int[] getArr() {
        return arr;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

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
