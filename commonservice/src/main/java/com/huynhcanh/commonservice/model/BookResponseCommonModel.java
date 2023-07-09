package com.huynhcanh.commonservice.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookResponseCommonModel {
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;
}
