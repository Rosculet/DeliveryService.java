public class Sender implements MailDeliveryService{

    int i;

    public Sender(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void sendMail() {
        switch (i) {
            case 1: new DHL().sendMail(); break;
            case 2: new Email().sendMail(); break;
            case 3: new Pigeon().sendMail(); break;
        }
    }
}
