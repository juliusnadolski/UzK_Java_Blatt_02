package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 5;
        int j = 7;
        int k = 6;
        int min = Math.min(i, Math.min(j, k));
        int max = Math.max(i, Math.max(j, k));

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);

            // Alternative ohne Math.min/Math.max

/*             if (i <= j && i <= k) {
                min = i;
            } else if (j <= i && j <= k) {
                min = j;
            } else {
                min = k;
            }

            if (i >= j && i >= k) {
                max = i;
            } else if (j >= i && j >= k) {
                max = j;
            } else {
                max = k;
            }

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max); */
        }
    }


