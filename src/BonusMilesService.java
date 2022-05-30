public class BonusMilesService {
    public int calculate(int priseTicket) {
        int bonusPrice = 20; // стоимость одной мили
        int numberOfMiles = priseTicket / bonusPrice; // количество милей
        return numberOfMiles;
    }
}
