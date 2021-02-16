package ImplementstrStr28;

import java.util.Arrays;

public class ImplementstrStr28 {
}

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0 && needle.length() == 0) return 0;
        if( needle.length() == 0) return 0;
        int[] pretable = prefixTable(needle);
//        pattern haystack
//        j    i
//        n    m
        int i = 0, j = 0;
        int m = haystack.length(), n = needle.length();
        while (i < m) {
            if (j == n - 1 && haystack.charAt(i) == needle.charAt(j)) {
                return i - j;
//                j = pretable[j];
//                if (j == -1) {
//                    j++;
//                    i++;
//                    continue;
//                }
            }
//            AAAAA  A
//
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = pretable[j];
                if (j == -1) {
                    i++;
                    j++;
                }
            }
        }
        return -1;
    }

    public int[] prefixTable(String pattern) {
        int[] result = new int[pattern.length()];
        result[0] = 0;
        int len = 0;
        int i = 1;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                result[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = result[len - 1];
                } else {
                    result[i] = 0;
                    i++;
                }
            }
        }
        for (int j = result.length - 1; j > 0; j--) {
            result[j] = result[j - 1];
        }
        result[0] = -1;

        return result;
    }
}