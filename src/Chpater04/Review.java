package Chpater04;

public class Review {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";

        System.out.println(s1.lastIndexOf("o", 15)); //todo 9
        System.out.println(s1.compareTo(s2)); // todo P and W has 7;
        System.out.println(s2.compareTo(s3)); //todo W and P has -7
        System.out.println(s2.compareTo(s2)); //todo P and P is 0
        System.out.println(s1.charAt(0)); //todo W
        System.out.println(s1.indexOf('j')); // todo -1
        System.out.println(s1.indexOf("to")); // todo 8
        System.out.println(s1.lastIndexOf('a'));//todo 14
        System.out.println(s1.length()); //todo 15
        System.out.println(s1.substring(5, 11)); //me to
        System.out.println(s1.substring(5)); //me to Java
        System.out.println(s1.startsWith("Wel")); //True
        System.out.println(s1.endsWith("Java")); //todo True?
        System.out.println(s1.toLowerCase()); //"welcome to java"
        System.out.println(s1.toUpperCase()); //WELCOME TO JAVA
        System.out.println(s1.concat(s2)); // todo 这是连接的意思，等于Welcome to Java + Programing is fun，中间没有空格！
        System.out.println(s1.contains(s2)); //todo False
        System.out.println(s2.contains(s3)); //todo False?
        System.out.println(s1.contains(s3)); // tod True
        System.out.println("\t Wel \t".trim()); //todo trim（）就是去除首尾的空格之类的！！！

        Review.test();
        Review.test2();

    }
    public static void test(){
        System.out.println("1" + 1); //String "11"
        System.out.println('1' + 1);
        //todo it is a ascii code of '1' and plus int 1 so it returns 50 ！！！
        // because it is like 49 + 1 = 50!!!!!!
        // return an int
        System.out.println("1" + 1 + 1); // String "11" + 1 to another String that is "111"
        System.out.println("1" + (1 + 1)); //有括号的优先在java中，所以是“12”
        System.out.println('1' + 1 + 1); // todo 和先前的一样，49 + 1 + 1 ，返回一个int!!!

    }
    public static void test2(){
        System.out.println(1 + "Welcome " + 'a' + 1);
        System.out.println('a' + 1 + "Welcome" + 1); //todo "98Welcome1" ????

        //todo 记住，如果字符串在前和数字相加，那么都会变成字符串！！！
        // 如果数字在前字符串在后面，那么数字先相加后再连接字符串！！！
    }
}
