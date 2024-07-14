// Find the largest word in a given string

public class c21LargestWord {
    public static void largestWord(String str) {
        String[] words = str.split(" ");
        String largestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
        }
        System.out.println(largestWord);
    }

    public static void main(String[] args) {
        String str = "Microsoft teams";
        largestWord(str);
    }
}
