package com.practice;

public class copyclone {
    public static void main(String []args) {
        int[] a = {1, 2, 3};
        int[] b = a;

        b[0]++;

        System.out.println("Scenario 1: ");
        System.out.print("Array a: ");
        printArray(a);
        System.out.print("Array b: ");
        printArray(b);

        int[] c = {1, 2, 3};
        int[] d = new int[c.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = c[i];
        }

        d[0]++;

        System.out.println("Scenario 2: ");
        System.out.print("Array c: ");
        printArray(c);
        System.out.print("Array d: ");
        printArray(d);

        int[] e = {1, 2, 3};
        int[] f = e.clone();

        f[0]++;

        System.out.println("Scenario 3: ");
        System.out.print("Array e: ");
        printArray(e);
        System.out.print("Array f: ");
        printArray(f);

        int[] g = {1, 2, 3};
        int[] h = new int[g.length];
        System.arraycopy(g, 0, h, 0, h.length);

        h[0]++;

        System.out.println("Scenario 4: ");
        System.out.print("Array g: ");
        printArray(g);
        System.out.print("Array h: ");
        printArray(h);
    }

    public static void printArray(int[] a) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }
}

