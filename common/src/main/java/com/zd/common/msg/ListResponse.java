package com.zd.common.msg;


import lombok.Data;

import java.util.List;

@Data
public class ListResponse<T> extends BaseResponse {
    private List<T> data;

}
