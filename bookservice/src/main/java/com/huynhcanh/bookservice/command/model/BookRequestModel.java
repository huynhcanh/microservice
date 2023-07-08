package com.huynhcanh.bookservice.command.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequestModel {
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;
}
