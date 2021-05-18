public class Main {
    public static void main(String[] args) {

        int mile = 1; // бонус в милях
        double ticketPrice = 24323.32; // стоимость билета в рублях
        int cashBonus = 20; // сумма за которые начисляются мили в рублях
        double totalMiles = (int) ((ticketPrice / cashBonus) * mile); // всего милей от стоимости билета
        System.out.println("Total miles: " + totalMiles);

    }
}
