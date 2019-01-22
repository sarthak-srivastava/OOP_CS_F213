/* Given an unsorted input array, write a program to find the pair of numbers whose sum
is equal to X. Get the input as command line arguments.
Input:
Array: 2 1 5 6 8 0 
X: 7
Output:
2 5
1 6
*/

import java.util.*;
class Q2{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++)
    arr[i] = sc.nextInt();
    int x = sc.nextInt();       
    HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();
    for(int i = 0; i<n;i++)
    {
        if(h.containsKey(x - arr[i]))
        {
            System.out.println( arr[i] +","+(x-arr[i]));
        }
        else
        {
            h.put(arr[i],i);
        }
    }
}

}