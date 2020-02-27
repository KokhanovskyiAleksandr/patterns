package state.states;

import state.context.Book;

public abstract class State {
    Book book;

    State(Book book) {
        this.book = book;
    }

    abstract void edit();

    abstract State publish();
}
