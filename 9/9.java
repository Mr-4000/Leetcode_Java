class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int y,z;
        y=x;
        z=0;
        while (y>0){
           z = z*10 + y%10;
           y = y/10; 
        }
        if (z==x){
            return true;
        }
        else{
            return false;
        }
    }
}
/*
ִ����ʱ :
9 ms
, ������ Java �ύ�л�����
99.00%
���û�
�ڴ����� :
40.9 MB
, ������ Java �ύ�л�����
5.01%
���û�
*/