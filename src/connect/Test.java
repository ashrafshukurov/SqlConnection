package connect;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        while(n!=0){
            m*=n%10;
            n/=10;
        }
        System.out.println(m);
    }
}
