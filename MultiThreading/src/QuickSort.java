public class QuickSort {

    public int[] quickSort(int[] arr, int start, int end)
    {
        int point = partition(arr,start,end);
        /*This method will perform the sorting by recursion*/
        if(start < end)
        {
            quickSort(arr,start,point-1);
            quickSort(arr,point+1,end);
        }
        return  arr;
    }


    public int partition(int[] arr, int start, int end) {

        int pivot = start;

        while (start < end)
        {
            while (arr[start] <= arr[pivot] && start < end) ++start;

            while (arr[end] > arr[pivot] && start <= end) --end;

            /*Performing the partition swap.*/
            if(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        /*performing the position swap*/
        int temp = arr[end];
        arr[end] = arr[pivot];
        arr[pivot] = temp;

        return end;
    }
}
