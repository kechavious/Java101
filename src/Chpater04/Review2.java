package Chpater04;

public class Review2 {
    public static void main(String[] args) {
        /* todo Let s1 be " Welcome " and s2 be " welcome ". Write the code for the following statements:
            (a) Check whether s1 is equal to s2 and assign the result to a Boolean variable isEqual.
            (b) Check whether s1 is equal to s2, ignoring case, and assign the result to a Boolean variable isEqual.
            (c) Compare s1 with s2 and assign the result to an int variable x.
            (d) Compare s1 with s2, ignoring case, and assign the result to an int
            variable x.
            (e) Check whether s1 has the prefix AAA and assign the result to a Boolean
            variable b.
            (f) Check whether s1 has the suffix AAA and assign the result to a Boolean
            variable b.
            (g) Assign the length of s1 to an int variable x.
            (h) Assign the first character of s1 to a char variable x.
            (i) Create a new string s3 that combines s1 with s2.
            (j) Create a substring of s1 starting from index 1.
            (k) Create a substring of s1 from index 1 to index 4.
            (l) Create a new string s3 that converts s1 to lowercase.
            (m) Create a new string s3 that converts s1 to uppercase.
            (n) Create a new string s3 that trims whitespace characters on both ends of s1.
            (o) Assign the index of the first occurrence of the character e in s1 to an int variable x.
            (p) Assign the index of the last occurrence of the string abc in s1 to an int variable x.

         */
        // Define strings s1 and s2
        String s1 = " Welcome ";
        String s2 = " welcome ";

        // (a) Check whether s1 is equal to s2 and assign the result to a Boolean variable isEqual
        boolean isEqual = s1.equals(s2);
        System.out.println("Are s1 and s2 equal? " + isEqual); //false

        // (b) Check whether s1 is equal to s2, ignoring case, and assign the result to a Boolean variable isEqual
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2); //true
        System.out.println("Are s1 and s2 equal ignoring case? " + isEqualIgnoreCase);// todo 0, 因为都是相同的，忽略了大小写！！！

        // (c) Compare s1 with s2 and assign the result to an int variable x.
        int x = s1.compareTo(s2);
        System.out.println(x); // -32
        //todo compare the different character in ascii code and first show in the two string!!!

        // (d) Compare s1 with s2, ignoring case, and assign the result to an int variable x.
        int x1 = s1.compareToIgnoreCase(s2);
        System.out.println(x1); //0, 因为都是相同的，忽略了大小写！！！

        // (e) Check whether s1 has the prefix AAA and assign the result to a Boolean variable b.
        boolean b= s1.startsWith("AAA");
        System.out.println(b); // false

        // (f) Check whether s1 has the suffix AAA and assign the result to a Boolean variable b.
        boolean b1 = s1.endsWith("AAA");
        System.out.println(b1); // false

        // (g) Assign the length of s1 to an int variable x.
        int y = s1.length();
        System.out.println(y); // 9 becasue it is space + welcome + space, so it is 9!!!

        // (h) Assign the first character of s1 to a char variable x.
        char c = s1.charAt(0);
        System.out.println(c); // space

        // (i) Create a new string s3 that combines s1 with s2.
        String s3 = s1 + s2;
        System.out.println(s3); // Welcome  welcome

        // (j) Create a substring of s1 starting from index 1.
        String s4 = s1.substring(1);
        System.out.println(s4); // todo it is Welcome with not the prefix space but include last space

        // (k) Create a substring of s1 from index 1 to index 4.
        String s5 = s1.substring(1,4);
        System.out.println(s5); // todo it is Wel i guess, it is correct!!!

        // (l) Create a new string s3 that converts s1 to lowercase.
        String s6 = s1.toLowerCase();
        System.out.println(s6); // space + welcome + space

        // (m) Create a new string s3 that converts s1 to uppercase.
        String s7 = s1.toUpperCase();
        System.out.println(s7);// space + WELCOME + space

        // (o) Assign the index of the first occurrence of the character e in s1 to an int variable x.
        int x3 = s1.indexOf("e");
        System.out.println(x3); // todo i guess it is 2, it is correct!!!

        // (p) Assign the index of the last occurrence of the string abc in s1 to an int variable x.
        int x4 = s1.indexOf("abc");
        System.out.println(x4); // todo i guess it will return to -1 because no value is "abc", it is correct!!!
    }

}
