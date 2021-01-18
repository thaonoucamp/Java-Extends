public class Employee extends Person{
    double rice;

    public double getRice() {
        return rice;
    }

    public void setRice(double rice) {
        this.rice = rice;
    }

    public void numRice() {
        System.out.println("Muc luong: ");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rice=" + rice +
                ", name='" + name + '\'' +
                ", index='" + index + '\'' +
                '}';
    }
}
