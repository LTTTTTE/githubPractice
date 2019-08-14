package com.juyeong.github.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class Todo {
    private Integer id;
    private String name;
    private String desc;
    private Status status;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
