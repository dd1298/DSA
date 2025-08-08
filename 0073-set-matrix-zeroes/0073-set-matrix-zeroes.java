class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i,j;
        int zeros = 0;
        List<List<Integer>> addList = new ArrayList<>(); 
        for(i = 0; i < row; i++) {
            for(j = 0; j < col; j++) {
                if(matrix[i][j] == 0) {
                    zeros++;
                    addList.add(Arrays.asList(i,j));
                }
            }
        }
        for(i = 0; i < zeros; i++) {
            int r = addList.get(i).get(0);
            int c = addList.get(i).get(1);
            for(j = 0; j < col; j++) {
                matrix[r][j] = 0;
            }
            for(j = 0; j < row; j++) {
                matrix[j][c] = 0;
            }
        }
    }
}