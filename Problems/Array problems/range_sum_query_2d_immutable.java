class NumMatrix {
    // 2D array to store prefix sums, with extra row and column for easier calculations
    private int[][] prefix;

    // Constructor: Initialize the prefix sum matrix from the input matrix
    public NumMatrix(int[][] matrix) {
        // Get dimensions of the input matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Initialize prefix sum array with +1 size to handle edge cases
        prefix = new int[rows + 1][cols + 1];

        // Build the prefix sum matrix
        // For each cell (i,j), compute the sum of all elements from (0,0) to (i-1,j-1)
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Formula: current cell value + sum above + sum to the left - overlap
                prefix[i][j] = matrix[i-1][j-1]           // Current cell value
                             + prefix[i-1][j]             // Sum of all cells above
                             + prefix[i][j-1]             // Sum of all cells to the left
                             - prefix[i-1][j-1];          // Subtract overlap (counted twice)
            }
        }
    }

    // Calculate sum of elements in the rectangle from (row1,col1) to (row2,col2)
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // Use inclusion-exclusion to get the region sum
        // Total sum up to (row2,col2) - sum above row1 - sum left of col1 + overlap
        return prefix[row2 + 1][col2 + 1]      // Sum up to bottom-right
             - prefix[row1][col2 + 1]          // Subtract sum above top row
             - prefix[row2 + 1][col1]          // Subtract sum left of left column
             + prefix[row1][col1];             // Add back the overlap
    }
}