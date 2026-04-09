import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class list{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> Mark= new ArrayList<Integer>();
        List<String> Student= new ArrayList<String>();
        for(int i=0;i<n;i++){
            Student.add(sc.next());
        }
        for(int i=0;i<m;i++){
            Mark.add(sc.nextInt());
        }
            System.out.println(Student);
            System.out.println(Mark);
        }
    }
