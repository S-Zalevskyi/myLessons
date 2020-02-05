package lesson3;

public class OperatorSwitch {

    final int VALUE = 2, firstValue = 1, seconfValue = 2, thirdValue = 3;
    /*Для того что бы использовать в свиче данную переменную нам нужно обьявить ее константой/постоянной, дописав
    * к типу слово final. Все названия постоянных пищуться с большой буквы*/

    public void setValueSwitch() {
            /*Оператор множественного типа
            * Работаем с константами примитивными типами byte int short char enum и их классами (Integer Short и т.д)
            * и оболочками + константа класса enum, ф так же строки String */
        switch (111) {
            case 25:
                System.out.println(25);
                break;
            case 73:
                System.out.println(73);
                break;
            case 48:
                System.out.println(48);
                break;
                /* оператор break используется для того что бы после выполнения совпавшего с условием кейса
                 не продолжались выполнятся последующие кейсы*/
            default:
                System.out.println("Not found");
                /*оператор default используется для того что бы в случае, если условие свича не выполняется выполнялось
                * какое-то действие по-дефолту как говорят, по-стандарту*/
        }

        switch (VALUE) {
            case firstValue:
                System.out.println(25);
                break;
            case seconfValue:
                System.out.println(73);
                break;
            case thirdValue:
                System.out.println(48);
                break;
            default:
                System.out.println("Not found");
                /*Строки в свчие не обязательно должны быть константой но и по понятным причинам не с целыми числами ра-
                * ботать тоже не будет.*/
        }
    }

}
