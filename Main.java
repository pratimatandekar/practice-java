
class Main {
    public static void main(String[] args) {
        int n = 32; // Number of terms you want
        int first = 0, second = 1;

        System.out.print("Fibonacci Series till " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            // compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }

    }



