package ru.biponline.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@Table(name = "rent")
public class rentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Object;
    private Long Id_Customer;
    @NotBlank(message = "строка с ценой квартиры не может быть пустой")
    private String price_object;
    @NotBlank(message = "строка с названием квартиры не может быть пустой")
    private String name_object;

    @JsonIgnore
    @OneToMany(cascade =  CascadeType.ALL,mappedBy = "rent")
    private List<objectEntity> object;
}
