public class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && (int)(Math.log10(n)/Math.log10(2))-Math.log10(n)/Math.log10(2)==0);
    }
}
