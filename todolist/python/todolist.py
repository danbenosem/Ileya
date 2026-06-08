
todoListTitles = []

todoListDescriptions = []

todoListUniqueId = []

todoListCompletionStatus = []

def addTask(titleTask, descriptionTask, idNumber):
    todoListTitles.append(titleTask)

    todoListDescriptions.append(descriptionTask)
    todoListUniqueId.append(idNumber)

    todoListCompletionStatus.append("incomplete task")

    return "Task added successfully"

def viewTask():
    if len(todoListTitles) == 0:
        print("No tasks to display.")
        print("")
        return

    
    for index in range(len(todoListTitles)):
        print("The unique id is: " + str(todoListUniqueId[index]))

        print("The title is: " + todoListTitles[index])
        print("The description is: " + todoListDescriptions[index])
        print("The completion status: " + todoListCompletionStatus[index])
        print("")

def completeTask(idNumber, completeTag):
   
    if idNumber in todoListUniqueId:
        index = todoListUniqueId.index(idNumber)
        todoListCompletionStatus[index]=completeTag
      
        return "Marked as complete!"

    return "Not marked as complete"

def removeTask(idNumber):
    if idNumber in todoListUniqueId:
        index = todoListUniqueId.index(idNumber)
        
        todoListTitles.pop(index)
        todoListUniqueId.pop(index)
        todoListDescriptions.pop(index)
        todoListCompletionStatus.pop(index)
        
        return "Deleted successfully"

    return "Not removed"

def main():
    count = 0

    while True:
        print("")
        print("Welcome to the TodoList!")
        print("1. Add Task")
        print("2. View Task")
        print("3. Complete Task")
        print("4. Delete Task")
        print("")
        
        choice = input("Enter operation: ")

        if choice == "1":
            print("")
            while True:
                titleTask = input("Enter the title of the task: ")
                descriptionTask = input("Enter the description: ")

                count += 1
                idNumber = count
                
                print("")
                print(addTask(titleTask, descriptionTask, idNumber))
                print("")

                answer = input("Do you want to enter another task (yes/no): ")
                
                if answer.lower() == "no":
                    break
                print("")

        elif choice == "2":
            print("")
            viewTask()

        elif choice == "3":
            print("")
            completeTag = "complete"

           
            uniqueId = int(input("Enter the unique id to mark completed task: "))

            print("")
            print(completeTask(uniqueId, completeTag))

        elif choice == "4":
            print("")
            uniqueId = int(input("Enter the unique id to delete task: "))

            print("")
            print(removeTask(uniqueId))


main();


