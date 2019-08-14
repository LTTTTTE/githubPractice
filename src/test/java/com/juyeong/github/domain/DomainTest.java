package com.juyeong.github.domain;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class DomainTest {
    @Test
    public void todoInitTest(){
        Todo builded = Todo.builder().build();
        assertThat(builded).isNotNull();
    }
}
