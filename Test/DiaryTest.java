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

        @Test
        void deleteEntry(){
            String title = "My First Line of code";
            String body = "Hello World";
            user.createEntry(title, body);

            assertEquals(1, user.getDiarySize());

            user.deleteEntry(1);
            assertEquals(0, user.getDiarySize());
        }
        @Test
        void findEntryByCorrectId(){
            String title = "My First Line of code";
            String body = "Hello World";
            user.createEntry(title, body);

            assertEquals(1, user.getDiarySize());

            Entry foundEntry = user.findEntryById(1);
            assertNotNull(foundEntry);
            assertEquals("Hello World",foundEntry.getBody());
        }

        @Test
        void findEntryByWrongId(){
            Entry foundEntry = user.findEntryById(45);
            assertNull(foundEntry);
        }

        @Test
        void updateExistingEntry(){
            String title = "My First Line of code";
            String body = "Hello World";
            user.createEntry(title, body);

            assertEquals(1, user.getDiarySize());

            Entry foundEntry = user.findEntryById(1);
            assertNotNull(foundEntry);
            assertEquals("Hello World",foundEntry.getBody());

            String newBody = "I now write Java";
            user.updateEntry(1,null,newBody);

            Entry updatedEntry = user.findEntryById(1);
            assertNotNull(updatedEntry);
            assertEquals("I now write Java",updatedEntry.getBody());
            assertEquals("My First Line of code",updatedEntry.getTitle());
        }


    }