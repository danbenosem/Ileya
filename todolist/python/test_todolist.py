import unittest


from todolist import *

class TestTodoList(unittest.TestCase):

    
    def test_to_Check_That_Add_Task_Method_Works(self):
        title_Task = "sleeping"
        description_Task= "to sleep"
        id_number=1
        size_Before_Start= len(todoListTitles)
        addTask(title_Task, description_Task, id_number)
        expected_size=  size_Before_Start + 1
        actual_size = len(todoListTitles)
        self.assertEqual(expected_size,actual_size)



   


    def test_to_check_that_remove_task_method_works(self):


        title_task = "drinking";
        description_task= "to drink";
        id_number=2;
        size_before_start= len(todoListTitles);
        addTask(title_task,  description_task,  id_number);

        removeTask( id_number);

        expected_size =   size_before_start;
        actual_size = len(todoListTitles);

        self.assertEqual(expected_size,actual_size);





      
    def test_to_check_that_adding_multiple_tasks_increases_the_length(self):
    
        title_task1 = "studying";
        description_task1 = "java coding";
        id_number1 = 3;

        size_before_start=  len(todoListTitles);


        addTask( title_task1, description_task1, id_number1);

        title_task2 = "cooking";
        description_task2 = "making dinner";
        id_number2 = 4;
        addTask(title_task2,  description_task2, id_number2);

        expected_size = size_before_start + 2;
        actual_size = len(todoListTitles);

        self.assertEqual(expected_size,actual_size);





    

  


