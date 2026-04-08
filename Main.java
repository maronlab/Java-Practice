import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Todo List");
        System.out.println("=========================");
        System.out.println();

        ArrayList<String> task = new ArrayList<String>();

        Boolean flag = true;

        while (flag) {
            System.out.println("メニューを選んでください ");
            System.out.println("1.タスク追加\n2.タスク一覧\n3.タスク削除\n4.終了");
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            switch (index) {
                case 1:
                    addTask(task);
                    break;
                case 2:
                    viewTask(task);
                    break;
                case 3:
                    deleteTask(task);
                    break;
                case 4:
                    System.out.println("終了します");
                    flag = false;
                    break;
            }
        }
    }

    private static void addTask(ArrayList<String> task) {
        System.out.println("タスクを入力してください");
        Scanner addsc = new Scanner(System.in);
        String addTask = addsc.nextLine();
        task.add(addTask);
    }

    private static void viewTask(ArrayList<String> task) {
        System.out.println("タスクの一覧です");
        for (String s : task) {
            System.out.println(s);
        }
    }

    private static void deleteTask(ArrayList<String> task) {
        System.out.println("削除したいタスクを選んでください");
        for (int i = 0; i < task.size(); i++) {
            System.out.println(i + "." + task.get(i));
        }
        Scanner deletesc = new Scanner(System.in);
        int delete = deletesc.nextInt();
        task.remove(delete);
    }
}
