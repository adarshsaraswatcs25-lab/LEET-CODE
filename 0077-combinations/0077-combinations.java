class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        solve(1,n,k,new ArrayList<>(),res);
        return res;
    }
    void solve(int s,int n,int k,List<Integer> t,List<List<Integer>> r){
        if(t.size()==k){r.add(new ArrayList<>(t));return;}
        for(int i=s;i<=n;i++){t.add(i);solve(i+1,n,k,t,r);t.remove(t.size()-1);}
    }
}