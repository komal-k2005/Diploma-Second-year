import java .util.*;
public class add3 {
void addition(){
    try(Scanner s=new Scanner(System.in)){
        System.out.println("no1=");
        int no1=s.nextInt();
        System.out.println("no2=");
        int no2=s.nextInt();
        System.out.println("no3=");
        int no3=s.nextInt();
        int sum=no1+no2+no3;
        System.out.println("sum="+sum);
    }
}
    public static void main(String args[]){
        add3 a=new add3();
        a.addition();

    }
    
}
