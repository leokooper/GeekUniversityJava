public enum AppState {
    INIT(5), PREPARE(7), WORK(4), SAVE(10), TERMINATE(1);

    private int priority;

    public int getPriority() {
        return priority;
    }

    private AppState(int priority) {
        this.priority = priority;
    }
}
