package usantatecla.mastermind.views;

import usantatecla.utils.Console;

public enum MessageView {
    ATTEMPTS("#attempts attempt(s): "),
    SECRET("*"),
    RESUME("Do you want to continue"),
    RESULT(" --> #blacks blacks and #whites whites"),
    PROPOSED_COMBINATION("Propose a combination: "),
    TITLE("----- MASTERMIND -----"),
    WINNER("You've won!!! ;-)"),
    LOOSER("You've lost!!! :-(");

    private String message;

    private Console console = new Console();

    MessageView(String message) {
        this.message = message;
        this.console = new Console();
    }

    void write() {
        this.console.write(this.message);
    }

    void writeln() {
        this.console.writeln(this.message);
    }

    void writeln(int attempts) {
        this.console.writeln(this.message.replaceAll("#attempts", "" + attempts));
    }

    void writeln(int blacks, int whites) {
        this.console.writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
    }

}
