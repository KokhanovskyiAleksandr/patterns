package state.states;

import state.context.Book;

public class Moderator extends State {
    private Publish publish;

    public Moderator(Book book) {
        super(book);
        publish = new Publish(book);
    }

    @Override
    public void edit() {
        System.out.println("edit some changes in moderator");
    }

    @Override
    public Publish publish() {
        edit();
        return publish;
    }
}
