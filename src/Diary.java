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
        int id = getEntryId();
        Entry entry = new Entry(id, title, body);
        DearDiary.add(entry);
        System.out.println("Entry Created Successfully");
    }

    public Entry findEntryById(int id){
        Entry foundEntry = null;
        for (Entry entry : DearDiary) {
            if (entry.getId() == id) {
                foundEntry = entry;
                System.out.println("Entry "+entry.getId()+" found");
            }
        }
        if(foundEntry == null){
            System.out.println("Entry not found");
        }
        return foundEntry;
    }

    public void updateEntry(int id, String title, String body){
        Entry foundEntry = findEntryById(id);

        if(title != null && foundEntry != null){
            foundEntry.setTitle(title);
        }
        if(body != null && foundEntry != null){
            foundEntry.setBody(body);
        }

        int listPosition = id - 1;
        DearDiary.set(listPosition, foundEntry);
    }

    public void deleteEntry(int id) {
        Entry foundEntry = findEntryById(id);
        DearDiary.remove(foundEntry);
        System.out.println("Entry deleted successfully");
    }
    public String getUsername() {
        return userName;

    }

    public String getPassword() {
        return passWord;
    }

        public int getDiarySize() {
        return DearDiary.size();
    }

    public int getEntryId() {
        return entryId++;
    }




}




