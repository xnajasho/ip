package duke.commands;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.exceptions.DukeException;
import duke.exceptions.InvalidDirectoryException;

/**
 * Abstract class for the various different Commands
 */
public abstract class Command {
    public abstract void execute(TaskList task, Ui ui, Storage storage) throws DukeException, InvalidDirectoryException;
    public abstract boolean isExit();
}
