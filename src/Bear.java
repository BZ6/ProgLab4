public class Bear extends AnimalAbstract implements BearInterface {
    private boolean
            isCall,
            isPartVisibility;

    public Bear() {
        isCall = true;
        isPartVisibility = true;
        name = "Винни-Пух";
        location = LocationEnum.UNDERARMCHAIR;
        System.out.println("Медведь с именем " + name + " создан.");
    }

    @Override
    public boolean getCall() {
        return isCall;
    }

    @Override
    public boolean getPartVisibility() {
        return isPartVisibility;
    }

    @Override
    public void getOut() {
        System.out.println(name + " наконец освободился.");
    }

    @Override
    public void haveHelpOut(Owl owl, Pig pig) {
        if (owl.getHelp() && pig.getHelp())
            System.out.println(owl.getName() + " и " + pig.getName() + " помогли выбраться " + name + "у.");
    }

    @Override
    public void lookAround() {
        System.out.println(name + " смог оглядеться.");
    }

    @Override
    public void messAround() {
        if (location == LocationEnum.UNDERARMCHAIR)
            System.out.println("Под креслом со столом " + name + " начал возиться.");
    }

    @Override
    public void sing() {
        class Song {
            private final String title;
            private final String text;

            Song() {
                title = "Пыхтелка";
                text = """
                        Я стоял на носу
                        И держал на весу
                        Задние лапки и всё остальное…
                        Цирковой акробат
                        Был бы этому рад,
                        Но Медведь – это дело иное!
                        И потом я свалился,
                        А сам притворился,
                        Как будто решил отдохнуть среди дня.
                        И, лёжа на пузе,
                        Я вспомнил о Музе,
                        Но она позабыла Поэта (меня).
                        Что делать!…
                        Уж если,
                        Устроившись в кресле,
                        И то не всегда мы владеем стихом, —
                        Что же может вам спеть
                        Несчастный Медведь,
                        На которого Кресло уселось верхом!""";
            }

            String getTitle() {
                return title;
            }

            String getText() {
                return text;
            }
        }

        Song song = new Song();

        System.out.println(name + " запел песню с названием " + song.getTitle() + ".");
        System.out.println(song.getText());
    }
}
