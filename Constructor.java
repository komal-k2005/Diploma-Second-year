
class New {
    int x, y;
    New()
    {
        System.out.println("default constructor");
    }
New(int a,int b){
    x=a;
    y=b;
}
int largest(){
if(x>y){
    return (x);
}
else{
    return (y);
}
}
void display(){
    int z=largest();
    System.out.println(z);

}} 
class Constructor{
    public static void main(String args[]){
        New n=new New(+4,+5);
        n.display();
        

    }

    }

