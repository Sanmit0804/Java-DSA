public class c24HighestRepeatedletters {
    public static String solve(String str) {
        String[] words = str.split(" ");

        int maxFrequency = 0;
        String maxFrequencyWord = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int[] letterCount = new int[26]; // Assuming only lowercase letters

            int currentWordMaxFrequency = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j); 
                if (Character.isLetter(ch)) {
                    int index = Character.toLowerCase(ch) - 'a'; // convert to lowercase
                    letterCount[index]++;
                    currentWordMaxFrequency = Math.max(currentWordMaxFrequency, letterCount[index]);
                }
            }
            
            if (currentWordMaxFrequency > maxFrequency) {
                maxFrequency = currentWordMaxFrequency;
                maxFrequencyWord = word;
            }
        }
        
        return maxFrequency > 1 ? maxFrequencyWord : "-1";
    }

    public static void main(String[] args) {
        String str = "abcdefg google microsoft";
        System.out.println(solve(str));  // Output should be "google"
    }
}
