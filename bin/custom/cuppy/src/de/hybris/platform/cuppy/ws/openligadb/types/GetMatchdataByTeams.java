//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.23 at 07:13:05 PM CEST 
//


package de.hybris.platform.cuppy.ws.openligadb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="teamID1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="teamID2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder =
{ "teamID1", "teamID2" })
@XmlRootElement(name = "GetMatchdataByTeams")
@SuppressWarnings("PMD")
public class GetMatchdataByTeams
{

	protected int teamID1;
	protected int teamID2;

	/**
	 * Gets the value of the teamID1 property.
	 * 
	 */
	public int getTeamID1()
	{
		return teamID1;
	}

	/**
	 * Sets the value of the teamID1 property.
	 * 
	 */
	public void setTeamID1(final int value)
	{
		this.teamID1 = value;
	}

	/**
	 * Gets the value of the teamID2 property.
	 * 
	 */
	public int getTeamID2()
	{
		return teamID2;
	}

	/**
	 * Sets the value of the teamID2 property.
	 * 
	 */
	public void setTeamID2(final int value)
	{
		this.teamID2 = value;
	}

}
