import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle.
        
        double squarefirst = legA;
        squarefirst *= legA;
        double squaresecond= legB;
        squaresecond *= legB;
        double total = Math.sqrt(squarefirst + squaresecond);
        return total;

        // calculate the value of c given legA and legB
    }
}
