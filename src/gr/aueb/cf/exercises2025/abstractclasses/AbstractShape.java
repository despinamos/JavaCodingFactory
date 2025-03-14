package gr.aueb.cf.exercises2025.abstractclasses;

public abstract class AbstractShape implements IShape{

    private long id;

    public AbstractShape() {}

    @Override
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
