package io.ikka.democustomer.model.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Customer {
    private Long id;
    private String name;
}
