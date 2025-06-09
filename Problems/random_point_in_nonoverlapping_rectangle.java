import java.util.Random;

public class Solution {
    private int[][] rectangles;
    private int[] areaSums;
    private Random random;

    public Solution(int[][] rects) {
        rectangles = rects;
        random = new Random();
        areaSums = new int[rects.length];
        
        // Calculate cumulative areas for each rectangle
        int totalArea = 0;
        for (int i = 0; i < rects.length; i++) {
            int width = rects[i][2] - rects[i][0] + 1;  // x2 - x1 + 1
            int height = rects[i][3] - rects[i][1] + 1; // y2 - y1 + 1
            totalArea += width * height;
            areaSums[i] = totalArea;
        }
    }

    public int[] pick() {
        // Pick a random point from total area
        int totalArea = areaSums[rectangles.length - 1];
        int randomValue = random.nextInt(totalArea);

        // Find which rectangle this point belongs to
        int rectIndex = 0;
        for (int i = 0; i < areaSums.length; i++) {
            if (randomValue < areaSums[i]) {
                rectIndex = i;
                break;
            }
        }

        // Get random point within chosen rectangle
        int[] rect = rectangles[rectIndex];
        int x1 = rect[0], y1 = rect[1];
        int x2 = rect[2], y2 = rect[3];
        
        int width = x2 - x1 + 1;
        int randomX = x1 + random.nextInt(width);
        int randomY = y1 + random.nextInt(width);

        return new int[]{randomX, randomY};
    }
}