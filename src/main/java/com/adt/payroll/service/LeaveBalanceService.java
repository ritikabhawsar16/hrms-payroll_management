package com.adt.payroll.service;

import com.adt.payroll.model.LeaveBalance;

import java.util.List;
import java.util.Optional;

public interface LeaveBalanceService {
    List<LeaveBalance> getAllEmployeeLeaves();

    Optional<LeaveBalance> getLeaveBalanceById(Integer leaveBalanceId);

    Optional<LeaveBalance> updateLeaveBalance(Integer leaveBalanceId, LeaveBalance leaveBalance);
    boolean deleteLeaveBalance(Integer leaveBalanceId);

    public LeaveBalance saveLeaveBalance(LeaveBalance leaveBalance);

     Optional findByEmpId(Integer empId);
}
