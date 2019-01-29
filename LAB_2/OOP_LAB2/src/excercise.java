import java.io.*;
public class excercise {
	public static void main(String[] args)throws NumberFormatException, Exception{
BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
System.out.println("Enter 10 integers");
String str = in.readLine();
String[] inp = str.split(" ");
int sum = 0;
for(int i = 0;i<10;i++)
sum+= Integer.parseInt(inp[i]);
System.out.println("Sum is: "+sum);
	}
}