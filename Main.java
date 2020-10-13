/**
 *  Create a method that takes the grade and gives you the letter grade
 * @author Liana Bazzarella
 */
public class Main {

  // a method that takes the grade and gives you the letter grade using if statments
  public static void examGrade(int grade){
    if( grade < 50){
      System.out.println("F");
    } else if ( grade >= 50 && grade <= 59){
      System.out.println("D");
    } else if ( grade >= 60 && grade <= 69){
      System.out.println("C");
    } else if ( grade >= 70 && grade <= 79){
      System.out.println("B");
    } else if ( grade >= 80 && grade <= 100){
      System.out.println("A");
    }

  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // prints out the letter grade to the screen
    examGrade(71);
    

  }
}
