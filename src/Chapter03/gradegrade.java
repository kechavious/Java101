package Chapter03;

public class gradegrade {
    public static void main(String[] args) {
        System.out.println(Grade(6.5,80,90));
    }
    public static String Grade(double a, double b, double c){
        double ass = a * (3);
        double mid = b * (0.3);
        double fin = c * (0.4);

        double total = ass + mid + fin;
        System.out.println(total);

        if (total >= 90.0){
            return "A";
        }
        else if (total >= 80){
            return "B";
        }
        else if (total > 70){
            return "C;";
        }
        else if (total > 60){
            return "D";
        }
        else{
            return "F";
        }

    }
}
