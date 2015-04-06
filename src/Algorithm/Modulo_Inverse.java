/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import static Algorithm.Extended_Euclide.Extended_Euclide;
import java.math.BigInteger;

/**
 *
 * @author HIPPY
 */
public class Modulo_Inverse {

    public static BigInteger Modulo_Inverse(BigInteger k, BigInteger n) {
        BigInteger[] vals = Extended_Euclide(k, n);
        BigInteger d = vals[0];
        BigInteger a = vals[1];

        if (d.compareTo(BigInteger.ONE) == 1) {
            //System.out.println("Inverse doesn't exist.");
            return BigInteger.ZERO;
        }

        if (a.compareTo(BigInteger.ZERO) == 1) {
            return a;
        }

        return n.add(a);
    }
}
