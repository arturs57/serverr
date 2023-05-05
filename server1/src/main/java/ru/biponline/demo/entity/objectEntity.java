package ru.biponline.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table (name = "object")
public class objectEntity {
    @Column (name = "object_id")
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "строка с названием квартиры не может быть пустой")
    private String name_object;

    private int price_object;

    private int storey_object;

    private int room_object;

    private int footage_object;

    @NotNull
    @OneToMany
    @JoinColumn(name = "rent_id")
    private rentEntity rent;
    @NotNull
    @OneToMany
    @JoinColumn(name = "sale_id")
    private saleEntity sale;


}
