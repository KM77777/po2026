package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat codingBat = new CodingBat();
    @Test
    public void array123(){
//        assertEquals(true,codingBat.array123(new int[]{1,6,4,1,4,2}));
//        assertEquals(true,codingBat.array123(new int[]{1,5,3,2,1,2,3,2}));
//        assertEquals(true,codingBat.array123(new int[]{1,4,2,2,2,3}));
//        assertEquals(true,codingBat.array123(new int[]{6,5,2,3,5}));
//        assertEquals(true,codingBat.array123(new int[]{5,7,2,7}));
        assertEquals(true,codingBat.array123(new int[]{1,2,3}));
    }

    @Test
    public void lucky13(){
//        assertEquals(true,codingBat.lucky13(new int[] {0, 2, 4}));
//        assertEquals(true,codingBat.lucky13(new int[] {1, 2, 3}));
//        assertEquals(true,codingBat.lucky13(new int[] {1, 2, 4}));
//        assertEquals(true,codingBat.lucky13(new int[] {2, 7, 2, 8}));
//        assertEquals(true,codingBat.lucky13(new int[] {2, 7, 1, 8}));
        assertEquals(true,codingBat.lucky13(new int[] {2, 2, 4, 5}));
    }

}