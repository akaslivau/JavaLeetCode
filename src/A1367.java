// https://codeforces.com/problemset/problem/1367/A

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A1367 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            if (input.length() == 2) {
                System.out.println(input);
                continue;
            }

            String s = input.substring(1, input.length() - 2);
            String reduced = IntStream.range(0, s.length())
                    .filter(index -> index % 2 == 0)
                    .mapToObj(s::charAt)
                    .map(Object::toString)
                    .collect(Collectors.joining());
            System.out.println(input.charAt(0) + reduced + input.charAt(input.length() - 1));
        }
    }
}




