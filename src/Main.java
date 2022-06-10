import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender(setOption(scanner.nextInt()));
        sender.sendMail();



    }

    public static int setOption (int i){
        if (3 < i || i < 0) {
            System.out.println("Error: Enter a number in the range between 1 and 3");
            return 0;
        }
        else return i;
    }

}
