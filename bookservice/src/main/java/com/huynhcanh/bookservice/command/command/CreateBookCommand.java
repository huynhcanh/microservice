package com.huynhcanh.bookservice.command.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
@Setter
@AllArgsConstructor
public class CreateBookCommand {
    @TargetAggregateIdentifier
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;
}
