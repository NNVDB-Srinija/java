//Character hasing using java
import java.util.*;
import java.lang.*;
public class char_hash {
    public static void main(String [] args)
    {
    int code=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word:");
    String stg=sc.next();
    System.out.println("Enter the number of characters you want the count: ");
    int n=sc.nextInt();
    System.out.println("Enter the characters:");
    char[] a=new char[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.next().charAt(0);
    }
    int temp[]=new int[26];
    for(int i=0;i<stg.length();i++)
    {
        code=(int)stg.charAt(i);
        code=code-97;
        temp[code]+=1;
    }
    for(int i=0;i<n;i++)
    {
        code=(int)a[i];
        code=code-97;
        System.out.println(temp[code]);
    }
    }
}
