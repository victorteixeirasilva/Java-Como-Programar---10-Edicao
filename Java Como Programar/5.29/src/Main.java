/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 5.29 (A canção “The Twelve Days of Christmas”) Escreva um aplicativo que utiliza instruções de repetição
 *              e switch para imprimir a canção “The Twelve Days of Christmas”. Uma instrução switch deve ser utilizada
 *              para imprimir o dia (”primeiro”, “segundo” etc). Uma instrução switch separada deve ser utilizada para
 *              imprimir o restante de cada verso. Visite o site en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_(song)
 *              para obter a letra da música.
 */
public class Main {
    public static void main(String[] args) {

        String[] days = {
                "first", "second", "third", "fourth", "fifth", "sixth",
                "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
        };

        String[] gifts = {
                "a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens",
                "four Calling Birds", "five Gold Rings", "six Geese a-Laying",
                "seven Swans a-Swimming", "eight Maids a-Milking", "nine Ladies Dancing",
                "ten Lords a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"
        };

        for (int i = 0; i < 12; i++) {
            System.out.print("On the " + days[i] + " day of Christmas, my true love gave to me: ");

            switch (i) {
                case 0:
                    System.out.println(gifts[0] + ".");
                    break;
                case 1:
                    System.out.println(gifts[1] + " and " + gifts[0].substring(2) + "."); // Remove o "a "
                    break;
                default:
                    for (int j = i; j > 0; j--) {
                        System.out.print(gifts[j] + ", ");
                    }
                    System.out.println("and " + gifts[0].substring(2) + "."); // Remove o "a "
                    break;
            }
        }

    }
}