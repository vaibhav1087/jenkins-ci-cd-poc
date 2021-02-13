package in.viren.springbootdocker.controller;

import in.viren.springbootdocker.model.Stock;
import in.viren.springbootdocker.response.StockDetailsResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StocksDetail {

    @RequestMapping(value = "/stock")
    public StockDetailsResponse getStockDetails(){
        StockDetailsResponse stockDetailsResponse = new StockDetailsResponse();

        Stock stock1 = new Stock();
        stock1.setStockId("101");
        stock1.setStockName("Spice Jet");

        Stock stock2 = new Stock();
        stock1.setStockId("102");
        stock1.setStockName("Adani Port");

        List<Stock> stockList = new ArrayList<Stock>();
        stockList.add(stock1);
        stockList.add(stock2);
        stockDetailsResponse.setStocks(stockList);
        return stockDetailsResponse;
    }

}
