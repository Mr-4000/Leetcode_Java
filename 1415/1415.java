class Solution {
    public String getHappyString(int n, int k) {
        List<String> map = new ArrayList();
        char[] dic = {'a','b','c'};
        check(map,dic,"",n);
        if (k>map.size()) {
            return "";
        }
        return map.get(k-1);
    }

    private void check(List<String> map,char[] dic,String temp,int n) {
        if (temp.length()==n) {
            map.add(temp);
            return;
        }
        for (int i=0;i<3;i++) {
            if ((temp.length()==0)||(dic[i]!=temp.charAt(temp.length()-1))) {
                temp = temp + dic[i];
                check(map,dic,temp,n);
                temp = temp.substring(0,temp.length()-1);
            }
        }
    } 
}