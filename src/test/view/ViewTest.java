package test.view;

import Repository.TodolistRepository;
import Repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

public class ViewTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolisst("Satu");
        todolistService.addTodolisst("Dua");
        todolistService.addTodolisst("Tiga");

        todolistView.showTodolist();
    }

    public static void testAddTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.addTodolist();
        todolistService.showTodolist();
    }

    public static void testRemoveTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolisst("Satu");
        todolistService.addTodolisst("Dua");
        todolistService.addTodolisst("Tiga");

        todolistService.showTodolist();
        todolistView.removeTodolist();
        todolistService.showTodolist();
    }
}
