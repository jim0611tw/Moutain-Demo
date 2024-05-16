package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVo<T> {

    public ResultVo(Integer code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private Integer code;

    private String msg = "";

    private T data;

}
