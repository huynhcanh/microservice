package com.huynhcanh.bookservice.command.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDeletedEvent {
    private String bookId;
}
