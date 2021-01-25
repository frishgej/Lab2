class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int mmTotal = 55 * 11;
    double mmBlue = .24 * mmTotal;
    double mmBrown = .13 * mmTotal;
    double mmGreen = .16 * mmTotal;
    double mmOrange = .20 * mmTotal;
    double mmRed = .13 * mmTotal;
    double mmYellow = .14 * mmTotal;

    System.out.println("Blue: " + mmBlue);
    System.out.println("Brown: " + mmBrown);
    System.out.println("Green: " + mmGreen);
    System.out.println("Orange: " + mmOrange);
    System.out.println("Red: " + mmRed);
    System.out.println("Yellow: " + mmYellow);
    
    double mmSum = mmBlue + mmBrown + mmGreen + mmOrange + mmRed + mmYellow;
    System.out.println("Sum: " + mmSum);

    if (mmBlue > mmBrown && mmRed > mmOrange) {
      System.out.println("Blue over Brown and Red over Orange");
    }

    if (mmBrown <= mmGreen) {
      System.out.println("Brown is less than or equal to Green");
    }

    if (mmSum == mmTotal) {
      System.out.println("Numbers match");
    }
  }
}