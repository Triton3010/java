import java.util.Scanner;
class SIMDISH
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  String[] s1 = new String[4];
  String[] s2 = new String[4];
  int count=0;
  boolean b=false;
  for(int i=0;i<4;i++)
    s1[i]=obj.next();
  for(int j=0;j<4;j++)
    s2[j]=obj.next();
 
  for(int k=0;k<4;k++)
  {
   for(int l=0;l<4;l++)
   {
    if(s1[k].equals(s2[l]))
   {
    count++;
   }
   if(count>=2)
   {
    b=true; break;
   }}
  }
   if(b)
   System.out.println("similar");
   else
   System.out.println("dissimilar");
  }}}