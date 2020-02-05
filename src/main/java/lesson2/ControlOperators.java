package lesson2;

public class ControlOperators {

    int apples = 5;
    int pinApples = 9;

    public void ifElse () {

        if (apples > pinApples) {

            System.out.println("True");
        }
        if (pinApples>apples) {

            System.out.println("False");
        }   /*Обычная петля if*/


 /*       if (apples > pinApples) {
            System.out.println("True");
        } else {
            System.out.println("False");
        } улучшенный вариант того что написано выше при помощи петли if else*/

        /*Пример №2_В условие петли можно ставить не только булиновское выражение <>-+ и т.д но и переменную типа булин */

        boolean wegeTwo = apples > pinApples;

        if (wegeTwo) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
