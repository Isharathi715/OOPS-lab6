public class AverageNumbers {
    public static void main(String[] args) {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        analyzer.process();
    }
}
class NumberAnalyzer {
    void process() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0;
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        int aboveAverage = 0;
        for (double number : numbers) {
            if (number > average) aboveAverage++;
        }
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + aboveAverage);
        scanner.close();
    }
}
