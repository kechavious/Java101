public class SumOfOddPrimeNumbers {
    public static void main(String[] args){
        int sum = 0;
        for(int i = -6; i <= 5; i++){ // 循环遍历范围
            if(i == 0 || Math.abs(i) == 2) continue; // 跳过0和2

            boolean isPrime = true; // isPrime标志

            // 嵌套循环找素数
            for(int j = 2; j <= Math.abs(i/2); j++){ // 循环检查[2..n/2]的所有除数
                if(i % j == 0) { // 如果能够整除，则不是素数
                    isPrime = false;
                    break; // 提前跳出内层循环
                }
            }

            if(isPrime) {
                System.out.println(i); // 打印出奇数进行调试
                sum += i; // 如果是素数则加入总和
            }
            else {
                System.out.println(i + " is not a prime number"); // 打印出非素数进行调试
            }

        }

        System.out.println(sum); // 打印总和
    }
}



