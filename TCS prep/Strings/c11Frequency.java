// Problem Statement: Given a string, calculate the frequency of characters in a string.


public class c11Frequency {
    public static void frequencyCount(String str) {
        int[] freq = new int[26];
        
        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i= 0; i<26; i++)
        {
            if(freq[i] != 0)
            {
                System.out.print((char)(i+'a'));
                System.out.print(freq[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "articles";
        frequencyCount(str);
    }
}
