import java.util.*;
public class Percentage {
    void subject(){
        try(Scanner s=new Scanner(System.in)){
            System.out.println("Subject marks");
            System.out.println("Sub1=");
            int sub1=s.nextInt();
            System.out.println("Sub2");
            int sub2=s.nextInt();
            System.out.println("Sub3");
            int sub3=s.nextInt();
            System.out.println("Sub4");
            int sub4=s.nextInt();
            System.out.println("Sub5");
            int sub5=s.nextInt();      
            int total=sub1+sub2+sub3+sub4+sub5;
            int per;
            per=total/5;
            System.out.println("persentage is="+per);

        }
    }
public static void main(String args[]){
Percentage p=new Percentage();
p.subject();

}    
}
