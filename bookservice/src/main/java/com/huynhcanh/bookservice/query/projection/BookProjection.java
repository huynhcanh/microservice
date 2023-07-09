package com.huynhcanh.bookservice.query.projection;

import com.huynhcanh.bookservice.command.data.Book;
import com.huynhcanh.bookservice.command.data.BookRepository;
import com.huynhcanh.bookservice.query.model.BookResponseModel;
import com.huynhcanh.bookservice.query.queries.GetAllBooksQuery;
import com.huynhcanh.bookservice.query.queries.GetBookQuery;
import com.huynhcanh.commonservice.model.BookResponseCommonModel;
import com.huynhcanh.commonservice.query.GetDetailsBookQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookProjection {
    @Autowired
    private BookRepository bookRepository;

    @QueryHandler
    public BookResponseModel handle(GetBookQuery getBooksQuery) {
        BookResponseModel model = new BookResponseModel();
        Book book = bookRepository.findById(getBooksQuery.getBookId()).get();
        BeanUtils.copyProperties(book, model);
        return model;
    }

    @QueryHandler
    List<BookResponseModel> handle(GetAllBooksQuery getAllBooksQuery){
        List<Book> listEntity = bookRepository.findAll();
        List<BookResponseModel> listbook = new ArrayList<>();
        listEntity.forEach(s -> {
            BookResponseModel model = new BookResponseModel();
            BeanUtils.copyProperties(s, model);
            listbook.add(model);
        });
        return listbook;
    }

    @QueryHandler
    public BookResponseCommonModel handle(GetDetailsBookQuery getDetailsBookQuery) {
        BookResponseCommonModel model = new BookResponseCommonModel();
        Book book = bookRepository.findById(getDetailsBookQuery.getBookId()).get();
        BeanUtils.copyProperties(book, model);
        return model;
    }
}
