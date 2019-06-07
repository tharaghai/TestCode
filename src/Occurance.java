import java.util.Scanner;

public class Occurance
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=scan.nextLine().toLowerCase();
        int count=0;
        for(char i='a'; i<='z'; i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                char ch=s1.charAt(j);
                if(ch==i)
                {
                    count++;
                }
            }
            if(count!=0)
            {
                System.out.println(i+" Occurs "+count+" times ");
                count=0;
            }
        }
    }
}
