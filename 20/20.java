class Solution {
    public boolean isValid(String s) {
        String[] stack = new String[s.length()];
        int index=0,i=0;
        for (i=0;i<s.length();i++){
            if ((s.substring(i,i+1).equals("("))||(s.substring(i,i+1).equals("["))||(s.substring(i,i+1).equals("{"))){
                stack[index] = s.substring(i,i+1);
                index=index+1;
            }else{
                if (index==0){
                    return false;
                }
                System.out.println(stack[0]);
                switch(s.substring(i,i+1)){
                    case ")":
                        if (stack[index-1].equals("(")){
                            index=index-1;
                        }
                        else{
                            return false;
                        }
                        break;
                    case "]":
                        if (stack[index-1].equals("[")){
                            index=index-1;
                        }
                        else{
                            return false;
                        }
                        break;
                    case "}":
                        if (stack[index-1].equals("{")){
                            index=index-1;
                        }
                        else{
                            return false;
                        }
                        break;
                }
            }
        }
        if (index==0){
            return true;
        }
        else{
            return false;
        }
    }
}
/*
执行用时 :
12 ms
, 在所有 Java 提交中击败了
7.63%
的用户
内存消耗 :
39.2 MB
, 在所有 Java 提交中击败了
5.00%
的用户
*/