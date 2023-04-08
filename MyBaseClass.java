public class MyBaseClass {
    protected void dissp(){
        System.out.println("parent class method");
    }
    class MyChildClass extends MyBaseClass{
        public void disp(){
            System.out.println("child class method");
        }
    }
    public static void main(String args[]){
    MyChildClass obj=new MyChildClass();
    obj.disp();
    }
}
