// Time complexity = O(n)

public class code9TrappingRainwater {
    public static int trappedRainWater(int height[]) {
        int n = height.length;

        // Calculate left-max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right-max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(max-left boundary, max-right boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // TrappedWater = (waterlevel - height) * width
            // Here, TrappedWater = (waterlevel - height) * 1
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int trappedWater = trappedRainWater(height);
        System.out.println(trappedWater);
    }
}