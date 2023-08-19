import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Yandex_66 {

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

    String[] parts = reader.readLine().split(" ");

    int n = parts.length;

    long[] maxees = new long[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
    long[] minees = new long[]{Integer.MAX_VALUE, Integer.MAX_VALUE};

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(parts[i]);

      if (num >= maxees[1]) {
        maxees[0] = maxees[1];
        maxees[1] = num;
      } else if (num > maxees[0]) {
        maxees[0] = num;
      }

      if (num <= minees[0]) {
        minees[1] = minees[0];
        minees[0] = num;
      } else if (num < minees[1]) {
        minees[1] = num;
      }
    }

    String result;
    if (maxees[0] * maxees[1] > minees[0] * minees[1]) {
      result = Arrays.stream(maxees).mapToObj(String::valueOf).collect(Collectors.joining(" "));
    } else {
      result = Arrays.stream(minees).mapToObj(String::valueOf).collect(Collectors.joining(" "));
    }

    writer.write(result);

    reader.close();
    writer.close();
  }

}
