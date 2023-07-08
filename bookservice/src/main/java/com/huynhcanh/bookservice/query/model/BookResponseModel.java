package com.huynhcanh.bookservice.query.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponseModel {
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;
}
