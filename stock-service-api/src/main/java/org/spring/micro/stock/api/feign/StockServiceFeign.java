package org.spring.micro.stock.api.feign;

import org.spring.micro.stock.api.request.QueryStockReq;
import org.spring.micro.stock.api.response.QueryStockResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 远程调用与相关服务的 controller 对齐
 */
@FeignClient(name = "stock-service")
public interface StockServiceFeign {
    @PostMapping("/query_stock")
    QueryStockResp queryStock(@RequestBody QueryStockReq request);
}
