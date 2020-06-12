class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans=new ArrayList();
        for (int i=1;i<=n;i++){
            if (i%3==0){
                if (i%5==0){
                    ans.add("FizzBuzz");
                }
                else{
                    ans.add("Fizz");
                }
            }
            else{
                if (i%5==0){
                    ans.add("Buzz");
                }
                else{
                    ans.add(i+"");
                }
            }
        }
        return ans;
    }
}
/*
执行用时 :
8 ms
, 在所有 Java 提交中击败了
11.13%
的用户
内存消耗 :
41.9 MB
, 在所有 Java 提交中击败了
5.18%
的用户
*/