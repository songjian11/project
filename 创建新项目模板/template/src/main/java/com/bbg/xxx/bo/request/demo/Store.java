package com.bbg.xxx.bo.request.demo;

import java.math.BigDecimal;
import java.util.Date;

public class Store {
    private Integer store;

    private String storeName;

    private String storeName10;

    private String storeMgrName;

    private String storeOpenDate;

    private String storeCloseDate;

    private String district;

    private String faxNumber;

    private String phoneNumber;

    private String email;

    private Integer totalSquareFt;

    private Integer sellingSquareFt;

    private Integer transferZone;

    private Integer defaultWh;

    private Integer orgUnitId;

    private String stockholdingInd;

    private Integer stopOrderDays;

    private Integer startOrderDays;

    private String country;

    private String state;

    private String city;

    private String address;

    private String zipCode;

    private Date publishTime;

    private Date createDatetime;

    private String lastUpdateId;

    private Date lastUpdateDatetime;
    
    private String storeLevel; // '机构等级',
    private BigDecimal storeEffcientvalue; // '评效',
    private String storeStatus; // '机构状态',
    private String storeRemarks; // '备注信息',

    public String getStoreLevel() {
		return storeLevel;
	}

	public void setStoreLevel(String storeLevel) {
		this.storeLevel = storeLevel;
	}

	public BigDecimal getStoreEffcientvalue() {
		return storeEffcientvalue;
	}

	public void setStoreEffcientvalue(BigDecimal storeEffcientvalue) {
		this.storeEffcientvalue = storeEffcientvalue;
	}

	public String getStoreStatus() {
		return storeStatus;
	}

	public void setStoreStatus(String storeStatus) {
		this.storeStatus = storeStatus;
	}

	public String getStoreRemarks() {
		return storeRemarks;
	}

	public void setStoreRemarks(String storeRemarks) {
		this.storeRemarks = storeRemarks;
	}

	public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreName10() {
        return storeName10;
    }

    public void setStoreName10(String storeName10) {
        this.storeName10 = storeName10 == null ? null : storeName10.trim();
    }

    public String getStoreMgrName() {
        return storeMgrName;
    }

    public void setStoreMgrName(String storeMgrName) {
        this.storeMgrName = storeMgrName == null ? null : storeMgrName.trim();
    }

    public String getStoreOpenDate() {
        return storeOpenDate;
    }

    public void setStoreOpenDate(String storeOpenDate) {
        this.storeOpenDate = storeOpenDate == null ? null : storeOpenDate.trim();
    }

    public String getStoreCloseDate() {
        return storeCloseDate;
    }

    public void setStoreCloseDate(String storeCloseDate) {
        this.storeCloseDate = storeCloseDate == null ? null : storeCloseDate.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber == null ? null : faxNumber.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getTotalSquareFt() {
        return totalSquareFt;
    }

    public void setTotalSquareFt(Integer totalSquareFt) {
        this.totalSquareFt = totalSquareFt;
    }

    public Integer getSellingSquareFt() {
        return sellingSquareFt;
    }

    public void setSellingSquareFt(Integer sellingSquareFt) {
        this.sellingSquareFt = sellingSquareFt;
    }

    public Integer getTransferZone() {
        return transferZone;
    }

    public void setTransferZone(Integer transferZone) {
        this.transferZone = transferZone;
    }

    public Integer getDefaultWh() {
        return defaultWh;
    }

    public void setDefaultWh(Integer defaultWh) {
        this.defaultWh = defaultWh;
    }

    public Integer getOrgUnitId() {
        return orgUnitId;
    }

    public void setOrgUnitId(Integer orgUnitId) {
        this.orgUnitId = orgUnitId;
    }

    public String getStockholdingInd() {
        return stockholdingInd;
    }

    public void setStockholdingInd(String stockholdingInd) {
        this.stockholdingInd = stockholdingInd == null ? null : stockholdingInd.trim();
    }

    public Integer getStopOrderDays() {
        return stopOrderDays;
    }

    public void setStopOrderDays(Integer stopOrderDays) {
        this.stopOrderDays = stopOrderDays;
    }

    public Integer getStartOrderDays() {
        return startOrderDays;
    }

    public void setStartOrderDays(Integer startOrderDays) {
        this.startOrderDays = startOrderDays;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
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
}