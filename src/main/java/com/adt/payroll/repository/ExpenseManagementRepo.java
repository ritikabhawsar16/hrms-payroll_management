package com.adt.payroll.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adt.payroll.model.ExpenseItems;

@Repository
public interface ExpenseManagementRepo extends JpaRepository<ExpenseItems, Integer> {

	@Query(value = "SELECT * FROM expense_schema.expense_management e WHERE e.employee_id = :empId AND EXTRACT(MONTH FROM payment_date) = :month "
			+ "AND EXTRACT(YEAR FROM payment_date) = :year and status='Approved' ", nativeQuery = true)
	Optional<ExpenseItems> findExpenseDetailsByEmpId(@Param("empId") Integer empId, @Param("month") Integer month,
			@Param("year") Integer year);

	@Query(value = "SELECT * FROM expense_schema.expense_management e WHERE e.employee_id = :empId "
			+ "AND (EXTRACT(MONTH FROM e.payment_date) = :fromDateMonth OR EXTRACT(MONTH FROM e.payment_date) = :toDateMonth) "
			+ "AND EXTRACT(YEAR FROM e.payment_date) = :year "
			+ "AND ((LOWER(e.status) = 'approved') OR (LOWER(e.status) = 'settled' AND e.settled_date BETWEEN :fromDate AND :toDate))", nativeQuery = true)
	Optional<List<ExpenseItems>> findExpenseByEmpId(@Param("empId") Integer empId,
			@Param("fromDateMonth") Integer fromDateMonth, @Param("toDateMonth") Integer toDateMonth,
			@Param("year") Integer year, @Param("fromDate") LocalDate fromDate, @Param("toDate") LocalDate toDate);

}
