import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Yandex_67 {

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

    int n = Integer.parseInt(reader.readLine());

    String[] parts = reader.readLine().split(" ");

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(parts[i]);
    }
    if (n == 1) {
      writer.write("0");
    } else if (n == 2) {

      if (isSymmetric(nums)) {
        writer.write("0");
      } else {
        writer.write("2");
        writer.newLine();
        writer.write(nums[1] + " " + nums[0]);
      }
    } else {
      if (isSymmetric(nums)) {
        writer.write("0");
      } else {
        List<Integer> toAdd = new LinkedList<>();
        toAdd.add(nums[0]);

        for (int i = 1; i < n; i++) {
          int[] copy = Arrays.copyOfRange(nums, i, n);
          if (isSymmetric(copy)) {
            break;
          } else {
            toAdd.add(0, nums[i]);
          }
        }
        writer.write(String.valueOf(toAdd.size()));
        writer.newLine();
        String result = toAdd.stream().map(Object::toString).collect(Collectors.joining(" "));
        writer.write(result);
      }

    }

    reader.close();
    writer.close();
  }

  static boolean isSymmetric(int[] a) {
    if (a.length == 1) {
      return true;
    }
    if (a.length == 2) {
      return a[0] == a[1];
    }

    int n = a.length;
    int mid = a.length / 2;

    for (int i = 0; i < mid; i++) {
      if (a[i] != a[n - 1 - i]) {
        return false;
      }
    }
    return true;
  }

}
