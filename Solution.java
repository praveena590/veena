import java.util.*;
class Solution
{
   public static void main(String[] args)
   {
    double temp;
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
     int a=sc.nextInt();
     int b=sc.nextInt();
     int n=sc.nextInt();
     temp=0.0;
     for(int j=0;j<n;j++)
     {
      temp=temp+(Math.pow(2,j)*b);
      System.out.print(a+(int)temp+" " );
     }
   }
   sc.close();
}
}
