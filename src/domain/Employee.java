package domain;

/**
 * Клас {@code Employee} представляє загальну інформацію про співробітника:
 * ім'я, посаду, рівень, відділ та унікальний ідентифікаційний номер (ID).
 */
public class Employee {

    /**
     * Ім'я співробітника.
     */
    private String name;

    /**
     * Назва посади співробітника.
     */
    private String jobTitle;

    /**
     * Унікальний ідентифікаційний номер співробітника.
     */
    private int ID;

    /**
     * Рівень співробітника (1, 2 або 3).
     */
    private int level;

    /**
     * Відділ, у якому працює співробітник.
     */
    private String dept;

    /**
     * Повертає рядкове представлення об'єкта {@code Employee}.
     *
     * @return рядок з даними співробітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID +
               "\nName= " + name +
               "\nJobTitle= " + jobTitle +
               "\nLevel= " + level +
               "\nDept= " + dept;
    }

    /**
     * Конструктор для створення співробітника з вказаними параметрами.
     *
     * @param name ім'я співробітника
     * @param jobTitle посада співробітника
     * @param level рівень співробітника (1, 2 або 3)
     * @param dept відділ співробітника
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        setLevel(level);
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням.
     * Генерує випадковий ID для співробітника.
     */
    public Employee() {
        ID = (int)(Math.random() * 1000);
        // Перевірка на обмеження ID вимкнена
    }

    /**
     * Встановлює посаду співробітника.
     *
     * @param job нова посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду співробітника.
     *
     * @return назва посади
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я співробітника.
     *
     * @return ім'я
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень співробітника.
     * Якщо рівень не 1, 2 або 3, встановлюється рівень 1 за замовчуванням.
     *
     * @param level рівень співробітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень співробітника.
     *
     * @return рівень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ співробітника.
     *
     * @return назва відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ співробітника.
     *
     * @param dept новий відділ
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я співробітника.
     * Якщо ім'я не відповідає вказаному шаблону, встановлюється "John Doe".
     *
     * @param name ім'я для встановлення
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
