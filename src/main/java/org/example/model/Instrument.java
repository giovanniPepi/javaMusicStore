package org.example.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;
@Document
@Data
public class Instrument {
  @MongoId(FieldType.OBJECT_ID)
  private String id;
  private String name;
  private String type;
  private Integer price;
  private Integer numberInStock;
  private String description;
  private String imageURL;


}
