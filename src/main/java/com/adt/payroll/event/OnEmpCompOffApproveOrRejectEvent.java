package com.adt.payroll.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.web.util.UriComponentsBuilder;

import com.adt.payroll.model.CompOff;

import lombok.Data;

@Data
public class OnEmpCompOffApproveOrRejectEvent extends ApplicationEvent {

	private final CompOff compOff;
	private final String action;
	private final String actionStatus;

	public OnEmpCompOffApproveOrRejectEvent(CompOff compOff, String action, String actionStatus) {
		super(compOff);
		this.compOff = compOff;
		this.action = action;
		this.actionStatus = actionStatus;
	}

	public CompOff getCompOff() {
		return compOff;
	}

	public String getAction() {
		return action;
	}

	public String getActionStatus() {
		return actionStatus;
	}
}
