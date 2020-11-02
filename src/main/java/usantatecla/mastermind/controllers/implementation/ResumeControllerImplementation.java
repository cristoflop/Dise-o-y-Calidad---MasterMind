package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

    private SessionImplementation sessionImplementation;

    public ResumeControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.sessionImplementation.reset();
        } else {
            this.sessionImplementation.next();
        }
    }


}