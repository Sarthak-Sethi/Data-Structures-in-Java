/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codingninja;

public class ComplexNumbers
{
  private int real;
  private int imaginary;
  ComplexNumbers(int real ,int imaginary)
  {
    this.real=real;
    this.imaginary=imaginary;
  }
  public void print()
  {
    System.out.println(this.real+"+"+this.imaginary+"i");
  }
  
  public void plus(ComplexNumbers c2)
  {
    this.real = this.real+c2.real;
    this.imaginary= this.imaginary+c2.imaginary;
  }
  public void multiply(ComplexNumbers c2)
  {
      int newreal;
      int newimaginary;
    newreal = this.real*c2.real - this.imaginary*c2.imaginary;
    newimaginary = this.real*c2.imaginary + c2.real*this.imaginary;
    this.real = newreal;
    this.imaginary = imaginary;
  }
}
  