public class MainApplication {
    private static Diary diary;

    public static void main(String[] args) {
        diary = new Diary("thetosinfaith","4040");

        diary.unlockDiary("4040");

        String title = "Introduction to Programming";
        String body = "Welcome to Java 101";

        diary.createEntry(title, body);

        Entry foundEntry = diary.findEntryById(0);

        System.out.println(foundEntry.getBody());

    }

}