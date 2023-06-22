import java.util.HashSet;

    public class UniqueWordsFinder {
        public static void main(String[] args) {
            String text = "This is a sample text. It contains several words, some of which may repeat. The words 'sample' and 'text' should appear only once.";

            HashSet<String> uniqueWords = new HashSet<>();

            // Splitting a string into words using spaces and punctuation
            String[] words = text.toLowerCase().split("[\\s.,;?!']+");

            // Adding unique words into HashSet
            for (String word : words) {
                uniqueWords.add(word);
            }

            // Unique words output
            System.out.println("Unique words is:");
            for (String word : uniqueWords) {
                System.out.println(word);
            }
        }
    }
