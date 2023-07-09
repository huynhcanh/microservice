package com.huynhcanh.commonservice.event;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookUpdateStatusEvent {
    private String bookId;
    private Boolean isReady;
    private String employeeId;
    private String borrowId;
}
