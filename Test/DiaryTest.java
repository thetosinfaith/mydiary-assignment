import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary user = new Diary("thetosinfaith", "29652628292");

    @Test
    public void dairyIsLocked(){
        boolean status = user.IsLocked();
        assertFalse(status, "This Diary is Locked.");
    }

    @Test
    public void lockDiary(){
        user.lockDiary();
        assertTrue(user.IsLocked());
    }

        @Test
         public void userCanUnlockDiary(){
             user.unlockDiary("29652628292");
             assertFalse(user.IsLocked());

    }

          @Test
          public void createEntry(){
            user.createEntry("juno", "is an hostel");
            assertEquals(1, user.getDiarySize());

            }

            @
}