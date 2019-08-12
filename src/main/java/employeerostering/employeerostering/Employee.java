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

@com.thoughtworks.xstream.annotations.XStreamAlias("Employee")
public class Employee implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.util.List<employeerostering.employeerostering.Skill> skills;

	private employeerostering.employeerostering.DayOffRequest dayOffRequest;

	private int id;

	public Employee() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.util.List<employeerostering.employeerostering.Skill> getSkills() {
		return this.skills;
	}

	public void setSkills(
			java.util.List<employeerostering.employeerostering.Skill> skills) {
		this.skills = skills;
	}

	public employeerostering.employeerostering.DayOffRequest getDayOffRequest() {
		return this.dayOffRequest;
	}

	public void setDayOffRequest(
			employeerostering.employeerostering.DayOffRequest dayOffRequest) {
		this.dayOffRequest = dayOffRequest;
	}

	public Employee(java.lang.String name,
			java.util.List<employeerostering.employeerostering.Skill> skills) {
		this.name = name;
		this.skills = skills;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(java.lang.String name,
			java.util.List<employeerostering.employeerostering.Skill> skills,
			employeerostering.employeerostering.DayOffRequest dayOffRequest,
			int id) {
		this.name = name;
		this.skills = skills;
		this.dayOffRequest = dayOffRequest;
		this.id = id;
	}
	

	public Employee(java.lang.String name,
			java.util.List<employeerostering.employeerostering.Skill> skills,
			int id) {
		this.name = name;
		this.skills = skills;
		this.id = id;
	}
	
}