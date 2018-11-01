public class App {

    public static void main(String[] args){
        System.out.println(fib(4));
    }

    public static int fib(int n){
        if(n < 1){
            throw new IllegalArgumentException("Numbers below 1 not allowed")
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static int fibNonRecursive(int n){
        if(n <=2){
            return 1;
        }

        int first = 1; 
        int second = 2;
        int nth = 2;

        for(int i = 3; i <= n-1; i++){
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth; 
    }
}

// Commments : 

// Check for numbers below 1
// Recursive calls for large numbers (stack oerflow)
// Time complexity (exponential (n^2))