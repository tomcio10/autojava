package kalkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorAppTest {

    @Test
    public void addTest() {
        KalkulatorApp kalkulatorek = new KalkulatorApp();

        int suma = kalkulatorek.add(1,2);

        Assertions.assertEquals(3,suma, "Sprawdź, że dodawanie liczb całkowitych działa");


    }

   @Test
   public void addTwoPositiveDoubles(){

    //arrange
    KalkulatorApp kalkulatorek = new KalkulatorApp();

     //act
       double suma = kalkulatorek.add(1.2,2.4);

      //assert
       Assertions.assertEquals(3.6, suma, 0.00000001, "Sprawdź, że dodawanie liczb zmiennoprzecinkowych działą");

    }

    @Test
    public void Divide(){
    //arrange
     KalkulatorApp kalkulatorek = new KalkulatorApp();

    //act
      double division = kalkulatorek.devide(4, 2);

    //assert
       Assertions.assertEquals(2, division, 0.00000001, "Sprawdź, że dzielenie liczb działa");
    }

}