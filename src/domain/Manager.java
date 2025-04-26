package domain;

/**
 * Клас {@code Manager} представляє менеджера, який є співробітником ({@link Employee}),
 * що керує певним списком інших співробітників.
 */
public class Manager extends Employee {

    /**
     * Масив співробітників, якими керує менеджер.
     */
    private Employee[] employees;

    /**
     * Конструктор для створення менеджера з повною інформацією.
     *
     * @param employees масив підлеглих співробітників
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера
     * @param dept відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Конструктор для створення менеджера тільки з підлеглими співробітниками.
     *
     * @param employees масив підлеглих співробітників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор за замовчуванням.
     * Створює менеджера з масивом на 10 співробітників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Повертає рядкове представлення об'єкта {@code Manager},
     * включаючи інформацію про менеджера та його підлеглих.
     *
     * @return рядок з інформацією про менеджера
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Повертає список імен підлеглих співробітників у вигляді рядка.
     *
     * @return рядок з іменами співробітників, розділеними комами
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив підлеглих співробітників.
     *
     * @param employees масив співробітників
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих співробітників.
     *
     * @return масив об'єктів {@code Employee}
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
