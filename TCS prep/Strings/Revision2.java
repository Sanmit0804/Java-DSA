public class Revision2 {
    public static boolean isPalindrom(String str)
    {
        for(int i = 0; i<str.length(); i++)
        {
            for(int j=0; j<str.length()-j-1; j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrom(str));
    }
}
