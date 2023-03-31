
public class Main{
    public static void main (String[] args){
        int countCoat = 70;
        int countHat =25;
        int countBusinessSuit =53;
        int countShirt =19;
        int countShoes =41;
        int countInventory =312;


        double adultsCoat = 0.77;
        double adultsHat =0.37;
        double adultsBusinessSuit =0.44;
        double adultsShirt =1;
        double adultsShoes =0.32;
        double result = countCoat * adultsCoat + countHat * adultsHat + countBusinessSuit * adultsBusinessSuit + countShirt * adultsShirt +countShoes * adultsShoes;
        double end = countInventory - result;
        if(end>0) {
            System.out.println("Хватит, остаток " + end);

           if (end < 0){

                System.out.println("Не хватит, нужно " + end);

            }
        }
    }
}
