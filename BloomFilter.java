/*
    Ori Paso - 209493683
 */
package test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;


public class BloomFilter {
    BitSet bitSet;

    ArrayList<MessageDigest> Md = new ArrayList<>();

    public BloomFilter(int sizeOfBit, String... allArgsOfStrings) {
        bitSet = new BitSet(sizeOfBit);
        for (String args : allArgsOfStrings) {
            try {
                Md.add(MessageDigest.getInstance(args));
            } catch (NoSuchAlgorithmException e) {}
        }

    }

    public void add(String word) {

        byte[] bytes;
        for (MessageDigest md : Md) {

            bytes = md.digest(word.getBytes());
            BigInteger a = new BigInteger(bytes);
            // convert the value to be positive and do module
            bitSet.set(Math.abs(a.intValue()) % bitSet.size());
        }
    }

    public boolean contains(String word) {
        byte[] bytes;
        for (MessageDigest md : Md) {

            bytes = md.digest(word.getBytes());
            BigInteger a = new BigInteger(bytes);
            // convert the value to be positive and do module
            int index = (Math.abs(a.intValue()) % bitSet.size());
            if (!bitSet.get(index))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(bitSet.length());
        int i = 0;
        while(i<bitSet.length())
        {
            if(bitSet.get(i))
            {
                sb.append(1);
            }
            else {
                sb.append(0);
            }
            i++;
        }
        return sb.toString();

    }









}







