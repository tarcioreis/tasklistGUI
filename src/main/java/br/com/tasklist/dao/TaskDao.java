package br.com.tasklist.dao;

import br.com.tasklist.entity.Task;

import javax.persistence.EntityManager;

public class TaskDao {

    private EntityManager entityManager;

    public TaskDao() {}

    public TaskDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void saveTask(Task task) {
        this.entityManager.persist(task);
    }

    public Task getTask(Integer id) {
        return this.entityManager.find(Task.class, id);
    }

    public void updateTask(Task task) {
        this.entityManager.merge(task);
    }

    public void removeTask(Task task) {
        this.entityManager.remove(task);
    }


}
