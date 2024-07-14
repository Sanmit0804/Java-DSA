// find a word in a given string that has the highest number of repeated letters. If not found, return -1.

public class c24HighestRepeatedletters {
    public static String solve(String str) {
        String[] words = str.split(" ");

        int maxFrequency = 0;
        String maxFrequencyWord = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int[] letterCount = new int[26]; // Assuming only lowercase letters

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(i);
                if (Character.isLetter(ch)) {
                    int index = ch - 'a';
                    letterCount[index]++;
                    maxFrequency = Math.max(maxFrequency, letterCount[index]);
                }
            }
            if (maxFrequency > 1) {
                maxFrequencyWord = word;
            }
        }
        return maxFrequencyWord.isEmpty() ? "-1" : maxFrequencyWord;
    }

    public static void main(String[] args) {
        String str = "abcdefg google Microsoft";
        System.out.println(solve(str));
    }
}
