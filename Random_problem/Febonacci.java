package Random_problem;
public class Febonacci {

      public static void main(String[] args) {
        System.out.println(fibo(6));

    }
    static int fibo(int n){
        // base condition
        if (n == 0) {
            return 0;
        } else if (n==1) {
            return 1;
        }
        return fibo(n-1) +fibo(n-2);
    }
}