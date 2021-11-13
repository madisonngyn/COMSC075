import java.math.BigInteger;

public class lab1 {

    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.valueof(1);
    
        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);
        
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInterger.valueof(x));
        }
    }
}

