import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Yandex_70 {

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

    int n = getInt(reader);
    int[] nums = intArray(reader, n);

    int x = getInt(reader);

    int minDistance = Integer.MAX_VALUE;
    int index = 0;
    for (int i = 0; i < n; i++) {
      int distance = Math.abs(nums[i] - x);
      if (distance <= minDistance) {
        minDistance = distance;
        index = i;
      }

    }
    writer.write(String.valueOf(nums[index]));

    reader.close();
    writer.close();

  }

  private static int getInt(BufferedReader reader) throws IOException {
    return Integer.parseInt(reader.readLine());
  }

  private static int[] intArray(BufferedReader reader, int n) throws IOException {
    String[] parts = reader.readLine().split(" ");

    return parseToArray(parts, n);
  }

  private static int[] parseToArray(String[] parts, int n) {
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      res[i] = Integer.parseInt(parts[i]);
    }
    return res;
  }

  private static int[] intArray(BufferedReader reader) throws IOException {
    String[] parts = reader.readLine().split(" ");
    return parseToArray(parts, parts.length);
  }


}
