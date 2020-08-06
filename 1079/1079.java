class Solution {
    String temp="";
    String tiles;
    HashSet res = new HashSet();
    int[] use;
    public int numTilePossibilities(String tiles) {
        this.tiles = tiles;
        this.use = new int[tiles.length()];
        check();
        return res.size();
    }

    private void check() {
        if (temp.length()==tiles.length()) {
            return;
        }
        for (int i=0;i<use.length;i++) {
            if (use[i]==0) {
                temp = temp + tiles.charAt(i);
                use[i] = 1;
                res.add(temp);
                check();
                use[i] = 0;
                temp = temp.substring(0,temp.length()-1);
            }
        }

    }
}