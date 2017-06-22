package com.javamg.entity;

import javax.persistence.*;
import java.util.List;
/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
@Entity
@Table(name="meetings")
public class Meetings extends BaseEntity{

    private String name;
    private String description;

    @ManyToMany(cascade= CascadeType.ALL, fetch= FetchType.LAZY)
    @JoinTable(name="meeting_department", joinColumns= @JoinColumn(name="department_id"),
            inverseJoinColumns= @JoinColumn(name="meeting_id"))
    private List<Department> departments;

    public Meetings() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDsc() {
        return description;
    }
    public void setDsc(String dsc) {
        this.description = description;
    }
}
