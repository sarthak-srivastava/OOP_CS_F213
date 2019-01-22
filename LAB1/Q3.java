import java.util.*;
class Q3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n/10000 != 0)
        {
            System.out.println("Enter a 4 digit number only!");
            System.exit(0);
    }   String str = Integer.toString(n);
        printPermutation(str,"",0);
}
static int counter = 0;
    public static void printPermutation(String ques, String asf, int count)
    {   if((ques.length() == 0) && count == 3)
        {counter++;
            System.out.println(counter +". " +asf);
            return;}
        if(count == 3)
        {   counter++;
            System.out.println(counter +". " +asf);
            return;}
            if(ques.length()== 0)
            return;
    
            for(int i = 0;i < ques.length();i++)
            {   String left = ques.substring(0,i);
                String right = ques.substring(i+1);
                String roq = left+right;
                char ch = ques.charAt(i);
                printPermutation(roq, asf+ch,count+1); 
        }
    }
}