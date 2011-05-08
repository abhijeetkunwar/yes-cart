package org.yes.cart.domain.entity;

import org.yes.cart.domain.dto.CartItem;

import java.math.BigDecimal;


/**
 * Represent sku in order with quantity and price in order currency.
 * At this moment prices in shopiing cart items list and here without
 * catalog promotions. TODO add catalog promotion sku price modificators
 * <p/>
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 07-May-2011
 * Time: 11:12:54
 */
public interface CustomerOrderDet extends Auditable, CartItem {

    /**
     * Get order detail pk value.
     *
     * @return detail pk value
     */
    public long getCustomerOrderDetId();

    /**
     * Set detail pk value
     *
     * @param customerOrderDetId set pk value.
     */
    public void setCustomerOrderDetId(long customerOrderDetId);

    /**
     * Get quantity of skus.
     *
     * @return set quantity of skus.
     */
    public BigDecimal getQty();

    /**
     * Set quantity of skus.
     *
     * @param qty quantity of skus.
     */
    public void setQty(BigDecimal qty);

    /**
     * Get the price.
     *
     * @return price per single sku.
     */
    public BigDecimal getPrice();

    /**
     * Set single sku price.
     *
     * @param price single sku price.
     */
    public void setPrice(BigDecimal price);

    /**
     * Concrete product sku in cart.
     *
     * @return {@link ProductSku} product sku.
     */
    public ProductSku getSku();

    /**
     * Set {@link ProductSku}.
     *
     * @param sku product sku
     */
    public void setSku(ProductSku sku);

    /**
     * @return
     */
    public CustomerOrder getCustomerOrder();

    /**
     * @param customerOrder
     */
    public void setCustomerOrder(CustomerOrder customerOrder);

}


