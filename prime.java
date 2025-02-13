import java.util.*;
public class prime {
  static int solve(int A) {
        int c = 0;
        for (int i=1;i*i<=A;i++){
            if (A%i==0){
                c+=2;
                if (i*i==A){
                    c+=1;
                }
            }
        }
        if (c==2){
            return 1;
        }
        else{
            return 0;
        }
    }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a =sc.nextInt();
     System.out.println(solve(a)); 
  }
}