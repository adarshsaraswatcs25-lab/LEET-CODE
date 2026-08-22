class Solution {
    public int tribonacci(int n) {
        
        int ft =0;
        int st = 1;
        int tt =1;
        for(int i =1;i<= n;i++){
            int fot = ft + st+ tt;
        ft = st;
        st=tt;
        tt=fot;
        }
        return ft;
    }
}