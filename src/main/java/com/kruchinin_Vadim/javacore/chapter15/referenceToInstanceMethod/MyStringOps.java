package com.kruchinin_Vadim.javacore.chapter15.referenceToInstanceMethod;

class MyStringOps {
    String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
