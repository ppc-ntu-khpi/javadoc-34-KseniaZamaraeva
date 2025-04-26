package domain;

/**
 * Клас {@code Artist} представляє співробітника-художника,
 * який має набір певних навичок (skills).
 * Наслідує загальні властивості класу {@link Employee}.
 */
public class Artist extends Employee {

    /**
     * Масив навичок художника.
     */
    private String[] skiils;

    /**
     * Конструктор для створення об'єкта {@code Artist} з усіма параметрами.
     *
     * @param skiils масив навичок художника
     * @param name ім'я художника
     * @param jobTitle посада художника
     * @param level рівень художника
     * @param dept відділ, у якому працює художник
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор для створення об'єкта {@code Artist} тільки з навичками.
     *
     * @param skiils масив навичок художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Конструктор за замовчуванням.
     * Ініціалізує масив навичок розміром 10 елементів.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає рядкове представлення об'єкта {@code Artist},
     * яке включає інформацію про працівника та його навички.
     *
     * @return рядкове представлення об'єкта
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Повертає список навичок у вигляді одного рядка,
     * де навички розділені комами.
     *
     * @return рядок з навичками
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив навичок для художника.
     *
     * @param skills масив навичок
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає масив навичок художника.
     *
     * @return масив навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
