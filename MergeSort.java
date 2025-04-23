public class MergeSort {
    private static int[] a;
    private static int countIterations;

    private static void merge(int l, int m, int r) {
        int i=l, j=m+1, k=l;
        int[] c = new int[a.length];
        while (i <= m && j <= r)
            if (a[i] < a[j]) {c[k]=a[i]; i++; k++;}
            else {c[k]=a[j]; j++; k++;}
            countIterations++;
        while (i<=m) {c[k]=a[i]; i++; k++; countIterations++;}
        while (j<=r) {c[k]=a[j]; j++; k++; countIterations++;}
        for (int n = l; n <= r; n++) {
            a[n] = c[n];
            countIterations++;
        }
    }

    public static void msort(int l, int r) {
        if (l>=r) return;
        int m = (l+r)/2;
        msort(l, m);
        msort(m+1, r);
        merge(l, m, r);
    }

    public static void sort(int[] b) {
        a = b;
        countIterations = 0;
        long start = System.nanoTime();
        msort(0, a.length - 1);
        long end = System.nanoTime();
        System.out.println(a.length + " " + (end - start) + " " + countIterations);
    }
}
