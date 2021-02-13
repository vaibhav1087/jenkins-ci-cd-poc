package in.viren.springbootdocker.response;

import in.viren.springbootdocker.model.Stock;

import java.util.List;

public class StockDetailsResponse {

    private List<Stock> stocks;

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
