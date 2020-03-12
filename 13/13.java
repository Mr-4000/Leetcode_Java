class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> letter = new HashMap();
        letter.put("I",1);
        letter.put("V",5);
        letter.put("X",10);
        letter.put("L",50);
        letter.put("C",100);
        letter.put("D",500);
        letter.put("M",1000);
        int num=0,i,l;
        l = s.length();
        for(i=0;i<l;i++){
            if (i<(l-1)){
                if (letter.get(s.substring(i,i+1))<letter.get(s.substring(i+1,i+2))){
                    num = num - letter.get(s.substring(i,i+1));
                }
                else{
                    num = num + letter.get(s.substring(i,i+1));
                }
            }
            else{
                num = num + letter.get(s.substring(i,i+1));
            }
        }
        return num;
    }
}
/*执行用时 :
11 ms
, 在所有 Java 提交中击败了
30.04%
的用户
内存消耗 :
42.6 MB
, 在所有 Java 提交中击败了
5.01%
的用户
*/