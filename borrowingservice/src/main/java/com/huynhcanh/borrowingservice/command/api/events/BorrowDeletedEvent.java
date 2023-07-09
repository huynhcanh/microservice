package com.huynhcanh.borrowingservice.command.api.events;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BorrowDeletedEvent {
    private String id;
}
