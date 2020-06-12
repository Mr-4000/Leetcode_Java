class Solution {
  public int mySqrt(int x) {
    if (x < 2) return x;

    long num;
    int pivot, left = 2, right = x / 2;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      num = (long)pivot * pivot;
      if (num > x) right = pivot - 1;
      else if (num < x) left = pivot + 1;
      else return pivot;
    }

    return right;
  }
}
/*
ִ����ʱ :
1 ms
, ������ Java �ύ�л�����
100.00%
���û�
�ڴ����� :
37.2 MB
, ������ Java �ύ�л�����
5.11%
���û�
*/