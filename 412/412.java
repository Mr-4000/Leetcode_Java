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
ִ����ʱ :
8 ms
, ������ Java �ύ�л�����
11.13%
���û�
�ڴ����� :
41.9 MB
, ������ Java �ύ�л�����
5.18%
���û�
*/