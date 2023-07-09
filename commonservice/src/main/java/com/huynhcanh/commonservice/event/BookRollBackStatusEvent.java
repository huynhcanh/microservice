package com.huynhcanh.commonservice.event;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookRollBackStatusEvent {
    private String bookId;
    private Boolean isReady;
    private String employeeId;
    private String borrowId;
}
