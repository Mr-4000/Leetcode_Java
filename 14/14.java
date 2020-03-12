class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
       }        
        return prefix;
    }
}
/*
ִ����ʱ :
0 ms
, ������ Java �ύ�л�����
100.00%
���û�
�ڴ����� :
37.7 MB
, ������ Java �ύ�л�����
27.64%
���û�
*/