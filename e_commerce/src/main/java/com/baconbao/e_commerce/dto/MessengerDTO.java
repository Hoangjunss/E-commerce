package com.baconbao.e_commerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessengerDTO {
    private Integer id;
    private String sender_id;
    private String receiver_id;
    private String messenger;
    private String status;
    private LocalDateTime create_at;
}
