import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest {

    @Test
    public void testTotalRowArray() {
       
        int[][] studentScores = { {50, 60}, {70, 80}, {90, 100}  };
        int studentsNumber = 3;

       
        int[] expected = {110, 150, 190};

        
        int[] actual = StudentGrade.totalRowArray(studentScores, studentsNumber);

       
        assertArrayEquals(expected, actual);
    }


    @Test
    public void testAverageRowArray() {
       
        int[][] studentScores = {{50, 60},  {70, 80},  {90, 100} };
        int studentsNumber = 3;
        int subjectsNumber = 2;

        
        double[] expected = {55.0, 75.0, 95.0};

        
        double[] actual = StudentGrade.averageRowArray(studentScores, studentsNumber, subjectsNumber);

         assertArrayEquals(expected, actual, 0.001);

    }

    @Test
    public void testPositionRowArray() {
        
       
        int[] totals = {110, 150, 190};
        int studentsNumber = 3;

        
       
        int[] expected = {1, 2, 3};

 int[] actual = StudentGrade.positionRowArray(totals, studentsNumber);


       
        assertArrayEquals(expected, actual);
    }
}
