public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    printRangeOfNumbers(3, 10);
    printRangeOfNumbersBackWards(3, 10);
    printRangeOfNumbers(50, 10);
  }

  public static void printRangeOfNumbers(int start, int end){
    for(int i = start; i <= end; i++) {
      System.out.printf("%d ", i);
    }

    System.out.println();
  }

  public static void printRangeOfNumbersBackWards(int start, int end){
    for(int i = end; i >= start; i--) {
      System.out.printf("%d ", i);
    }

    System.out.println();
  }
}
