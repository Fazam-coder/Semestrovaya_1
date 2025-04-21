public class MergeSort {
    private static int[] a;

    private static void merge(int l, int m, int r) {
        int i=l, j=m+1, k=l;
        int[] c = new int[a.length];
        while (i <= m && j <= r)
            if (a[i] < a[j]) {c[k]=a[i]; i++; k++;}
            else {c[k]=a[j]; j++; k++;}
        while (i<=m) {c[k]=a[i]; i++; k++;}
        while (j<=r) {c[k]=a[j]; j++; k++;}
        for (int n = l; n <= r; n++) {
            a[n] = c[n];
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
        msort(0, a.length - 1);
    }
}
