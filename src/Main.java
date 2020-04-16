import view.CommandPro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //this might should be in a loop
        String command = scanner.nextLine();

        CommandPro.recognizeCommand(command);
    }
}
