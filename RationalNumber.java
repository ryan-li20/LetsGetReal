public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if(deno == 0){
      numerator = 0;
      denominator = 1;
    }
    reduce();
  }

  public double getValue(){
    return numerator / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber something = new RationalNumber(denominator, numerator);
    return something;

  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    boolean what = this.getNumerator() == other.getNumerator();
    boolean hatw = this.getDenominator() == other.getDenominator();
    return what && hatw;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return "" + getNumerator() + "/" + getDenominator();
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int x, int y){
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

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    numerator = numerator / gcd(numerator, denominator);
    denominator = denominator / gcd(numerator, denominator);
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int numss = this.getNumerator() * other.getNumerator();
    int denomss = this.getDenominator() * other.getDenominator();
    RationalNumber thing = new RationalNumber(numss, denomss);
    thing.reduce();
    return thing;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int numss = this.getNumerator() * other.getDenominator();
    int denoms = this.getDenominator() * other.getNumerator();
    RationalNumber thing = new RationalNumber(numss, denoms);
    thing.reduce();
    return thing;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int nums = this.getNumerator() * other.getDenominator();
    int nums2 = other.getNumerator() * this.getDenominator();
    int denom =  this.getDenominator() * other.getDenominator();
    RationalNumber ret = new RationalNumber(nums+nums2, denom);
    return ret;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int nums = this.getNumerator() * other.getDenominator();
    int nums2 = other.getNumerator() * this.getDenominator();
    int denom =  this.getDenominator() * other.getDenominator();
    RationalNumber ret = new RationalNumber(nums-nums2, denom);
    return ret;
  }
}
