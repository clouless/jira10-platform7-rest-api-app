package io.codeclou.demo.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderModel {

    @XmlElement
    String orderId;

    @XmlElement(nillable = true)
    String customerId;

    @XmlElement(nillable = true)
    SubOrderModel subOrder;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public SubOrderModel getSubOrder() {
        return subOrder;
    }

    public void setSubOrder(SubOrderModel subOrder) {
        this.subOrder = subOrder;
    }
}
