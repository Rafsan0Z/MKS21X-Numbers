public class RationalNumber extends RealNumber {

private int a;
private int b;

public RationalNumber(int nume, int deno) {
	super(0.0);
	if (deno == 0) {
		a = 0;
		b = 1;
	}
	else {
		int simp = gcd(nume,deno);	
		a = nume / simp;
		b = deno / simp;
	} 

}

public double getValue() {

	double top = (double)a;
	double down = (double)b;
	return top / down;
}

public int getNumerator() {

	return a;
}

public int getDenominator() {

	return b;
}

public RationalNumber reciprocal() {

	RationalNumber result = new RationalNumber(b,a);
	return result;
}

public boolean equals(RationalNumber other) {

	if (this.getValue() == other.getValue()) {
		return true;
	}
	else {
		return false;
	}
}

public String toString() {

	return "The Rational Number is: " + getValue();
} 


private static int gcd(int a, int b) {
        int result = 1;
       for(int i = 2; i <= a && i <= b; i++) {
           if (a % i == 0 && b % i == 0) {
                result = i;
           }
       }
        return result;
}

private void reduce() {

	a = a / gcd(a,b);
	b = b / gcd(a,b);

}

public RationalNumber multiply(RationalNumber other) {

	int nume = other.getNumerator();
	int deno = other.getDenominator();
	int num = this.getNumerator();
	int den = this.getDenominator();
	int top = nume * num;
	int down = deno * den;
	top = top / gcd(top,down);
	down = down / gcd(top,down);
	RationalNumber result = new RationalNumber(top,down);
	return result;
}

public RationalNumber divide(RationalNumber other) {

	int nume = other.getNumerator();
	int deno = other.getDenominator();
	int num = this.getNumerator();
	int den = this.getDenominator();
	int top = nume * den;
	int down = deno * num;
	top = top / gcd(top,down);
	down = down / gcd(top, down);
	RationalNumber result = new RationalNumber(top,down);
	return result;
}

public RationalNumber add(RationalNumber other) {

	int nume = other.getNumerator();
	int deno = other.getDenominator();
	int num = this.getNumerator();
	int den = this.getDenominator();
	int down = deno * den;
	int top = (nume*den) + (num * deno);
	top = top / gcd(top,down);
	down = down / gcd(top,down);
	RationalNumber result = new RationalNumber(top,down);
	return result;
	
}

public RationalNumber subtract(RationalNumber other) {

	int nume = other.getNumerator();
	int deno = other.getDenominator();
	int num = this.getNumerator();
	int den = this.getDenominator();
	int down = deno * den;
	int top = (nume*den) - (num*deno);
	top = top / gcd(top,down);
	down = down / gcd(top,down);
	RationalNumber result = new RationalNumber(top,down);
	return result;
}

}
