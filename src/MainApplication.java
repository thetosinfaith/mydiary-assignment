public class MainApplication {
    private static Diary diary;

    public static void main(String[] args) {
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