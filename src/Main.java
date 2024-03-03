import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Күндөргө enum түзүңүз (Monday, Tuesday ...)
         Консолдон бир күндү белгилеңиз. Эгер Monday болсо
         - анда "Дуйшөмбү куну жава окуйм" же Tuesday болсо -
         анда "Шейшемби күнү англис тили сабагын окуйм" деп күнгө
         жараша кайсы сабакты окуганыңызды консолго чыгарыңыз.
         Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.  **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name: ");
        String name = scanner.nextLine();
        Days[] days = {Days.valueOf(name)};
        for (Days day : days) {
            System.out.println(day);

        }


    }
}