public class Owl extends AnimalAbstract implements OwlInterface {
    private boolean isHelp;

    public Owl() {
        isHelp = true;
        name = "Сова";
        location = LocationEnum.INHOUSE;
        System.out.println("Сова с именем " + name + " создана.");
    }

    @Override
    public void admire() {
        System.out.println(name + " залюбовалась своим почтовым ящиком.");
    }

    @Override
    public void flyDown() {
        System.out.println(name + " слетела вниз.");
    }

    @Override
    public boolean getHelp() {
        return isHelp;
    }

    @Override
    public void appear() {
        System.out.println(name + " появилась среди гостей.");
    }

    @Override
    public void delight() {
        System.out.println(name + " любуется своим новым потолком.");
    }

    @Override
    public void flyUp() {
        System.out.println(name + " взлетела.");
    }

    @Override
    public void turnAround() {
        System.out.println(name + " повернулась на голос Винни-Пуха.");
    }

    @Override
    public void look(Bear bear) {
        if (bear.getPartVisibility())
            System.out.println(name + " посмотрела на видимую часть " + bear.getName()+  "а.");
    }

}
