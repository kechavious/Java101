package Chapter05.Exercise_in_Class;

public class Swap {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        swap(x, y);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);
    }
}

//todo 在原始的代码中，参数 x 和 y 是基本数据类型 int。
// 在 Java 中，方法参数的传递是按值传递的。这意味着当你调用 swap(x, y) 时，
// 实际上传递给 swap 方法的是 x 和 y 的副本，而不是它们的引用。
// 所以，swap 方法内部对 x 和 y 的修改不会影响到 main 方法中的原始变量 x 和 y。


