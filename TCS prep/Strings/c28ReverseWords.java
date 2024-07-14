public class c28ReverseWords {
    public static void reverseWord(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "Sanmitkumar Prakshkumar Suthar";
        reverseWord(str);
    }
}
