package hu.flowacademy.finalexam.Model;

public enum JobGrade {
    INTERN(1),
    JUNIOR(2),
    MEDIOR(3),
    SENIOR(4),
    SPECIALIST(5);

    private final int value;

    JobGrade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

