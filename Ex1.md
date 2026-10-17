# Ex 1 — Java Logic Building

## Question 1: Check Whether a Number Is Odd

**Problem:** Return `2` if the given number is odd; otherwise, return `1`. Zero must not be treated as odd.

```java
import java.util.Scanner;

public class OddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num != 0 && num % 2 != 0) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }

        sc.close();
    }
}
```

## Question 2: Find the Last Digit of a Number

**Problem:** Print the last digit as a positive number, even if the input is negative.

```java
import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int lastDigit = Math.abs(num % 10);
        System.out.println(lastDigit);

        sc.close();
    }
}
```

## Question 3: Add the Last Digits of Two Numbers

**Problem:** Add the last digits of two numbers. Ignore the signs of the inputs.

```java
import java.util.Scanner;

public class SumOfLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int digit1 = Math.abs(num1 % 10);
        int digit2 = Math.abs(num2 % 10);

        System.out.println(digit1 + digit2);

        sc.close();
    }
}
```

## Sample Checks

| Exercise | Input | Output |
|---|---|---|
| Odd check | `123` | `2` |
| Odd check | `456` | `1` |
| Last digit | `-197` | `7` |
| Sum of last digits | `267 -154` | `11` |
