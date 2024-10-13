public class Coupone {
  private int count;
  private static Coupone instance;

  public Coupone() {
  }

  public static Coupone createdCoupone() {
    if (instance == null) {

      instance = new Coupone();

    }

    return instance;

  }

  public int getCount() {
    System.out.println(count);

    return count;
  }

  public void setCount(int c) {
    this.count = c;
  }

}