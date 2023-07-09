package com.huynhcanh.borrowingservice.command.api.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.NoRepositoryBean;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BorrowSendMessageEvent {
    private String id;
    private String employeeId;
    private String message;
}
