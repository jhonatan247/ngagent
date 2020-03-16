import java.util.Scanner;
public class mainloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ngagent ng = new ngagent();
        char p='s';
        while(true){
            p=sc.next().charAt(0);
            int n =ng.compute(p);
            System.out.println(n);
        }
    }
}
