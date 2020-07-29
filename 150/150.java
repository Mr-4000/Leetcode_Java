class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> l = new Stack<String>();
        int i,ans = 0,buff;
        for (i=0;i<tokens.length;i++) {
            switch (tokens[i]) {
                case "+":
                    ans = Integer.valueOf(l.pop()) + Integer.valueOf(l.pop());
                    l.push(Integer.toString(ans));
                    break;
                case "-":
                    ans = -Integer.valueOf(l.pop()) + Integer.valueOf(l.pop());
                    l.push(Integer.toString(ans));
                    break;
                case "*":
                    ans = Integer.valueOf(l.pop()) * Integer.valueOf(l.pop());
                    l.push(Integer.toString(ans));
                    break;
                case "/":
                    buff = Integer.valueOf(l.pop());
                    ans = Integer.valueOf(l.pop()) / buff;
                    l.push(Integer.toString(ans));
                    break;
                default:
                    ans = Integer.valueOf(tokens[i]);
                    l.push(tokens[i]);
                    break;
            }
        }
        return ans;
    }
}