public class Main {
    public static void main(String[] args) {
        Story story = new Story() {
            Pig pig;
            Owl owl;
            Bear bear;
            MailBox mailbox;
            TableCloth tablecloth;

            @Override
            public void start() {
                pig = new Pig();
                owl = new Owl();
                bear = new Bear();
                mailbox = new MailBox();
                tablecloth = new TableCloth();
            }

            @Override
            public void run() {
                tablecloth.stir();
                tablecloth.curlUp();
                tablecloth.rollOver();
                tablecloth.jump();
                tablecloth.putOut();
                tablecloth.rollAround();
                tablecloth.turnAround();
                bear.messAround();
                owl.appear();
                owl.turnAround();
                owl.look(bear);
                owl.flyUp();
                owl.delight();
                try {
                    pig.bowDown(bear);
                }
                catch (NothingException e) {
                    System.out.println(e.getMessage());
                }
                finally {
                    System.out.println(1);
                }
                owl.admire();
                mailbox.beWire();
                mailbox.beSlotAndInscription();
                try {
                    mailbox.inscription.beVisibilityInscription();
                }
                catch (NoInscriptionException e) {
                    System.out.println(e.getMessage());
                }
                finally {
                    System.out.println(1);
                }
                mailbox.inscription.beOutside();
                owl.flyDown();
                bear.haveHelpOut(owl, pig);
                bear.getOut();
                bear.lookAround();
                bear.sing();
            }
        };

        story.start();
        story.run();
    }
}
