package string;
class Alph_frequency
{
    public static void cal(String s)
    {
      int ar[]=new int[26];
      System.out.println("String entered  "+ s);
      System.out.println("Frequency of characters are : - ");
      s=s.toUpperCase();
      for(int x=0;x<s.length();x++)
      {
          char ch=s.charAt(x);
          if((ch<=90)&&(ch>=65))
          {
              ar[ch-65]+=1;
           }
        }
      
      for(int x=0;x<=25;x++)
      {
          
         if(ar[x]>0)
         {
              System.out.println((char)(x+65)+"  =   "+ar[x]);
         }
      }
       
      
    }
}