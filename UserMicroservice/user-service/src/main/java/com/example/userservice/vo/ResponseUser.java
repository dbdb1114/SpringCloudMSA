package com.example.userservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL) // RestAPI로 데이터를 반환할 때 NULL은 제외한다 .
public class ResponseUser {
    private String email;
    private String name;
    private String userId;

    private List<ResponseOrder> orders;
}
