package org.spring.micro.stock.controller;

import org.spring.micro.stock.api.request.QueryStockReq;
import org.spring.micro.stock.api.response.QueryStockResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @PostMapping("/query_stock")
    public QueryStockResp queryStock(@RequestBody QueryStockReq request) {
        QueryStockResp resp = new QueryStockResp();
        resp.setInfo(String.format("库存信息 id: %s", request.getId()));
        return resp;
    }
}
