public abstract class AnimalAbstract {
    protected String name;
    protected LocationEnum location;

    public String getName() {
        return name;
    }
    public LocationEnum getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Животное по кличке " + this.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }
}
