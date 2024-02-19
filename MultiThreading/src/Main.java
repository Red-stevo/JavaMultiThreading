public class Main {
    public static void main(String[] args)
    {
        int[] arr = new int[]{10,9,8,7,6,5,4,3,2,1,0};

        QuickSort q = new QuickSort();

       int point = q.partition(arr,0,(arr.length-1));

       ThreadGenerator threadGenerator = new ThreadGenerator(arr, 0, point-1);
       threadGenerator.start();

       ThreadGenerator threadGenerator1 = new ThreadGenerator(arr,point+1,arr.length-1);
       threadGenerator1.start();

       int[] array = threadGenerator1.getArr();

       for(int i : array)
       {
           System.out.println(i);
       }
    }
}