

public class Point {
   
    int m_x,m_y;
  public   Point(int x,int y)
{
    m_x=x;
    m_y=y;

}
public static void main(String args[]){
Point p1=new Point();
Point p=new Point(2,3);
System.out.println("x"+p.m_x);
System.out.println("y"+p.m_y);
System.out.println("x"+p1.m_x);
System.out.println("y"+p1.m_y);
}


    
}
