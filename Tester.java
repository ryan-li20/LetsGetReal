public class Tester{
  public static void main(String[] args){
    equalsTest();
  }

  public static void equalsTest(){
    RealNumber a = new RealNumber(17.0);
    RealNumber b = new RealNumber(18.0);
    RealNumber c = new RealNumber(17.0);
    RealNumber d = new RealNumber(0.0);
    RealNumber e = new RealNumber(17.00001);
    RealNumber f = new RealNumber(17.01);
    System.out.println();
    System.out.println("equals tests");
    System.out.println(!a.equals(b));
    System.out.println(a.equals(c));
    System.out.println(a.equals(a));
    System.out.println(a.equals(e));
    System.out.println(!a.equals(f));
  }
}
