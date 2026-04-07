abstract class tea{
    abstract void color();
    void taste(){
        System.out.println("tea is sweet");}

}
class greentea extends tea{
    void color(){
        System.out.println("green tea is green ");
    }
}
public class cla {
    public static void main(String[] args) {
        greentea g=new greentea();
        g.color();
        g.taste();
    }
    
}
