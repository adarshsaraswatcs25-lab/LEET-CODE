class Solution {
    public int fib(int n) {
         int ft =0;
            int st = 1;
        for(int i = 1;i<=n;i++){
            
            int th = ft + st;
            ft = st;
            st = th;
        }
        return ft;
        
    }
}