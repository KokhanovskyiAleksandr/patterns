package state;

import state.context.Book;
import state.states.Draft;
import state.states.Moderator;
import state.states.Publish;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        Draft draft = new Draft(book);
        Moderator moderator = draft.publish();
        Publish publish = moderator.publish();
        publish.publish();
    }
}
