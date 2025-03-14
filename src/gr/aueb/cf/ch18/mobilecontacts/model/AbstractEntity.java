package gr.aueb.cf.ch18.mobilecontacts.model;

import gr.aueb.cf.exercises2025.abstractclasses.IShape;

public abstract class AbstractEntity {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
