import java.util.HashSet;

    public class UniqueWordsFinder {
        public static void main(String[] args) {
            String text = "This is a sample text. It contains several words, some of which may repeat. The words 'sample' and 'text' should appear only once.";

            HashSet<String> uniqueWords = new HashSet<>();

            // Разделение строки на слова с помощью пробелов и знаков пунктуации в качестве разделителей
            String[] words = text.toLowerCase().split("[\\s.,;?!]+");

            // Добавление уникальных слов в HashSet
            for (String word : words) {
                uniqueWords.add(word);
            }

            // Вывод уникальных слов
            System.out.println("Уникальные слова:");
            for (String word : uniqueWords) {
                System.out.println(word);
            }
        }
    }

//

//import java.util.HashMap;
//
//    public class WordFrequencyCounter {
//        public static void main(String[] args) {
//            String text = "This is a sample text. It contains several words, some of which may repeat. The words 'sample' and 'text' should appear only once.";
//
//            HashMap<String, Integer> wordFrequency = new HashMap<>();
//
//            // Разделение строки на слова с помощью пробелов и знаков пунктуации в качестве разделителей
//            String[] words = text.split("[\\s.,;?!]+");
//
//            // Подсчет частоты вхождения слов
//            for (String word : words) {
//                // Приведение слова к нижнему регистру
//                String lowercaseWord = word.toLowerCase();
//
//                // Проверка, существует ли уже такое слово в HashMap
//                if (wordFrequency.containsKey(lowercaseWord)) {
//                    // Если слово уже существует, увеличиваем его частоту на 1
//                    int frequency = wordFrequency.get(lowercaseWord);
//                    wordFrequency.put(lowercaseWord, frequency + 1);
//                } else {
//                    // Если слово не существует, добавляем его в HashMap со значением 1
//                    wordFrequency.put(lowercaseWord, 1);
//                }
//            }
//
//            // Вывод уникальных слов и их частоты вхождения
//            System.out.println("Уникальные слова и их частота вхождения:");
//            for (String word : wordFrequency.keySet()) {
//                int frequency = wordFrequency.get(word);
//                System.out.println(word + ": " + frequency);
//            }
//        }
//    }
//
//}
