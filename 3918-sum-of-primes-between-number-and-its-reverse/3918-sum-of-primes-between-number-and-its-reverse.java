class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = reverse(n);
        int start = Math.min(n, rev);
        int end = Math.max(n, rev);
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (prime(i)) {   // corrected method call
                sum += i;
            }
        }
        return sum;
    }

    public int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    public boolean prime(int no) {
        if (no < 2) return false;   // handle 0 and 1

        int r = no / 2;
        int fac = 0;
        int n = 2;

        while (n <= r) {
            if (no % n == 0) {
                fac++;
            }
            n++;
        }

        return fac == 0;
    }
}