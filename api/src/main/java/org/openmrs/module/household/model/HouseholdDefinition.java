/**
 * 
 */
package org.openmrs.module.household.model;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Program;


/**
 * @author Ampath Developers
 *
 */
public class HouseholdDefinition extends BaseOpenmrsData{

	private Integer id;
	private String householdDefinitionsCode;
	private String householdDefinitionsCodeinfull;
	private String householdDefinitionsDescription;
	private Program program;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the householdDefinitionsCode
	 */
	public String getHouseholdDefinitionsCode() {
		return householdDefinitionsCode;
	}
	/**
	 * @param householdDefinitionsCode the householdDefinitionsCode to set
	 */
	public void setHouseholdDefinitionsCode(String householdDefinitionsCode) {
		this.householdDefinitionsCode = householdDefinitionsCode;
	}
	/**
	 * @return the householdDefinitionsCodeinfull
	 */
	public String getHouseholdDefinitionsCodeinfull() {
		return householdDefinitionsCodeinfull;
	}
	/**
	 * @param householdDefinitionsCodeinfull the householdDefinitionsCodeinfull to set
	 */
	public void setHouseholdDefinitionsCodeinfull(
			String householdDefinitionsCodeinfull) {
		this.householdDefinitionsCodeinfull = householdDefinitionsCodeinfull;
	}
	/**
	 * @return the householdDefinitionsDescription
	 */
	public String getHouseholdDefinitionsDescription() {
		return householdDefinitionsDescription;
	}
	/**
	 * @param householdDefinitionsDescription the householdDefinitionsDescription to set
	 */
	public void setHouseholdDefinitionsDescription(
			String householdDefinitionsDescription) {
		this.householdDefinitionsDescription = householdDefinitionsDescription;
	}
	/**
	 * @return the program
	 */
	public Program getProgram() {
		return program;
	}
	/**
	 * @param program the program to set
	 */
	public void setProgram(Program program) {
		this.program = program;
	}
	
}
