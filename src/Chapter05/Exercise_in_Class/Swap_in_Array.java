package Chapter05.Exercise_in_Class;

public class Swap_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,2};
        swap(arr);
        System.out.println("X: " + arr[0]);
        System.out.println("Y: " + arr[1]);
    }
    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }
}

//todo ，我们使用了数组来传递参数。数组是对象类型，
// 方法参数的传递是按引用传递的。这意味着当你调用 swap(values) 时，
// 实际上传递给 swap 方法的是数组 values 的引用，而不是它的副本。
// 所以，swap 方法内部对数组元素的修改会影响到 main 方法中的原始数组。
