package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int res;
        res = number%10;
        number /=10;
        res =res*10 + number%10;
        number /=10;
        res = res*10 +number%10;
        System.out.println(res);
    }

}
