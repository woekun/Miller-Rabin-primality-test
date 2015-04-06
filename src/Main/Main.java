/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Algorithm.Chinese_Remainder_Theorem.Chinese_Remainder;
import static Algorithm.Extended_Euclide.Extended_Euclide;
import static Algorithm.Modulo_Exponentiation.Modulo_Exponentiation;
import static Algorithm.Modulo_Inverse.Modulo_Inverse;
import java.math.BigInteger;

/**
 *
 * @author HIPPY
 */
public class Main {
    /*
     extended euclide, A^k mod N, 
     tim so nghich dao, miller-rabin,
     phan du Trung Hoa...
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger p = new BigInteger("30");
        BigInteger q = new BigInteger("101");
        BigInteger vals[] = Extended_Euclide(p, q);
        BigInteger result1 = Modulo_Inverse(p, q);
        
        System.out.println("gcd(" + p + ", " + q + ") = " + vals[0]);
        System.out.println(vals[1] + "(" + p + ") + " + vals[2] + "(" + q + ") = " + vals[0]);
        System.out.println(p+"^-1 mod "+p+" = "+ result1);
        
        BigInteger a[] = { new BigInteger("2"), new BigInteger("3"), new BigInteger("5") };
	BigInteger m[] = { new BigInteger("3"), new BigInteger("5"), new BigInteger("7") };
        BigInteger mula = BigInteger.ONE;
        for(BigInteger item: m){
            mula = mula.multiply(item);
        }
        BigInteger A = new BigInteger("15");
        BigInteger k = new BigInteger("35");
        BigInteger M = new BigInteger("79");
	System.out.println("x = "+Chinese_Remainder(a,m)+" + k."+mula);
        System.out.println(A+"^"+k+" mod "+M+" = "+ Modulo_Exponentiation(A,k,M));
    }

}
