package service;

public class TeamException extends Exception {
    static final long serialVersionUID = -33875163124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}