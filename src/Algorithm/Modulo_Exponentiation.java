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
public class Modulo_Exponentiation {

    public static BigInteger Modulo_Exponentiation(BigInteger A, BigInteger k, BigInteger M) {
        BigInteger result = BigInteger.ONE;
        while (k.compareTo(BigInteger.ZERO) > 0) {
            if (k.testBit(0))
            {
                result = (result.multiply(A)).mod(M);
            }
            k = k.shiftRight(1);
            A = (A.multiply(A)).mod(M);
        }
        return result.mod(M);
    }
}
