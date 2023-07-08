package com.huynhcanh.bookservice.command.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookCreatedEvent {
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;
}
