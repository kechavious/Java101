/**
 * Gradebook
 * Class to determine a letter grade based on a value
 */

public class GRADES {
    public static char getLetter(double grade){
        // Takes in a double value and returns a corresponding grade for the ranges listed below
        if(grade >= 90)
            return 'A';
        else if(grade >= 80)
            return 'B';
        else if(grade >= 70)
            return 'C';
        else if(grade >= 60)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args) {
        // Asserting our program works as it should
        assert getLetter(90.0) == 'A';
        assert getLetter(89.9) == 'B';
        assert getLetter(80.0) == 'B';
        assert getLetter(79.9) == 'C';
        assert getLetter(70.0) == 'C';
        assert getLetter(69.9) == 'D';
        assert getLetter(60.0) == 'D';
        assert getLetter(59.9) == 'F';

    }

}