
class Addition{
    int a,b;
   void get(int x,int y)
   {
   a=x;
   b=y;
   }
   int put()
   {
   int c;
   c=a+b;
   return(c);
   }}
   class Add{
   public static void main(String args[]){
   Addition s1=new Addition();
   s1.a=2;
   s1.b=2;
   int c=s1.put();
   Addition s2=new Addition();
   s2.get(9,7);
    int z=s2.put();
   System.out.println(c);
   System.out.println(z);
    }}