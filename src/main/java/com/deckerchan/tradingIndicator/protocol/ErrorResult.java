package com.deckerchan.tradingIndicator.protocol;

/**
 * Created by deckerchan on 12/12/16.
 * This file may contains code with copyright.
 */
public final class ErrorResult extends Result {

    private String title;
    private Exception exception;
    private String solution;

    public ErrorResult(Exception ex) {
        this.setException(ex);
        this.setTitle(ex.getMessage());
        this.setSolution("Unknown.");

    }

    public ErrorResult(String title, Exception ex) {
        this(ex);
        this.setTitle(title);
    }

    public ErrorResult(String title, Exception ex, String solution) {
        this(title, ex);
        this.setSolution(solution);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Exception getException() {
        return exception;
    }

    private void setException(Exception exception) {
        this.exception = exception;
    }

    public String getSolution() {
        return solution;
    }

    private void setSolution(String solution) {
        this.solution = solution;
    }
}
