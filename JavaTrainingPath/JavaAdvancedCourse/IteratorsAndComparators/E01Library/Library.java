package JavaAdvancedCourse.IteratorsAndComparators.E01Library;

import java.util.*;
import java.util.function.Consumer;

public class Library implements Iterable<Book>{

    private List<Book> library;

    public Library(){
        this.library= new ArrayList<>();
    }

    public Library(Book... books){
        this.library= new ArrayList<>(Arrays.asList(books));
    }

    public void addBook(Book book){
        this.library.add(book);
    }

    public void addBooks(Book... book){
        this.library.addAll(Arrays.asList(book));
    }

    @Override
    public Iterator<Book> iterator() {
        return new libIterator() ;
    }

    @Override
    public void forEach(Consumer<? super Book> action) {
        for (Book book : this.library) {
            action.accept(book);
        }
    }


    private class libIterator implements Iterator<Book> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            if(this.counter < library.size()){
                return true;
            }
            return false;
        }

        @Override
        public Book next() {
            return library.get(counter++);
        }

    }
}
