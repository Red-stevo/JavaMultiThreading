public class QuickSort {

    int[] arr;

    public int[] quickSort(int start, int end)
    {
        int point;
        /*This method will perform the sorting by recursion*/

        //call the method to perform each partition(placement).
//        point = partition(start, end);



        return  null;
    }




    public int partition(int start, int end) {

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
