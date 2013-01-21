package model.util;

public class MathUtil {

    /**
     * Computes the modulo.
     *
     * @param a
     * @param mod
     * @return
     */
    public static int mod(int a, int mod) {
	int res = a % mod;
	if ((res < 0) && (mod > 0)) {
	    res += mod;
	}
	return res;
    }

    public static void main(String[] args) {
	System.out.println(7 / 7);
    }

}
