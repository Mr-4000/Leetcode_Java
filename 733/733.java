class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m=image.length,n=image[0].length;
        fill(image,sr,sc,m,n,newColor);
        return image;
    }

    private void fill(int[][] image,int sr,int sc,int m,int n,int newColor) {
        int now = image[sr][sc];
        image[sr][sc] = newColor;
        if ((sr>0)&&(now == image[sr-1][sc])&&(image[sr-1][sc]!=newColor)) {
            floodFill(image,sr-1,sc,newColor);
        }   
        if ((sc>0)&&(now == image[sr][sc-1])&&((image[sr][sc-1]!=newColor))) {
            floodFill(image,sr,sc-1,newColor);
        }
        if ((sr<m-1)&&(now == image[sr+1][sc])&&(image[sr+1][sc]!=newColor)) {
            floodFill(image,sr+1,sc,newColor);
        }
        if ((sc<n-1)&&(now == image[sr][sc+1])&&(image[sr][sc+1]!=newColor)) {
            floodFill(image,sr,sc+1,newColor);
        }
    }
}