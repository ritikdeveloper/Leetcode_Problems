class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // Special case for 0 and 1
        return binary(0, x, x);
    }

    public int binary(int start, int end, int x) {
        if (start > end) return end; // Base case: end is the closest integer sqrt

        int mid = start + (end - start) / 2;
        long square = (long) mid * mid; // Use long to avoid overflow

        if (square == x) {
            return mid; // Found the exact square root
        } else if (square < x) {
            return binary(mid + 1, end, x); // Search in the right half
        } else {
            return binary(start, mid - 1, x); // Search in the left half
        }
    }
}
