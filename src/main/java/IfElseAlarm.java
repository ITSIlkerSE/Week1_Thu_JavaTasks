public class IfElseAlarm {

    public static void main(String[] args) {
        System.out.println(IfOver30(Integer.parseInt("30")));
    }

    public static String IfOver30(int count){

        if (count < 30){
            return "Maximale Personenzahl nicht überschritten";

        } else
        if(count >= 30){
            return "Zu viele Personen";
        }
        return String.valueOf(count);
    }




}