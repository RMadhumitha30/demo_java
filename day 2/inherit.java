class employee{
    String name;
    void display(){
        System.out.println("Employee Name: "+name);
    }
}
class permanent extends employee{
    int salary=456+789+978;
    void display(){
        System.out.println("Permanent Emp Sal: "+salary);
    }
}
class temporary extends employee{
    int salary=456+789;
    void display(){
        System.out.println("Temporary Emp Sal: "+salary);
    }
}
public class inherit{
    public static void main(String[] args) {
        
        permanent p=new permanent();
        temporary t=new temporary();
        p.name="John";
        t.name="Doe";
        p.display();
        t.display();
    }
}
    
    
