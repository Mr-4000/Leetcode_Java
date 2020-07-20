class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> p = new ArrayList<Integer>();
        List<Integer> q = new ArrayList<Integer>();
        if (numRows==0){
            return list;
        }
        p.add(1);
        list.add(p);
        if (numRows==1){
            return list;
        }
        q.add(1);
        q.add(1);
        list.add(q);
        if (numRows==2){
            return list;
        }
        int i,j;
        for (i=2;i<numRows;i++){
            List<Integer> l = new ArrayList<Integer>();
            l.add(1);
            for(j=0;j<i-1;j++){
                l.add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
            }
            l.add(1);
            list.add(l);
        }
        return list;
    }
}