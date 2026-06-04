import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class TodoListTest{




 @Test
    public void testToCheckThatAddTaskMethodWorks(){


   String titleTask = "sleeping";
   String descriptionTask= "to sleep";
   int idNumber=1;
   int sizeBeforeStart=  TodoList.todoListTitles.size();

   TodoList.addTask(titleTask,  descriptionTask,  idNumber);

   int expectedSize = sizeBeforeStart + 1;
   int actualSize = TodoList.todoListTitles.size();


  assertEquals(expectedSize,actualSize);

    }

@Test


  public void testToCheckThatRemoveTaskMethodWorks(){


   String titleTask = "drinking";
   String descriptionTask= "to drink";
   int idNumber=2;
    int sizeBeforeStart=  TodoList.todoListTitles.size();
   TodoList.addTask(titleTask,  descriptionTask,  idNumber);

 TodoList.removeTask( idNumber);

   int expectedSize =    sizeBeforeStart;
   int actualSize = TodoList.todoListTitles.size();

 assertEquals(expectedSize,actualSize);



    }






  @Test
public void testToCheckThatAddingMultipleTasksIncreasesTheSize(){
    
    String titleTask1 = "studying";
    String descriptionTask1 = "java coding";
    int idNumber1 = 3;

    int sizeBeforeStart=  TodoList.todoListTitles.size();


    TodoList.addTask(titleTask1, descriptionTask1, idNumber1);

    String titleTask2 = "cooking";
    String descriptionTask2 = "making dinner";
    int idNumber2 = 4;
    TodoList.addTask(titleTask2, descriptionTask2, idNumber2);

    int expectedSize = sizeBeforeStart + 2;
    int actualSize = TodoList.todoListTitles.size();

    assertEquals(expectedSize, actualSize);
}




@Test
public void testToCheckThatRemovingIdThatIsNotCorrectDoesNotChangeSize(){

    String titleTask = "working out";
    String descriptionTask = "go to gym";
    int idNumber = 5;
    TodoList.addTask(titleTask, descriptionTask, idNumber);

    int sizeBeforeDelete = TodoList.todoListTitles.size();

    TodoList.removeTask(999); 

    int expectedSize = sizeBeforeDelete;
    int actualSize = TodoList.todoListTitles.size();

    assertEquals(expectedSize, actualSize);
}











}
