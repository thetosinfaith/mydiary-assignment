import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

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


    }













































    private static Diary diary;




















































        diary = new Diary("thetosinfaith","4040");

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