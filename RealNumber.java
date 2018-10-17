public class RealNumber {

private double x;

public RealNumber(double value) {

	x = value;

}

public double getValue() {

	return x;
}

public String toString() {

	return "" + x;
}

public double add(RealNumber other) {

	return x + other.getValue();
}

public double multiply(RealNumber other) {

	return x*other.getValue();
}

public double divide(RealNumber other) {

	return x/other.getValue();
}

public double subtract(RealNumber other) {

	return x - other.getValue();
}

}
