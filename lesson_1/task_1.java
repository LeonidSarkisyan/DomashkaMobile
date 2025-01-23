import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите строку из нескольких слов:");
        String input = scanner.nextLine();
        
        String[] words = input.split(" ");
        
        List<String> wordList = Arrays.asList(words);
        Collections.reverse(wordList);
        
        System.out.println("Слова в обратном порядке:");
        for (String word : wordList) {
            System.out.print(word + " ");
        }
        
        scanner.close();
    }
}
