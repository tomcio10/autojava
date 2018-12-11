package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorAppTest {

    @Test
    public void addTest() {
        CalculatorApp calc = new CalculatorApp();

        int suma = calc.add(1,2);

        Assertions.assertEquals(3,suma, "Sprawdź, że dodawanie liczb całkowitych działa");


    }

   @Test
   public void addTwoPositiveDoubles(){

    //arrange
    CalculatorApp calc = new CalculatorApp();

     //act
       double suma = calc.add(1.2,2.4);

      //assert
       Assertions.assertEquals(3.6, suma, 0.00000001, "Sprawdź, że dodawanie liczb zmiennoprzecinkowych działą");

    }

    @Test
    public void Divide(){
    //arrange
     CalculatorApp calc = new CalculatorApp();

    //act
      double division = calc.devide(4, 2);

    //assert
       Assertions.assertEquals(2, division, 0.00000001, "Sprawdź, że dzielenie liczb działa");
    }

}