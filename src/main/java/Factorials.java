public class Factorials {
    public static void main(String[] args) {
        System.out.println(factorialsMethod(5));
    }

    public static int factorialsMethod (int number){

        int fact = 1;
        for(int i = 1; i <= number; ++i){
            fact = fact * i;
        }

        return fact;
    }

}