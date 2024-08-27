package com.baconbao.e_commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "messenger")
public class Messenger {
    @Id
    private Integer id;
    private String sender_id;
    private String receiver_id;
    private String messenger;
    private String status;
    private LocalDateTime create_at;
}
