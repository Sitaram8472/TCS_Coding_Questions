// Problem Statement: Given an Octal Number, convert it into a Decimal Number.

// Examples
// Example 1:
// Input: 345
// Output: 229
// Explanation: Decimal equivalent of given Octal expressionis 229

// Example 2:
// Input: 170
// Output: 121
// Explanation: Decimal equivalent of given Octal expression is 121

public class OctaltoDecimal {
  public static void main(String[] args) {
    int n = 170;

    int decimal = 0;
    int power = 0;

    while (n != 0) {
      int digit = n % 10;
      decimal += digit * (int) Math.pow(8, power);
      power++;
      n /= 10;
    }

    System.out.println(decimal);

  }

}
