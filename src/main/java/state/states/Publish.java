package state.states;

import state.context.Book;

public class Publish extends State {
    private Draft draft;

    public Publish(Book book) {
        super(book);
    }

    @Override
    public void edit() {
        System.out.println("edit some changes in publish");;
    }

    @Override
    public Draft publish() {
        edit();
        System.out.println("publish");
        return new Draft(super.book);
    }
}
