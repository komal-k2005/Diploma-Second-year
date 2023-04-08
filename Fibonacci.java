public class Fibonacci {
    public static void main(String args[]){
        int i;
        int first=0;
        int second=1;
        int third;
        System.out.print("\t"+first);
        System.out.print("\t"+second);
        for(i=0;i<5;i++){
            third=first+second;
            first=second;
             second=third;
            
            System.out.print("\t"+third);
        }


    }
}
