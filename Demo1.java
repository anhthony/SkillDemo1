public class Demo1
{
    static int sumIntArray(int[] arr)
    {
        int sum = 0;
        for(int num : arr)
        {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4};
        System.out.println(sumIntArray(arr1));
    }
}
