package pkgA;

public class A implements IntfA {
    public int HCF(int n1, int n2) {
        int hcf = 1;
        int largeNumber = (n1 > n2) ? n1 : n2;

        for (int i = 1; i < largeNumber; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }
}
