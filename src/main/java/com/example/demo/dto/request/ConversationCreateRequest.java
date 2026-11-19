package com.example.demo.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ConversationCreateRequest {
    private String title;
    private String content;
}
