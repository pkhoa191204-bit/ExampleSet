import java.util.*;

public class ExampleSet {
    public static void main(String[] args) {
        Set<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java"); // Trùng, sẽ bị bỏ qua

        System.out.println("Các ngôn ngữ lập trình:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // Kiểm tra tồn tại
        System.out.println("\nCó chứa 'Java' không? " + languages.contains("Java"));
    }
}

