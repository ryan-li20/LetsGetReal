public class Tester{
  public static void main(String[] args){
    RationalNumber a = new RationalNumber(10, 14);
    System.out.println(a.getDenominator());
    System.out.println(a.getNumerator());
    System.out.println(a.getValue());
    System.out.println(a.reciprocal());
    System.out.println(a.toString());

    System.out.println(a.multiply(a));
    System.out.println(a.divide(a));
    System.out.println(a.subtract(a));
    System.out.println(a.add(a));
  }

  public static int gcd(int x, int y){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int r = 1;
    int a = Math.max(Math.abs(x), Math.abs(y));
    int b = Math.min(Math.abs(x), Math.abs(y));
    boolean zero = false;
    while (!zero){
      int remainder = a % b;
      if(remainder == 0){
        zero = false;
        break;
      }
      a = b;
      b = remainder;
    }
    return b;
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

  public static void sum(){
    RealNumber a = new RealNumber(8.0);
    RealNumber b = new RealNumber(16.942);
    RealNumber c = new RealNumber(-14.36);
    RealNumber d = new RealNumber(Math.sqrt(3));
    System.out.println();
  }



}
