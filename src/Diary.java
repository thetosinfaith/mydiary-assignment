import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String userName;
    private String passWord;
    private boolean isLocked;
    private List<Entry> DearDiary = new ArrayList<>();

    private int entryId = 0;

    public Diary(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public boolean IsLocked() {
        return isLocked;
    }

    public void lockDiary() {
        isLocked = true;
        System.out.println("Diary is locked!");
    }

    public void unlockDiary(String passWord) {
        if (passWord == this.passWord) {
            isLocked = false;
            System.out.println("Diary is unlocked!");

        }
    }
    public void createEntry(String title, String body) {
        Entry entry = new Entry(0, title, body);
        DearDiary.add(entry);
        System.out.println("Entry Created Successfully");
    }

    public  int getDiarySize(){

        return DearDiary.size();
    }
}
