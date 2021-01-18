public class Person {
    String name;
    String index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", index='" + index + '\'' +
                '}';
    }
}
