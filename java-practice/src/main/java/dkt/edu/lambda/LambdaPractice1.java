package dkt.edu.lambda;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import jdk.dynalink.Operation;

/*
(1)
int max(int a, int b) {
	return a > b ? a : b;
}

(2)
void printVar(String name, int i) {
	System.out.println(name+"="+i);
}

(3)
int square(int x) {
	return x*x;
}

(4)
int roll() {
	return (int)(Math.random() * 6);
}

(5)
int sumArr(int[] arr) {
	int sum = 0;
	for(int i : arr)
		sum += i;
	return sum;
}

(6)
int[] emptyArr() {
	return new int[] {};
}
 */
public class LambdaPractice1 {

    public static void main(String[] args){
        //(1)
        IntBinaryOperator ibo = (int a, int b) -> a > b ? a : b;
        int num = ibo.applyAsInt(10, 30);
        System.out.println(num);

        //(2)
        BiConsumer<String, Integer> p2 = (name, i) -> System.out.println(name+"="+i);
        p2.accept("용욱", 100);
        System.out.println(p2);

        //(3)
        IntUnaryOperator p3 = x -> x*x;
        int num3 = p3.applyAsInt(3);
        System.out.println(num3);

        //(4)
        Supplier<Integer> p4 = ()-> (int)(Math.random()*6)+1;
        System.out.println(p4.get());

        //(5)
        Function<int[], Integer> p5 = (int[] arr) -> {
            int sum = 0;
            for(int k : arr){
                sum += k;
            }
            return sum;
        };
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(p5.apply(arr));

        //(6)
        Supplier<int[]> p6 = () -> new int[]{};
        System.out.println(p6.get().length);
    }
}
