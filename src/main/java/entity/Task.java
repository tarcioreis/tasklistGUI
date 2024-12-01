package entity;

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
    private LocalDateTime creationTime;

    @Column(name = "conclusion_time")
    private LocalDateTime conclusionTime;

    private Boolean status;

    public Task() {
    }

    
}
