public class Main {
        public static void main(String[] args) {
            // Testing static methods
            System.out.println(MathUtil.isPrime(7)); // true
            System.out.println(MathUtil.gcd(15, 25)); // 5
            System.out.println(MathUtil.lcm(4, 5)); // 20
            System.out.println(MathUtil.fibonacci(10)); // 55
            System.out.println(MathUtil.factorial(5)); // 120

            // Creating an object to test non-static methods
            MathUtil util = new MathUtil();
            System.out.println(util.isPerfectNumber(28)); // true
            System.out.println(util.sumOfDigits(1234)); // 10
            System.out.println(util.reverseNumber(1234)); // 4321
            System.out.println(util.isArmstrongNumber(153)); // true
            System.out.println(util.nextPrime(11)); // 13
        }

    }
