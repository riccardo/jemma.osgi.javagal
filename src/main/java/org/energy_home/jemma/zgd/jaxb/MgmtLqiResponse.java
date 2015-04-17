/**
 * This file is part of JEMMA - http://jemma.energy-home.org
 * (C) Copyright 2013 Telecom Italia (http://www.telecomitalia.it)
 *
 * JEMMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) version 3
 * or later as published by the Free Software Foundation, which accompanies
 * this distribution and is available at http://www.gnu.org/licenses/lgpl.html
 *
 * JEMMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License (LGPL) for more details.
 *
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 05:23:14 PM CEST 
//


package org.energy_home.jemma.zgd.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MgmtLqiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MgmtLqiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="NeighborTableEntries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="NeighborTableListCount" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="NeighborTableList" type="{http://www.zigbee.org/GWGSchema}Neighbor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MgmtLqiResponse", propOrder = {
    "status",
    "neighborTableEntries",
    "startIndex",
    "neighborTableListCount",
    "neighborTableList"
})
public class MgmtLqiResponse implements Serializable{

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "unsignedShort")
    protected int status;
    @XmlElement(name = "NeighborTableEntries")
    @XmlSchemaType(name = "unsignedByte")
    protected short neighborTableEntries;
    @XmlElement(name = "StartIndex")
    @XmlSchemaType(name = "unsignedByte")
    protected short startIndex;
    @XmlElement(name = "NeighborTableListCount")
    @XmlSchemaType(name = "unsignedByte")
    protected short neighborTableListCount;
    @XmlElement(name = "NeighborTableList")
    protected List<Neighbor> neighborTableList;

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the neighborTableEntries property.
     * 
     */
    public short getNeighborTableEntries() {
        return neighborTableEntries;
    }

    /**
     * Sets the value of the neighborTableEntries property.
     * 
     */
    public void setNeighborTableEntries(short value) {
        this.neighborTableEntries = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public short getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(short value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the neighborTableListCount property.
     * 
     */
    public short getNeighborTableListCount() {
        return neighborTableListCount;
    }

    /**
     * Sets the value of the neighborTableListCount property.
     * 
     */
    public void setNeighborTableListCount(short value) {
        this.neighborTableListCount = value;
    }

    /**
     * Gets the value of the neighborTableList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neighborTableList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeighborTableList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Neighbor }
     * 
     * 
     */
    public List<Neighbor> getNeighborTableList() {
        if (neighborTableList == null) {
            neighborTableList = new ArrayList<Neighbor>();
        }
        return this.neighborTableList;
    }

}
