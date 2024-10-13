public class Main {

  public static void main(String[] args) {

    int lo = 1;
    int hi = 1;
    System.out.println("l" + lo);
    while (hi < 50) {
      hi = lo + hi;
      lo = hi - lo;
      System.out.println("h" + hi);
      // System.out.println("l"+lo);
    }
  }

}