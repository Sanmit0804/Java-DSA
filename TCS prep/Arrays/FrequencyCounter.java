// Count the frequency of each element in the array

class FrequencyCounter {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 3, 3, 3, 4, 4, 4 };

        boolean[] counted = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(array[i] + ": " + count);
            }
        }
    }
}