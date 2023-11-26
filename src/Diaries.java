import java.util.ArrayList;
import java.util.List;
public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

    public void add(String username, String password){
        Diary newDiary = new Diary(username, password);
        diaries.add(newDiary);
    }

    public Diary findByUsername (String username){
        Diary foundDiary = null;

        for (Diary diary : diaries){
            if(diary.getUsername().equals(username)){
                foundDiary = diary;
            }
        }
        if(foundDiary == null){
            System.out.println("Diary not found");
        }
        return foundDiary;
    }

    public void delete (String username, String password){
        Diary foundDiary = null;

        for (Diary diary : diaries){
            if(diary.getUsername().equals(username) && diary.getPassword().equals(password)){
                foundDiary = diary;
            }
        }
        diaries.remove(foundDiary);
        System.out.println("Diary deleted");


        if(foundDiary == null){
            System.out.println("Diary not found");

        }
    }
}