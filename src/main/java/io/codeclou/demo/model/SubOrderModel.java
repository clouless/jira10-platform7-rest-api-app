package io.codeclou.demo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SubOrderModel {
    @XmlElement(nillable = true)
    public String subOrderType;

    @XmlElement(nillable = true)
    public String subOrderDetails;

    public String getSubOrderType() {
        return subOrderType;
    }

    public void setSubOrderType(String subOrderType) {
        this.subOrderType = subOrderType;
    }

    public String getSubOrderDetails() {
        return subOrderDetails;
    }

    public void setSubOrderDetails(String subOrderDetails) {
        this.subOrderDetails = subOrderDetails;
    }
}
