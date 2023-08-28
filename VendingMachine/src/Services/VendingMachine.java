package Services;

import java.util.List;

import Domen.Product;

public class VendingMachine {
    private Holder holder;
    private CoinDispenser coinDispenser;

    private List<Product> productList;

    public VendingMachine(Holder holder, CoinDispenser coinDispenser, List<Product> productList) {
        this.holder = holder;
        this.coinDispenser = coinDispenser;
        this.productList = productList;
    }

    public Product getProduct(int index) {
        return productList.get(index);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Holder getHolder() {
        return holder;
    }

    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }
}