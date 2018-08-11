package pzinsta.pizzeria.web.client.dto.payment;

import javax.money.MonetaryAmount;
import java.io.Serializable;

public class SaleRequest implements Serializable {
    private String nonce;
    private MonetaryAmount amount;
    private Long orderId;

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public MonetaryAmount getAmount() {
        return amount;
    }

    public void setAmount(MonetaryAmount amount) {
        this.amount = amount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}