/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import java.math.BigInteger;

/**
 *
 * @author HIPPY
 */
public class Extended_Euclide {

    public static BigInteger[] Extended_Euclide(BigInteger p, BigInteger q) {
        if (q.equals(BigInteger.ZERO)) {
            return new BigInteger[]{p, BigInteger.ONE, BigInteger.ZERO};
        } else {
            BigInteger[] vals = Extended_Euclide(q, p.remainder(q));
            BigInteger d = vals[0];
            BigInteger a = vals[2];
            BigInteger b = vals[1].subtract(p.divide(q).multiply(vals[2]));
            return new BigInteger[]{d, a, b};
        }
    }
}
