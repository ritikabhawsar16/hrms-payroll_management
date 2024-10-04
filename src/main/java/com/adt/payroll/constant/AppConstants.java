package com.adt.payroll.constant;


public enum  AppConstants {
	
	APPROVED("Approved"),
    LEAVEINCREMENT("LeaveIncrement"),
    BONUS("Bonus"),
    GOODWILL("GoodWill"),
    COMPOFF("CompOff"),
    PENDING("Pending"),
    SETTLED("Settled");

	private final String status;

	AppConstants(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return status;
	}

}
