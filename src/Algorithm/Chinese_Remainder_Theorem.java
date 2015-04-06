/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import static Algorithm.Modulo_Inverse.Modulo_Inverse;
import java.math.BigInteger;

/**
 *
 * @author HIPPY
 */
public class Chinese_Remainder_Theorem {

    public static BigInteger Chinese_Remainder(BigInteger a[], BigInteger m[]) {
        BigInteger prod = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (BigInteger n1 : m) {
            prod = prod.multiply(n1);
        }

        for (int i = 0; i < m.length; i++) {
            BigInteger p = prod.divide(m[i]);
            sum = sum.add(a[i].multiply(Modulo_Inverse(p, m[i])).multiply(p));
        }
        
        return sum.remainder(prod);
    }
}
