public class MailBox implements MailBoxInterface {
    private boolean
        isWire,
        isHaveSlot,
        isHaveInscription,
        isVisibilityInscription;
    public Inscription inscription;

    public MailBox() {
        isWire = true;
        isHaveSlot = true;
        isHaveInscription = true;
        isVisibilityInscription = false;
        inscription = new Inscription();
        System.out.println("Почтовый ящик создан.");
    }

    public void beWire() {
        if (isWire)
            System.out.println("Почтовый ящик был проволочный.");
        else
            System.out.println("Почтовый ящик был непроволочный.");
    }

    public void beSlotAndInscription() {
        if (Slot.location == LocationEnum.INDOOR)
            if (isHaveSlot)
                if (isHaveInscription)
                    System.out.println("В двери была щель с надписью '" + inscription.value + "'.");
                else
                    System.out.println("В двери была щель.");
            else
                System.out.println("В двери не было ничего.");
        else
            if (isHaveSlot)
                if (isHaveInscription)
                    System.out.println("Где-то была щель с надписью '" + inscription.value + "'.");
                else
                    System.out.println("Где-то была щель.");
    }

    public class Inscription {
        protected LocationEnum location;
        protected String value;

        public Inscription() {
            location = LocationEnum.OUTSIDE;
            value = "Для писем и газет";
        }

        public void beVisibilityInscription() throws NoInscriptionException {
            if (isHaveInscription)
                if (!isVisibilityInscription)
                    System.out.print("Надпись не было видно, ");
                else
                    System.out.print("Надпись было видно, ");
            else
                throw new NoInscriptionException("Exception: Inscription does not exist");
        }

        public void beOutside() {
            if (isHaveInscription)
                if (!isVisibilityInscription)
                    if (location == LocationEnum.OUTSIDE)
                        System.out.println("потому что она была снаружи.");
                    else
                        System.out.println("потому что она была неизвестно где.");
                else if (location == LocationEnum.INHOUSE)
                    System.out.println("потому что она была внутри.");
        }
    }

    private static class Slot {
        protected static LocationEnum location;

        public Slot() {
            location = LocationEnum.INDOOR;
        }
    }
}
