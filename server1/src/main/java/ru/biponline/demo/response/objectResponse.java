package ru.biponline.demo.response;

import ru.biponline.demo.entity.objectEntity;

public class objectResponse extends BaseResponse {

    public objectResponse(boolean success, String message, objectEntity object)
    {
        super(success,message);
        this.object = object;
    }
    public objectResponse(objectEntity object)
    {
        super(true,"pub data");

    }
    private objectEntity object;

}
