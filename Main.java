public class Main {
    public static void main(String[] args) {

        int ticketSell = 2000;
        if (ticketSell < 19) {
            ticketSell = 0;
        }
        int bonusmilles = (ticketSell / 20);
        System.out.println(bonusmilles);
    }
}
