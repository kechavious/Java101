package Chapter07_08;

public class TwoDarray {
    public static void main(String[] args) {
        int arr[][] = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int result = (i + 1) * (j + 1); // 加上1，因为i和j的范围是0到8
                System.out.print(result + "\t"); // 使用制表符分隔结果
            }
            System.out.println();
        }
    }
}

