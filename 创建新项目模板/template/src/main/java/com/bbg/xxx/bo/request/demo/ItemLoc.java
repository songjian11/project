package com.bbg.xxx.bo.request.demo;

import java.math.BigDecimal;
import java.util.Date;

public class ItemLoc{
    private String item;

    private Integer loc;

    private String locType;

    private String itemParent;

    private BigDecimal unitRetail;

    private BigDecimal regularUnitRetail;

    private BigDecimal sellingUnitRetail;

    private String sellingUom;

    private String status;

    private String sourceMethod;

    private String dsdInd;

    private String nbbInd;

    private String nboInd;

    private String stopSaleInd;

    private String itemType;

    private String storePriceInd;

    private Date createDatetime;

    private String lastUpdateId;

    private Date lastUpdateDatetime;

    private Date publishTime;
    
    private String sourceWh;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getLoc() {
        return loc;
    }

    public void setLoc(Integer loc) {
        this.loc = loc;
    }

    public String getSourceWh() {
		return sourceWh;
	}

	public void setSourceWh(String sourceWh) {
		this.sourceWh = sourceWh;
	}

	public String getLocType() {
        return locType;
    }

    public void setLocType(String locType) {
        this.locType = locType == null ? null : locType.trim();
    }

    public String getItemParent() {
        return itemParent;
    }

    public void setItemParent(String itemParent) {
        this.itemParent = itemParent == null ? null : itemParent.trim();
    }

    public BigDecimal getUnitRetail() {
        return unitRetail;
    }

    public void setUnitRetail(BigDecimal unitRetail) {
        this.unitRetail = unitRetail;
    }

    public BigDecimal getRegularUnitRetail() {
        return regularUnitRetail;
    }

    public void setRegularUnitRetail(BigDecimal regularUnitRetail) {
        this.regularUnitRetail = regularUnitRetail;
    }

    public BigDecimal getSellingUnitRetail() {
        return sellingUnitRetail;
    }

    public void setSellingUnitRetail(BigDecimal sellingUnitRetail) {
        this.sellingUnitRetail = sellingUnitRetail;
    }

    public String getSellingUom() {
        return sellingUom;
    }

    public void setSellingUom(String sellingUom) {
        this.sellingUom = sellingUom == null ? null : sellingUom.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSourceMethod() {
        return sourceMethod;
    }

    public void setSourceMethod(String sourceMethod) {
        this.sourceMethod = sourceMethod == null ? null : sourceMethod.trim();
    }

    public String getDsdInd() {
        return dsdInd;
    }

    public void setDsdInd(String dsdInd) {
        this.dsdInd = dsdInd == null ? null : dsdInd.trim();
    }

    public String getNbbInd() {
        return nbbInd;
    }

    public void setNbbInd(String nbbInd) {
        this.nbbInd = nbbInd == null ? null : nbbInd.trim();
    }

    public String getNboInd() {
        return nboInd;
    }

    public void setNboInd(String nboInd) {
        this.nboInd = nboInd == null ? null : nboInd.trim();
    }

    public String getStopSaleInd() {
        return stopSaleInd;
    }

    public void setStopSaleInd(String stopSaleInd) {
        this.stopSaleInd = stopSaleInd == null ? null : stopSaleInd.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getStorePriceInd() {
        return storePriceInd;
    }

    public void setStorePriceInd(String storePriceInd) {
        this.storePriceInd = storePriceInd == null ? null : storePriceInd.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId == null ? null : lastUpdateId.trim();
    }

    public Date getLastUpdateDatetime() {
        return lastUpdateDatetime;
    }

    public void setLastUpdateDatetime(Date lastUpdateDatetime) {
        this.lastUpdateDatetime = lastUpdateDatetime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}