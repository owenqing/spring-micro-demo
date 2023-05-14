package org.spring.micro.stock.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class QueryStockReq {
    @JsonProperty("id")
    Integer id;
}
