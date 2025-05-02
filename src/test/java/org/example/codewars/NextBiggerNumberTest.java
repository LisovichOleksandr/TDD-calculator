package org.example.codewars;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NextBiggerNumberTest {

    @Test
    void allCombination() {
        List<Long> resExpect = new ArrayList<>();
        resExpect.add(12L);
        resExpect.add(21L);

        List<Long> resActual = NextBiggerNumber.allCombination(12);

        Assert.assertEquals(resExpect, resActual);
    }

//    public static int quantityCombinations() {
//
//    }
}