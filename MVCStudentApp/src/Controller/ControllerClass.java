package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Core.Student;

/**
 * Класс контроллер. Принимает экземпляры интерфейсов iGetModel и iGetView
 */
public class ControllerClass {

    private List<iGetModel> models = new ArrayList<>();
    private iGetView view;

    Scanner scanner = new Scanner(System.in);

    /**
     * Конструктор. Выодит сообщение с запросом выбора языка, далее устанавливает
     * выбранный пользователем язык
     * 
     * @param viewList принимает лист экземпляров View на разных языках
     */
    public ControllerClass(List<iGetView> viewList) {
        int userInput;
        boolean flag = true;
        do {
            System.out.println("\u001B[33mВыберите язык / Choose language\u001B[0m\n 1 - русский / 2 - english");
            userInput = scanner.nextInt();

            if (userInput == 1) {
                this.view = viewList.get(0);
                flag = false;
            } else if (userInput == 2) {
                this.view = viewList.get(1);
                flag = false;
            } else {
                System.out.println("\u001B[31mВы ввели некорректные данные / You entered incorrect data\u001B[0m");

            }
        } while (flag);
    }

    /**
     * Метод проверяет есть ли студенты в списке
     * 
     * @param studs принимает список студентов
     * @return возвращает булево
     */
    private boolean testData(List<Student> studs) {
        if (studs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Добавляет екземпляр iGetModel к списку models
     * 
     * @param model екземпляр iGetModel
     */
    public void add(iGetModel model) {
        this.models.add(model);
    }

    /**
     * Метод, который запускает всю логику работы класса
     */
    public void run() {

        Command com = Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.prompt(view.getLanguage().get("msgInputCommand"));
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println(view.getLanguage().get("msgExit"));
                    break;
                case LIST:
                    for (int i = 0; i < models.size(); i++) {
                        System.out.println(view.getLanguage().get("msgModel") + "\u001B[32m №" + (i + 1) + "\u001B[0m");
                        if (testData(models.get(i).getStudents())) {
                            view.printAllStudent(models.get(i).getStudents());
                        } else {
                            System.out.println(view.getLanguage().get("msgListIsEmpty"));
                        }
                    }
                    break;

                case DELETE:
                    System.out.println(view.getLanguage().get("msgSelectStudentToDelete"));
                    int userInput = scanner.nextInt();
                    boolean onTheList = false;
                    for (int i = 0; i < models.size(); i++) {
                        for (int j = 0; j < models.get(i).getStudents().size(); j++) {
                            if (models.get(i).getStudents().get(j).getId() == userInput) {
                                System.out.println(
                                        models.get(i).getStudents().get(j).toString()
                                                + view.getLanguage().get("msgDeleted"));
                                models.get(i).removeStudent(j);
                                onTheList = true;
                            }
                        }
                    }
                    if (!onTheList) {
                        System.out.println(view.getLanguage().get("msgIsNotInTheList"));
                    }
                default:
                    break;
            }
        }
    }
}
