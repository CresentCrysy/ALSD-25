package W_5;

public class UTS25 {
    int tertinggi(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int lMax = tertinggi(arr, l, mid);
        int rMax = tertinggi(arr, mid + 1, r);
        return Math.max(lMax, rMax);
    }

    int terendah(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int lMin = terendah(arr, l, mid);
        int rMin = terendah(arr, mid + 1, r);
        return Math.min(lMin, rMin);
    }

    double rerata(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}