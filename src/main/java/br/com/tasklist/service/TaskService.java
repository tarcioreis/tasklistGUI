package br.com.tasklist.service;

import br.com.tasklist.JPAUtil.EntityManagerGenerator;
import br.com.tasklist.dao.TaskDao;
import br.com.tasklist.entity.Task;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TaskService {

    public static void main(String[] args) {

        EntityManager entityManager = EntityManagerGenerator.getEntityManagerTasklist();

        // Transient state
        Task task1 = new Task("description for the first task",
                "my first task :)", LocalDate.of(2024, 12, 04));

        // Managed state
        TaskDao taskDao = new TaskDao(entityManager);
        entityManager.getTransaction().begin();
        taskDao.saveTask(task1);
        entityManager.getTransaction().commit();

        // Detached state

        System.out.println(taskDao.getTask(1));
        entityManager.close();
    }
}
