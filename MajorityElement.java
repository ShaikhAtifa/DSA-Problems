class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n=arr.length;
        int count=1;
        Arrays.sort(arr);
        ArrayList<Integer> newElm= new ArrayList<>();
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            else{
                count=1;
            }
            if(count> (n/3) && !newElm.contains(arr[i]))
            {
                newElm.add(arr[i]);
            }
            
        }
        return newElm;
    }
    
}
//Adding the Main Solution class only, U can run this program on online coding test platforms, or to run it locally, create a main function and call this function by inheriting the class Solution.
