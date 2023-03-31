import myList.add;
import myList.get;

    public class Main {
        public static void main(String[] args, int size, int get, int add) {

            double countTelescope = 14000;
            double countInventory = 1000;
            double countScholarship = 2500;
            double prosentBank = 5;
            double prosentMounth = 5.0 / 12.0;
            double countMounth = 0;
            double myList;


            while (countTelescope < countScholarship) ;

            {
                System.out.println("На счету находится" + countInventory + "монет");
                countInventory += countScholarship + (countInventory * prosentMounth / 100);
                double countMount;

                new add(countInventory);
            }
            System.out.println("Количество месяцев потребовалось " + countMounth);
            System.out.println("Количество средств на момент покупки телескопа " + countInventory);

            // System.out.println("Динамика изменений по месяцам "+ myList);


            for (int i = 0;
                 i < size; )
                ;
            double i = 1;
            System.out.println("Сумма в " + i + " месяц равна" + new get(i));
        }


    }
