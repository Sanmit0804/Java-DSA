// Count number of words in a given string

public class c23CountWords {
    public static void countWords(String str) {
        if(str.length() == 0)
        {
            System.out.println("Empty String");
            return;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        System.out.println(count+1);
    }

    public static void main(String[] args) {
        String str = "Sanmit";
        countWords(str);
    }
}
