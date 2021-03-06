public class EuropeanHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", Continent.EUROPE, getMonthlyEggCount());
    }

    @Override
    int getMonthlyEggCount() {
        return 10;
    }
}
