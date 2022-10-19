package service;

import Repository.TodolistRepository;
import entity.Todolist;

public class TodolistServiceImpl implements TodolistService {

    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodolist() {
        Todolist[] model = todolistRepository.getAll();

        for (var i = 0; i < model.length; i++) {
            var todolist = model[i];
            var no = i + 1;

            if (todolist == null) {
                break;
            }
            System.out.println(no + ". " + todolist.getTodo());
        }
    }

    @Override
    public void addTodolisst(String todo) {
        Todolist todolist = new Todolist(todo);
        todolistRepository.add(todolist);
        System.out.println("[#] SUKSES MENAMBAH TODO");
    }

    @Override
    public void removeTodolist(Integer number) {
        boolean success = todolistRepository.remove(number);

        if (success) {
            System.out.println("[#] SUKSES MENGHAPUS TODO");
        } else {
            System.out.println("[!] GAGAL MENGHAPUS TODO");
        }
    }
}
