package org.spring.micro.demo.order.controller;

import org.spring.micro.stock.api.feign.StockServiceFeign;
import org.spring.micro.stock.api.request.QueryStockReq;
import org.spring.micro.stock.api.response.QueryStockResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private StockServiceFeign stockServiceFeign;

    @GetMapping("/query_order")
    public String queryOrder() {
        QueryStockReq req = new QueryStockReq();
        req.setId(2);
        QueryStockResp resp = stockServiceFeign.queryStock(req);
        return String.format("订单服务调用 >>> 查询库存信息: %s", resp.getInfo());
    }
}
