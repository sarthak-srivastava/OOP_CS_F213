import java.util.*;
public class excercise2 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 10 space seperated integers:");
	int[] arr = new int[10];
	int sum = 0;
	for(int i=0;i<10;i++)
		{arr[i] = sc.nextInt();
		sc.nextLine();
		sum+=arr[i];
		}
	System.out.println(sum);
}
}
