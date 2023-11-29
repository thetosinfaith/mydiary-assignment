import java.util.Scanner;

public class MainApplication {
    private static Diary diary;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("""
                Welcome to diary app! Start by introducing yourself. Happy journaling!
                
                1  ->  Create Diary
                2  ->  Unlock Diary
                3  ->  Find Entry by Id
                4  ->  Add Entry
                5  ->  Delete Entry
                6  ->  Update Entry
                7  ->  Lock Diary
                """);

        char userInput = 'A';

        switch (userInput){
            case '1' -> {
                System.out.print("Choose a username for your new account: ");
                String username = input.nextLine();

                System.out.print("Now, let's set up a password. For security, choose a secure password with letters, numbers, and special characters: ");
                String password = input.nextLine();

                diary = new Diary("thetosinfaith","4040");

                break;
            }

            switch (userInput){
                case '2' ->{
                    System.out.print("Sure, to unlock, what's your diary password? ");
                    String password = input.nextLine();

                    diary.unlockDiary("4040");

                    break;
                }


                "And could you enter your account's password to unlock it?"




                System.out.println("Please provide your username and password to access your account.");

                diary = new Diary("thetosinfaith","4040");
            }


        }













































    private static Diary diary;





















































        diary.unlockDiary("4040");

        System.out.println("Create a new diary entry: ");

        String title = "Enter title: ";
        String body = "Enter body: ";

        diary.createEntry(title, body);

        System.out.println("Enter entry ID to find: ");
        Entry foundEntry = diary.findEntryById(0);

        System.out.println(foundEntry.getBody());

        System.out.println("""
                Entry found:
                Title: [Title of the Found Entry]
                Body: [Body Content of the Found Entry]
                """);

    }

}