package state.states;

import state.context.Book;

public class Draft extends State {
    private Moderator moderator;

    public Draft(Book book) {
        super(book);
        moderator = new Moderator(book);
    }

    @Override
    public void edit() {
        System.out.println("edit some changes in draft");
    }

    @Override
    public Moderator publish() {
        edit();
        return moderator;
    }
}
