public class Main {

  public static void main(String[] args) {

    // year to be checked
    int year = 1900;
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
           }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;


  java code-1 =========


public class SumNatural {

    public static void main(String[] args) {

        int num = 100, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

java code-2 =====================
