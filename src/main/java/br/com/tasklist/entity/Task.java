package br.com.tasklist.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String description;
    private String Title;

    @Column(name = "creation_time")
    private LocalDateTime creationTime = LocalDateTime.now();

    @Column(name = "conclusion_time")
    private LocalDateTime conclusionTime;

    private Boolean status = false;

    public Task() {
    }

    public Task(String description, String title) {
        this.description = description;
        Title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getConclusionTime() {
        return conclusionTime;
    }

    public void setConclusionTime(LocalDateTime conclusionTime) {
        this.conclusionTime = conclusionTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", Title='" + Title + '\'' +
                ", creationTime=" + creationTime +
                ", conclusionTime=" + conclusionTime +
                ", status=" + status +
                '}';
    }
}
