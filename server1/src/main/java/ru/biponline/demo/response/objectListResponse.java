package ru.biponline.demo.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.biponline.demo.entity.objectEntity;

@Data
@EqualsAndHashCode(callSuper = false)
public class objectListResponse  extends BaseResponse{
    public objectListResponse (Iterable < objectEntity > data) {
            super(true,"квартиры");
            this.data = data;
 }
       private Iterable<objectEntity> data;
    }