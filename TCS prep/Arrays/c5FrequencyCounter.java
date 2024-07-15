public class c5FrequencyCounter {
    public static void frequencyCount(int[] arr) {
        boolean counted[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true; // mark this element as counted
                    }
                }
                System.out.println("Element: " + arr[i] + " Frequency: " + count);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4 };
        frequencyCount(arr);
    }
}
