class Solution {
	public int lengthOfLongestSubstring(String s) {
		int i = 0;
		int flag = 0;
		int length = 0;
		int result = 0;
		while (i < s.length()) {
			int pos = s.indexOf(s.charAt(i),flag);
			if (pos < i) {
				if (length > result) {
					result = length;
				}
				if (result >= s.length() - pos - 1) {
					return result;
				}
				length = i - pos - 1;
				flag = pos + 1;
			}
			length++;
			i++;
		}
		return length;
	}
}
/*
执行用时 :
3 ms
, 在所有 Java 提交中击败了
97.00%
的用户
内存消耗 :
36.7 MB
, 在所有 Java 提交中击败了
96.13%
的用户
*/