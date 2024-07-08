public class TableCloth implements TableClothInterface {
    private LocationEnum location;

    public TableCloth() {
        location = LocationEnum.INCORNER;
        System.out.println("Скатерть создана.");
    }

    @Override
    public void turnAround() {
        System.out.println("Скатерть развернулась.");
    }

    @Override
    public void curlUp() {
        System.out.println("Скатерть свернулась в клубок.");
    }

    @Override
    public void jump() {
        System.out.println("Скатерть подскочила несколько раз.");
    }

    @Override
    public void putOut() {
        System.out.println("Скатерть выставила наружу уши.");
    }

    @Override
    public void stir() {
        if (location == LocationEnum.INCORNER)
            System.out.println("В угду зашевелилась скатерть.");
        else
            System.out.println("Где-то зашевелилась скатерть.");
    }

    @Override
    public void rollAround() {
        System.out.println("Скатерть вновь прокатилась по комнате.");
    }

    @Override
    public void rollOver() {
        System.out.println("Скатерть перекатилась через всю комнату.");
    }
}