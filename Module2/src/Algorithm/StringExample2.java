package Algorithm;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringExample2 {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("---------------------------------");
        System.out.println(str);
        System.out.println("---------------------------------");
        // liệt kê sô lần xuất hiện của các từ trong chuỗi trên
        System.out.println("Liệt kê số lần xuất hiện của các từ: ");
        Map<String, Integer> wordMap = countWords(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }
    }

    /**
     * Đếm số từ của một chuỗi,
     * giả sử các từ được ngăn cách nhau bởi một hoặc nhiều
     * dấu 'space', tab '\t' và xuống dòng '\n'
     *
     * @param input - chuỗi ký tự
     * @return số từ của chuỗi ký tự input
     */
    public static Map<String, Integer> countWords(String input) {
        // khởi tạo wordMap
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if (input == null) {
            return wordMap;
        }
        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                // build một từ
                sb.append(input.charAt(i));
              //  System.out.println(sb);
            } else {
                // thêm từ vào wordMap
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        // thêm từ cuối cùng tìm được vào wordMap
        addWord(wordMap, sb);
        return wordMap;
    }

    /**
     * Thêm từ vào wordMap
     *
     * @param wordMap: map chứa các từ và số lần xuất hiện
     * @param sb: từ cần thêm vào wordMap
     */
    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}
