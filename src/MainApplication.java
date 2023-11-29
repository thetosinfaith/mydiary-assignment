import java.util.Scanner;
public class MainApplication {
    private static Diary diary;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("""
                Welcome to diary app! Start by introducing yourself. Happy journaling!
                                
                1  ->  Create Diary
                2  ->  Lock Diary
                3  ->  Unlock Diary
                4  ->  Add Entry
                5  ->  Find Entry by Id
                6  ->  Delete Entry
                7  ->  Update Entry
                """);
        char userInput = input.next().charAt(0);
        switch (userInput) {
            case '1':
                System.out.print("""
                        1  ->  Create Diary
                                                
                        Choose a username for your new account:
                        """);
                String username = input.nextLine();

                System.out.print("Now, let's set up a password. For security, choose a secure password with letters, numbers, and special characters: ");
                String password = input.nextLine();

                diary = new Diary("thetosinfaith", "4040");

                break;
            }
             case '2' -> {
                    System.out.print("""
                            2  ->  Unlock Diary

                            Sure, to unlock, what's your diary password?          
                            """);
                    String password = input.nextLine();

                    diary.unlockDiary("4040");

                    break;
                }

                default -> {

                    int password = 4040;

                    if (userInput != password) {
                        throw new IllegalStateException("Incorrect Password! " + userInput);

                    }

                    switch (userInput) {
                        case '3' -> {

                            System.out.print("""
                                    3  ->  Create a new diary entry
                                                                                                                            
                                    Enter title:
                                    """);
                            String title = input.nextLine();

                            System.out.print("Enter body: ");
                            String body = input.nextLine();

                            diary.createEntry(title, body);
                            break;

                        }

                        switch (userInput) {
                            case '4' -> {

                                System.out.print("""
                                        4  ->  Enter entry ID to find:
                                        """);
                                String entry = input.nextLine();

                                System.out.println("""
                                        Entry found:
                                        Title: [Title of the Found Entry]
                                        Body: [Body Content of the Found Entry]
                                        """);
                                Entry foundEntry = diary.findEntryById(0);
                                break;
                            }

                            switch (userInput) {
                                case '5' -> {

                                    System.out.print("""
                                            5  ->  Enter entry ID to find:
                                            """);
                                    String entry = input.nextLine();

                                    System.out.println("""
                                            Entry found:
                                            Title: [Title of the Found Entry]
                                            Body: [Body Content of the Found Entry]
                                            """);
                                    Entry foundEntry = diary.findEntryById(0);
                                    break;

                                }


//
//                    System.out.println(foundEntry.getBody());
//
//                    System.out.println("""
//                    Entry found:
//                    Title: [Title of the Found Entry]
//                    Body: [Body Content of the Found Entry]
//                    """);


                            }

