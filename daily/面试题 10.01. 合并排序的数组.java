class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = A.length - 1, j = m - 1, k = n - 1;
        while (i >= 0 && j >= 0 && k >= 0) {
            if (A[j] >= B[k]) {
                A[i] = A[j];
                j--;
            } else {
                A[i] = B[k];
                k--;
            }
            i--;
        }

        while (j >= 0) {
            A[i--] = A[j--];
        }
        while(k >= 0) {
            A[i--] = B[k--];
        }
    }
}