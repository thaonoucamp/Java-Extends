public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Ke thua (Bien va Ham) va mo rong;
        emp.rice = 1000;
        emp.index = "Ha noi";
        emp.name = "Dang Xuan Thao";

        emp.setName("Nguyen Thi Hoa");
        emp.setIndex("Nam Dinh");
        emp.setRice(2000);

        System.out.println(emp.toString());

        Worker worker = new Worker();
        worker.setIndex("Ha Tay");
        worker.setRice(5000);
        worker.setName("Dang gia");

        System.out.println(worker.toString());

    }
}
