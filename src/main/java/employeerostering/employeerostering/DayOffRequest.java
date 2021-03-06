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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;


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
    @com.thoughtworks.xstream.annotations.XStreamConverter(org.kie.soup.commons.xstream.LocalDateTimeXStreamConverter.class)
    @JsonSerialize(using=LocalDateSerializer.class)
    @JsonDeserialize(using=LocalDateDeserializer.class)
    @JsonFormat(shape = Shape.STRING)	private java.time.LocalDate date;

	private java.lang.String type;
    @com.thoughtworks.xstream.annotations.XStreamConverter(org.kie.soup.commons.xstream.LocalDateTimeXStreamConverter.class)
    @JsonSerialize(using=LocalTimeSerializer.class)
    @JsonDeserialize(using=LocalTimeDeserializer.class)
    @JsonFormat(shape = Shape.STRING)
	private java.time.LocalTime startTime;
    @com.thoughtworks.xstream.annotations.XStreamConverter(org.kie.soup.commons.xstream.LocalDateTimeXStreamConverter.class)
    @JsonSerialize(using=LocalTimeSerializer.class)
    @JsonDeserialize(using=LocalTimeDeserializer.class)
    @JsonFormat(shape = Shape.STRING)
	private java.time.LocalTime endTime;

	private long timeOffHrs;

	private int empId;

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

	public long getTimeOffHrs() {

        if( this.startTime != null && this.endTime != null ){
            this.timeOffHrs = java.time.temporal.ChronoUnit.HOURS.between(
				this.startTime, this.endTime);
        }else {
            this.timeOffHrs = 0;
        }
		
		return this.timeOffHrs;
	}

	public void setTimeOffHrs(long timeOffHrs) {
		this.timeOffHrs = timeOffHrs;
	}

	public DayOffRequest(java.time.LocalDate date, java.lang.String type,
			java.time.LocalTime startTime, java.time.LocalTime endTime) {
		this.date = date;
		this.type = type;
		this.startTime = startTime;
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
	
	public DayOffRequest(
			java.time.LocalDate date, java.lang.String type,
			java.time.LocalTime startTime, java.time.LocalTime endTime,
			long timeOffHrs, int empId) {
		this.employee = employee;
		this.date = date;
		this.type = type;
		this.startTime = startTime;
		this.endTime = endTime;
		this.timeOffHrs = timeOffHrs;
		this.empId = empId;
	}
	public DayOffRequest(
			java.time.LocalDate date, java.lang.String type,
			java.time.LocalTime startTime, java.time.LocalTime endTime,
			 int empId) {
		this.employee = employee;
		this.date = date;
		this.type = type;
		this.startTime = startTime;
		this.endTime = endTime;
		this.empId = empId;
	}
	public DayOffRequest(java.time.LocalDate date, java.lang.String type, int empId) {
		this.date = date;
		this.type = type;
		this.empId = empId;
	}
	public DayOffRequest(java.time.LocalDate date, java.lang.String type) {
		this.date = date;
		this.type = type;
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public DayOffRequest(employeerostering.employeerostering.Employee employee,
			java.time.LocalDate date, java.lang.String type,
			java.time.LocalTime startTime, java.time.LocalTime endTime,
			long timeOffHrs, int empId) {
		this.employee = employee;
		this.date = date;
		this.type = type;
		this.startTime = startTime;
		this.endTime = endTime;
		this.timeOffHrs = timeOffHrs;
		this.empId = empId;
	}

}