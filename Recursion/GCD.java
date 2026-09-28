package Recursion;

public class GCD {
    public static int gcd(int a,int b){
        // If any of the number is greater
        // if(b==0) return a;
        // else if(a==0) return b;
        // else if(a>=b){
        //    return gcd(a%b,b);
        // }
        // else{
        //    return gcd(a,a%b);
        // }
        //---------------------------------------
        // if a is always greater than b
        if(b==0) return a;
        return gcd(b,b%a);

        
        }
    public static void main(String[] args) {
        int x = 16;
        int y = 4;
        System.out.print(gcd(x,y));
    }
    }

