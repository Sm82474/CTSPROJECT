package com.cts.model;

import java.time.YearMonth;

public class Payment {
	private int transactionId;
	private long cardNo;
	private String holderName;
	private YearMonth expiry;
	private int cvv;

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public YearMonth getExpiry() {
		return expiry;
	}

	public void setExpiry(YearMonth expiry) {
		this.expiry = expiry;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

}
