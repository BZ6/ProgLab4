public class Pig extends AnimalAbstract implements PigInterface {
    private boolean isHelp;

    public Pig() {
        isHelp = true;
        name = "Пятачок";
        location = LocationEnum.INHOUSE;
        System.out.println("Свин с именем " + name + " создан.");

    }

    @Override
    public boolean getHelp() {
        return isHelp;
    }

    @Override
    public void bowDown(Bear bear) {
        if (bear == null)
            throw new NothingException("Exception: bear is null!");
        if (bear.getCall())
            System.out.println(name + " склонился над " + bear.getName() + "ом.");
    }
}
