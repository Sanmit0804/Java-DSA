public class c15WildCardMatcher {
    public static void main(String[] args) {
        String pattern = "hel*o";
        String text = "hello";

        // Convert wildcard pattern to regular expression
        String regex = pattern.replace("?", ".").replace("*", ".*");

        // Check if the text matches the regex pattern
        if (text.matches(regex)) {
            System.out.println("The text matches the pattern");
        } else {
            System.out.println("The text does not match the pattern");
        }
    }

}
