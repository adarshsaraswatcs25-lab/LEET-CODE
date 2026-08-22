class Solution {
    public boolean checkDivisibility(int n) {
    
int temp =n;
int s =0;
int p =1;
while(temp >0)
    {
        int d = temp % 10;
        s = s+d;
        p = p *d;
        temp = temp /10;
    }
    int t = s + p;
  
        return n % t == 0;
    }
}