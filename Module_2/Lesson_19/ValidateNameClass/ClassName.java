package Lesson_19.ValidateNameClass;

public class ClassName {
    private String className;

    public ClassName() {
    }

    public ClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean validate(String regex) {
        return regex.matches("^[CAP]\\d{4}[GHIKLM]$");
    }
}
