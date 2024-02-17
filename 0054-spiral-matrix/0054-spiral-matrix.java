class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return list;
        
        int rowBegin = 0, rowEnd = matrix.length - 1;
        int colBegin = 0, colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse towards right
            for (int i = colBegin; i <= colEnd; i++) {
                list.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            // Traverse down
            for (int i = rowBegin; i <= rowEnd; i++) {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Traverse left
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    list.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            // Traverse up
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    list.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }
        return list;
    }
}
