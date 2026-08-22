class Solution {
    public int numWaterBottles(int nb, int ne) {
        int ans = nb;
        while(nb>=ne){
            int neb = nb/ne;
            int rb = nb%ne; 
             ans = ans +neb;
            nb = neb + rb;
          
        }
        return ans;
    }
}