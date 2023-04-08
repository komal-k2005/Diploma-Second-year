class addition{
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
   class Code1{
   public static void main(String args[]){
   addition s1=new addition();
   s1.a=2;
   s1.b=2;
   int c=s1.put();
   addition s2=new addition();
   s2.get(9,7);
    int z=s2.put();
   System.out.println(c);
   System.out.println(z);
    }}