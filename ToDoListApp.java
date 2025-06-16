package priya;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<String>();
		while(true) {
			System.out.println("Simple To-Do-List_App");
			System.out.println("1.Add a Task");
			System.out.println("2.View a Task");
			System.out.println("3.Delete a Task");
			System.out.println("4.Exit");
			System.out.println("Choose an option(1-4)");
			int choice =sc.nextInt();
			sc.nextLine();
			if(choice==1) {
				System.out.println("Enter Your Task");
				String task=sc.nextLine();
				tasks.add(task);
				System.out.println("Task Added Successfully");
			} else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks available.");
                } else {
                    System.out.println("Your Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + " " + tasks.get(i));
                    }
                }
            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to delete.");
                } else {
                    System.out.println("Enter the task number to delete:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    int taskNumber = sc.nextInt();
                    sc.nextLine();
                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Task deleted successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Please choose a Valid Option.");
            }
		}
		sc.close();
	}

}