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

@com.thoughtworks.xstream.annotations.XStreamAlias("DayOffRequest")
public class DayOffRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private employeerostering.employeerostering.Employee employee;
	/**
	 * TODO Remove @XStreamConverter when java.time converters are provided by
	 * XStream out of the box.
	 *
	 * @see <a
	 *      href="https://github.com/x-stream/xstream/issues/75">XStream#75</a>
	 */
	@com.thoughtworks.xstream.annotations.XStreamConverter(org.kie.soup.commons.xstream.LocalDateXStreamConverter.class)
	private java.time.LocalDate date;

	private java.lang.String type;

	private java.time.LocalTime startTime;

	private java.time.LocalTime endTime;

	public DayOffRequest() {
	}

	public employeerostering.employeerostering.Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(
			employeerostering.employeerostering.Employee employee) {
		this.employee = employee;
	}

	public java.time.LocalDate getDate() {
		return this.date;
	}

	public void setDate(java.time.LocalDate date) {
		this.date = date;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.time.LocalTime getStartTime() {
		return this.startTime;
	}

	public void setStartTime(java.time.LocalTime startTime) {
		this.startTime = startTime;
	}

	public java.time.LocalTime getEndTime() {
		return this.endTime;
	}

	public void setEndTime(java.time.LocalTime endTime) {
		this.endTime = endTime;
	}

	public DayOffRequest(employeerostering.employeerostering.Employee employee,
			java.time.LocalDate date, java.lang.String type,
			java.time.LocalTime startTime, java.time.LocalTime endTime) {
		this.employee = employee;
		this.date = date;
		this.type = type;
		this.startTime = startTime;
		this.endTime = endTime;
	}

}