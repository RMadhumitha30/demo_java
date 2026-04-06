import java.util.Scanner;

public class shop {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    if(a>5000){
        System.out.println("20% discount");
    }
    else if(a>200){
        System.out.println("10% discount");
    }
    else{
        System.out.println("no discount");
    }
}

}