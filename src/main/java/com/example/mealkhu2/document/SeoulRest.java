package com.example.mealkhu2.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@Getter
@Setter
@ToString
@Document("s_dinings")
public class SeoulRest {
//    @Id
//    private String _id;
    private String _id;
    private String name;
    private String address;
    private String latitude;
    private String longitude;
    private String type;
    private String menu;
    private String price;
    private String img;
    private String img_source;
    private String place_url;






}
