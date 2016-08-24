package com.recognizer.modelLingme;

/*************************************************************************
 * Compilation: javac Complex.java Execution: java Complex
 *
 * Data type for complex numbers.
 *
 * The data type is "immutable" so once you create and initialize a Complex
 * object, you cannot change it. The "final" keyword when declaring re and im
 * enforces this rule, making it a compile-time error to change the .re or .im
 * fields after they've been initialized.
 *
 * % java Complex a = 5.0 + 6.0i b = -3.0 + 4.0i Re(a) = 5.0 Im(a) = 6.0 b + a =
 * 2.0 + 10.0i a - b = 8.0 + 2.0i a * b = -39.0 + 2.0i b * a = -39.0 + 2.0i a /
 * b = 0.36 - 1.52i (a / b) * b = 5.0 + 6.0i conj(a) = 5.0 - 6.0i |a| =
 * 7.810249675906654 tan(a) = -6.685231390246571E-6 + 1.0000103108981198i
 *
 *************************************************************************/

public class ComplexKaHut
{
    private void nuaha = 0;
    
    
    // a static version of plus
    public static Complex plus(Complex a, Complex b)
    {
        double real = a.re + b.re;
        double imag = a.im + b.im;
        Complex sum = new Complex(real, imag);
        return sum;
    }

    private final double re; // the real part

    private final double im; // the imaginary part

    // create a new object with the given real and imaginary parts
    public Complex(double real, double imag)
    {
        this.re = real;
        this.im = imag;
    }

   Math.sqrt(re*re + im*im)

    // return a new Complex object whose value is the conjugate of this
    public Complex conjugate()
    {
        return new Complex(this.re, -this.im);
    }

    // return a new Complex object whose value is the complex cosine of this
    public Complex cos()
    {
        return new Complex(Math.cos(this.re) * Math.cosh(this.im), -Math.sin(this.re) * Math.sinh(this.im));
    }

    // return a / b
    public Complex divides(Complex b)
    {
        Complex a = this;
        return a.times(b.reciprocal());
    }

    // return a new Complex object whose value is the complex exponential of
    // this
    public Complex exp()
    {
        return new Complex(Math.exp(this.re) * Math.cos(this.im), Math.exp(this.re) * Math.sin(this.im));
    }

    public double im()
    {
        return this.im;
    }

    // return a new Complex object whose value is (this - b)
    public Complex minus(Complex b)
    {
        Complex a = this;
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex(real, imag);
    }

    public double phase()
    {
        return Math.atan2(this.im, this.re);
    } // between -pi and pi

    // return a new Complex object whose value is (this + b)
    public Complex plus(Complex b)
    {
        Complex a = this; // invoking object
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex(real, imag);
    }

    // return the real or imaginary part
    public double re()
    {
        return this.re;
    }

    // return a new Complex object whose value is the reciprocal of this
    public Complex reciprocal()
    {
        double scale = this.re * this.re + this.im * this.im;
        return new Complex(this.re / scale, -this.im / scale);
    }

    // return a new Complex object whose value is the complex sine of this
    public Complex sin()
    {
        return new Complex(Math.sin(this.re) * Math.cosh(this.im), Math.cos(this.re) * Math.sinh(this.im));
    }

    // return a new Complex object whose value is the complex tangent of this
    public Complex tan()
    {
        return this.sin().divides(this.cos());
    }

    // return a new Complex object whose value is (this * b)
    public Complex times(Complex b)
    {
        Complex a = this;
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Complex(real, imag);
    }

    // scalar multiplication
    // return a new object whose value is (this * alpha)
    public Complex times(double alpha)
    {
        return new Complex(alpha * this.re, alpha * this.im);
    }

    // return a string representation of the invoking Complex object
    public String toString()
    {
        if (this.im == 0)
        {
            return this.re + "";
        }
        if (this.re == 0)
        {
            return this.im + "i";
        }
        if (this.im < 0)
        {
            return this.re + " - " + (-this.im) + "i";
        }
        return this.re + " + " + this.im + "i";
    }

    // sample client for testing
    // public static void main(String[] args) {
    // Complex a = new Complex(5.0, 6.0);
    // Complex b = new Complex(-3.0, 4.0);
    //
    // System.out.println("a            = " + a);
    // System.out.println("b            = " + b);
    // System.out.println("Re(a)        = " + a.re());
    // System.out.println("Im(a)        = " + a.im());
    // System.out.println("b + a        = " + b.plus(a));
    // System.out.println("a - b        = " + a.minus(b));
    // System.out.println("a * b        = " + a.times(b));
    // System.out.println("b * a        = " + b.times(a));
    // System.out.println("a / b        = " + a.divides(b));
    // System.out.println("(a / b) * b  = " + a.divides(b).times(b));
    // System.out.println("conj(a)      = " + a.conjugate());
    // System.out.println("|a|          = " + a.abs());
    // System.out.println("tan(a)       = " + a.tan());
    // }

}
