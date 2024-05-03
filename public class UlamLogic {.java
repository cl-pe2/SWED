public class UlamLogic {
    
    public static String computeUlamString(int n) {
        String result = "" + n;
        while (n > 1) {
            if (n%2 == 0) {  
                n = n /2;
            } else {        
                n = 3*n + 1;
            }
            result = result + ", " + n;
        }
        return result;
    }

    public static java.util.ArrayList computeUlamSequence(int n) {
        java.util.ArrayList result = new java.util.ArrayList();
        result.add(new Integer(n));
        while (n > 1) {
            if (n%2 == 0) {  // if even
                n = n /2;
            } else {         // if odd
                n = 3*n + 1;
            }
            result.add(new Integer(n));
        }
        return result;
    }
}