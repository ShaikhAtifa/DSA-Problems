import java.util.Scanner;

public class SecondLargestArray{
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array:");
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
          int sl=-1;
        int l=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>l)
            {
                sl=l;
                l=arr[i];
            }
            else if(arr[i]> sl && arr[i]!=l)
            {
                sl=arr[i];
            }
        }
        System.out.println("Second Largest element in array is:"+sl);
        System.out.println(" Largest element in array is:"+l);

    }
}
