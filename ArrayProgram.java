import java.util.Scanner;

public class ArrayProgram {
    public static void main(String args[]){
int n;
int i;
try (Scanner sc = new Scanner (System.in)) {
    System.out.println("enter the number");
    n=sc.nextInt();
    
    int a[]=new int[10];
    System.out.println("enter the array");
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    
    for(i=0;i<n;i++){
        System.out.println(a[i]);
    }
}

    }

}
