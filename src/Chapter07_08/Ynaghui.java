package Chapter07_08;

public class Ynaghui {
    public static void main(String[] args) {
        int numRows = 5; // 指定要打印的行数

        // 创建一个二维数组来存储杨辉三角形
        int[][] triangle = new int[numRows][];

        // 填充数组并打印杨辉三角形
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // 每行的第一个数字为1

            // 填充中间的数字
            for (int j = 1; j < i; j ++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }

            // 每行的最后一个数字为1
            triangle[i][i] = 1;

            // 打印空格使数字居中显示
            for (int k = 0; k < numRows - i; k++) {
                System.out.print(" ");
            }

            // 打印数字
            for (int num : triangle[i]) {
                System.out.print(num + " ");
            }

            // 换行
            System.out.println();
        }
    }
}
