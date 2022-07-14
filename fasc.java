import java.util.*;
class fasc
{
public static void main(String agrs[])
{
int f=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for m and n: ");
int m=sc.nextInt();
int n= sc.nextInt();
if(m>n||m<99||n<99||m>10000||n>10000)
{
System.out.println("INVALID INPUT");
}
else
{
System.out.print("THE FASCINATING NUMBERS ARE:");

   for(int i=m;i<=n;i++)
   {
   int n2 = i*2;
   int n3 = i*3;
   String s = "" + i + n2 + n3;
   int l = s.length();
   char ch,ch1;
   int j,c=0;
   
   for(ch1='1';ch1<='9';ch1++)
        {
            c=0;
            for(j=0;j<l;j++)
            {
                ch = s.charAt(j);
                if(ch == ch1)
                    c++;
            }
            if(c!=1)
                break;
        }
        
        if(ch1 > '9')
        {
           f++;
           System.out.print(i+" ");
        }      
}
if(f>0) 
{
System.out.println();
System.out.print("FREQUENCY OF FASCINATING NUMBERS IS:"+f);
}

if(f==0)
{
System.out.print("NIL");
System.out.println();
System.out.print("FREQUENCY OF FASCINATING NUMBERS IS:"+f);
}
}
}
}
