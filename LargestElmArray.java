import java.util.Scanner;
class LargestElementArray{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        int l=0;
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]> l)
            {
                l=arr[i];
            }
        }
        System.out.println("Largest ELement in Array:"+l);
    }
}
