// Remove vowels from String

public class c4RemoveVowels {
    public static void removeVowels(String str)
    {
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();
        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
            {
                continue;
            }else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "I am very happy today";
        removeVowels(str);
    }
}
