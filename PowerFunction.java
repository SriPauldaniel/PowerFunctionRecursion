import java.util.Scanner;
public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(findPower(n, a, m));
        sc.close();
    }

    static int findPower(int n,int a,int m) {
        if(n == 0) {
            return 1;
        }
        int p = pow(a,n/2);
        if(n%2 == 0) {
            return (p*p)%m;
        } else {
            return (p*p*a)%m;
        }
    }

    static int pow(int a,int n) {
        if(n == 0) {
            return 1;
        }
        return pow(a,n-1)*a;
    }
}