package week02.higherorderfunctions;

import java.util.function.Function;

/**
 * Created by skbm0001 on 2/9/2017.
 */
public class HigherOrderFunctions {
    public int sum(Function<Integer, Integer> f, int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return f.apply(a) + sum(f, a+1, b);
        }
    }
    public static void main(String[] args) {
        HigherOrderFunctions f = new HigherOrderFunctions();
        System.out.println(f.sum(x->x, 1, 3));
    }
}
