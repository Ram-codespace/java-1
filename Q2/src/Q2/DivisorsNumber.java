package Q2;

public class DivisorsNumber {
        public static void main(String[] args) {
            int num = 24;

            System.out.println("Divisors are:");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

