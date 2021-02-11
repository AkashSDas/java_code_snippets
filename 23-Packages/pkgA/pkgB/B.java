package pkgA.pkgB;

import pkgA.A;

public class B extends A implements IntfB {
    public int HCF(int n1, int n2, int n3) {
        int hcf = 1;
        int  largeNumber = (n1 > n2) ? n1 : n2;

        for (int i = 1; i < largeNumber; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }

        if (n3 % hcf == 0) {
            return hcf;
        }
        return 1;
    }
}
