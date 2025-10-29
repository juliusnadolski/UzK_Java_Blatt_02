package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = -10;

        boolean cond1 = (i > j);
        boolean cond2 = (i > 200);
        boolean cond3 = (j > 100);

        if (cond1 && !cond2 && !cond3) {
            k = 1;
        } else if (cond1 && cond2 && !cond3) {
            k = 2;
        } else if (cond1 && cond2 && cond3) {
            k = 3;
        } else if (!cond1 && !cond2 && !cond3) {
            k = 4;
        }
        System.out.println(k);
    }
}
