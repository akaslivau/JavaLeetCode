import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Yandex_1 {

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

    int len = Integer.parseInt(reader.readLine());

    int[] nums = new int[len];

    String[] parts = reader.readLine().split(" ");
    for (int i = 0; i < len; i++) {
      nums[i] = Integer.parseInt(parts[i]);
    }
    Arrays.sort(nums);
    if (len < 4) {
      writer.write(String.valueOf(Math.abs(nums[len - 1] - nums[0])));
    } else {
      int[] dp = new int[len];
      dp[1] = nums[1] - nums[0];
      dp[2] = nums[2] - nums[0];

      for (int i = 3; i < len; i++) {
        dp[i] = Math.min(dp[i - 1], dp[i - 2]) + nums[i] - nums[i - 1];
      }
      writer.write(String.valueOf(dp[len-1]));
    }
    reader.close();
    writer.close();
  }

}
