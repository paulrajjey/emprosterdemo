/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package employeerostering.employeerostering;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@com.thoughtworks.xstream.annotations.XStreamAlias("ShiftAssignment")
@org.optaplanner.core.api.domain.entity.PlanningEntity
public class ShiftAssignment implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private employeerostering.employeerostering.Shift shift;
	@org.optaplanner.core.api.domain.variable.PlanningVariable(valueRangeProviderRefs = {"employeeRange"})
	private employeerostering.employeerostering.Employee employee;

	private employeerostering.employeerostering.DayOffRequest dayOfRequest;

	private java.lang.String notes;

	public ShiftAssignment() {
	}

	public employeerostering.employeerostering.Shift getShift() {
		return this.shift;
	}

	public void setShift(employeerostering.employeerostering.Shift shift) {
		this.shift = shift;
	}

	public employeerostering.employeerostering.Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(
			employeerostering.employeerostering.Employee employee) {
		this.employee = employee;
	}

	public employeerostering.employeerostering.DayOffRequest getDayOfRequest() {
		return this.dayOfRequest;
	}

	public void setDayOfRequest(
			employeerostering.employeerostering.DayOffRequest dayOfRequest) {
		this.dayOfRequest = dayOfRequest;
	}

	public java.lang.String getNotes() {
		return this.notes;
	}

	public void setNotes(java.lang.String notes) {
		this.notes = notes;
	}

	public ShiftAssignment(employeerostering.employeerostering.Shift shift,
			employeerostering.employeerostering.Employee employee,
			employeerostering.employeerostering.DayOffRequest dayOfRequest,
			java.lang.String notes) {
		this.shift = shift;
		this.employee = employee;
		this.dayOfRequest = dayOfRequest;
		this.notes = notes;
	}

}