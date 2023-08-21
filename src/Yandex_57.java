import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Yandex_57 {

  /*
Для чтения входных данных необходимо получить их
из стандартного потока ввода (System.in).
Данные во входном потоке соответствуют описанному
в условии формату. Обычно входные данные состоят
из нескольких строк. Можно использовать более производительные
и удобные классы BufferedReader, BufferedWriter, Scanner, PrintWriter.

С помощью BufferedReader можно прочитать из стандартного потока:
* строку -- reader.readLine()
* число -- int n = Integer.parseInt(reader.readLine());
* массив чисел известной длины (во входном потоке каждое число на новой строке) --
int[] nums = new int[len];
  for (int i = 0; i < len; i++) {
      nums[i] = Integer.parseInt(reader.readLine());
  }
* последовательность слов в строке --
String[] parts = reader.readLine().split(" ");

Чтобы вывести результат в стандартный поток вывода (System.out),
Через BufferedWriter можно использовать методы
writer.write("Строка"), writer.write('A') и writer.newLine().

Возможное решение задачи "Вычислите сумму чисел в строке":
int sum = 0;
  String[] parts = reader.readLine().split(" ");
  for (int i = 0; i < parts.length; i++) {
      int num = Integer.parseInt(parts[i]);
      sum += num;
  }
  writer.write(String.valueOf(sum));
*/
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] first = reader.readLine().split("");
    String[] second = reader.readLine().split("");

    Map<String, Integer> firstCounts = getCounts(first);
    Map<String, Integer> secondCounts = getCounts(second);

    int intersectCount = 0;
    for (Entry<String, Integer> e : secondCounts.entrySet()) {
      intersectCount += e.getValue() * firstCounts.getOrDefault(e.getKey(), 0);
    }

    writer.write(String.valueOf(intersectCount));

    reader.close();
    writer.close();
  }

  private static Map<String, Integer> getCounts(String[] first) {
    Map<String, Integer> countMap = new HashMap<>();

    int firstLen = first.length;
    for (int i = 1; i < firstLen; i++) {
      String key = first[i - 1] + first[i];
      countMap.merge(key, 1, (old, neu) -> old + 1);
    }
    return countMap;
  }


}
