//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.23 at 07:13:05 PM CEST 
//


package de.hybris.platform.cuppy.ws.openligadb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Spieltag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Liga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Saison" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Userkennung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
{ "spieltag", "liga", "saison", "userkennung" })
@XmlRootElement(name = "GetFusballdaten")
@SuppressWarnings("PMD")
public class GetFusballdaten
{

	@XmlElement(name = "Spieltag")
	protected int spieltag;
	@XmlElement(name = "Liga")
	protected String liga;
	@XmlElement(name = "Saison")
	protected int saison;
	@XmlElement(name = "Userkennung")
	protected String userkennung;

	/**
	 * Gets the value of the spieltag property.
	 * 
	 */
	public int getSpieltag()
	{
		return spieltag;
	}

	/**
	 * Sets the value of the spieltag property.
	 * 
	 */
	public void setSpieltag(final int value)
	{
		this.spieltag = value;
	}

	/**
	 * Gets the value of the liga property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLiga()
	{
		return liga;
	}

	/**
	 * Sets the value of the liga property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setLiga(final String value)
	{
		this.liga = value;
	}

	/**
	 * Gets the value of the saison property.
	 * 
	 */
	public int getSaison()
	{
		return saison;
	}

	/**
	 * Sets the value of the saison property.
	 * 
	 */
	public void setSaison(final int value)
	{
		this.saison = value;
	}

	/**
	 * Gets the value of the userkennung property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserkennung()
	{
		return userkennung;
	}

	/**
	 * Sets the value of the userkennung property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setUserkennung(final String value)
	{
		this.userkennung = value;
	}

}
