package data.entity;

import javax.persistence.*;

/**
 * Created by dima on 29.03.16.
 */
@Entity(name = "Topic")
@Table(name = "topics")
public class Topic{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
