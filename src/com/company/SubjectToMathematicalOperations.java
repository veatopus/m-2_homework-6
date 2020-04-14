package com.company;

public interface SubjectToMathematicalOperations <T extends Number> {

   Double addUpTheNumbers(T firstT, T secondS);
   Double multiplyNumbers(T firstT, T secondS);
   Double subtractNumbers(T firstT, T secondS);
   Double divideTheNumbers(T firstT, T secondS);
}
