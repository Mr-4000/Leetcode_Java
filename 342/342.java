class Solution {
    public boolean isPowerOfFour(int num) {
        if (num==0){
            return false;
        }
        while(num%4==0)
            num=num/4;
        if (num==1){
            return true;
        }
        else{
            return false;
        }
    }
}
/*
ִ����ʱ :
1 ms
, ������ Java �ύ�л�����
100.00%
���û�
�ڴ����� :
36.4 MB
, ������ Java �ύ�л�����
5.01%
���û�
*/