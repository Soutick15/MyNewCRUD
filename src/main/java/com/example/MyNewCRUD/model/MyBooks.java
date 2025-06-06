package com.example.MyNewCRUD.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Getter
@Setter
public class MyBooks {
    int id;
    String name;
    int price;
}
