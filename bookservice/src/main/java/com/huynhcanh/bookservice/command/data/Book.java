package com.huynhcanh.bookservice.command.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Book {
    @Id
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;
}
