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
/*ִ����ʱ :
11 ms
, ������ Java �ύ�л�����
30.04%
���û�
�ڴ����� :
42.6 MB
, ������ Java �ύ�л�����
5.01%
���û�
*/