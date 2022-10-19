package test.service;

import Repository.TodolistRepositoryImpl;
import entity.Todolist;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {

    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist() {
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistRepository.data[0] = new Todolist("Satu");
        todolistRepository.data[1] = new Todolist("Dua");
        todolistRepository.data[2] = new Todolist("Tiga");

        todolistService.showTodolist();
    }

    public static void testAddTodolist() {
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolisst("Satu");
        todolistService.addTodolisst("Dua");
        todolistService.addTodolisst("Tiga");

        todolistService.showTodolist();
    }

    public static void testRemoveTodolist() {
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolisst("Satu");
        todolistService.addTodolisst("Dua");
        todolistService.addTodolisst("Tiga");

        todolistService.showTodolist();
        todolistService.removeTodolist(4);
        todolistService.showTodolist();
        todolistService.removeTodolist(2);
        todolistService.showTodolist();
        todolistService.removeTodolist(2);
        todolistService.showTodolist();
        todolistService.removeTodolist(2);
        todolistService.showTodolist();
        todolistService.removeTodolist(1);
        todolistService.showTodolist();
    }

}
