public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    if(this.getValue() == 0 || other.getValue() == 0){
      return this.getValue() == other.getValue();
    }
    if(Math.abs(this.getValue() - other.getValue()) < (this.getValue()/100000)){
      return true;
    }
    return false;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber
     //or other subclasses of RealNumber (that aren't written yet)
     double sum = this.getValue() + other.getValue();
     RealNumber sum1 = new RealNumber(sum);
     return sum1;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    double product = this.getValue() * other.getValue();
    RealNumber product1 = new RealNumber(product);
    return product1;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    double numss = this.getValue();
    double denoms = other.getValue();
    if(denoms < 0){
      denoms = Math.abs(denoms);
      numss = 0-numss;
    }
    RealNumber thingy = new RealNumber(numss/denoms);
    return thingy;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    RealNumber thing = new RealNumber(this.getValue() - other.getValue());
    return thing;
  }
}
