package Modulo04.Composicoes.ExercicioFixacao01.Enums;

public enum WorkerLevel {
    JUNIOR(1),
    MID_LEVEL(2),
    SENIOR(3);

    private int level;

     WorkerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
