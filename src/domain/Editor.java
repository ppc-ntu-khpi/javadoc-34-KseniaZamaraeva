package domain;

/**
 * Клас {@code Editor} представляє редактора, який є художником
 * з додатковою характеристикою типу редагування (електронне або паперове).
 * Наслідує властивості класу {@link Artist}.
 */
public class Editor extends Artist {

    /**
     * Ознака електронного редагування.
     * Якщо {@code true}, редагування здійснюється електронно,
     * інакше - на папері.
     */
    private boolean electronicEditing;

    /**
     * Конструктор для створення об'єкта {@code Editor} з усіма параметрами.
     *
     * @param electronicEditing чи використовує редактор електронне редагування
     * @param skiils масив навичок редактора
     * @param name ім'я редактора
     * @param jobTitle посада редактора
     * @param level рівень редактора
     * @param dept відділ, у якому працює редактор
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення {@code Editor} з навичками та типом редагування.
     *
     * @param electronicEditing чи використовує редактор електронне редагування
     * @param skiils масив навичок редактора
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення {@code Editor} тільки з типом редагування.
     *
     * @param electronicEditing чи використовує редактор електронне редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор за замовчуванням.
     * Тип редагування за замовчуванням - електронне.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення об'єкта {@code Editor},
     * включаючи дані про працівника, навички та тип редагування.
     *
     * @return рядок з інформацією про редактора
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= "; 
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }

    /**
     * Повертає тип редагування.
     *
     * @return {@code true}, якщо редагування електронне, інакше {@code false}
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування.
     *
     * @param electronic {@code true} для електронного редагування, {@code false} для паперового
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
