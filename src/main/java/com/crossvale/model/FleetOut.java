package com.crossvale.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FleetOut implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("targetCapacity")
	private java.lang.Integer targetCapacity;

	@org.kie.api.definition.type.Label(value = "currentCapacity")
	private java.lang.Integer currentCapacity;

	@org.kie.api.definition.type.Label(value = "id")
	private java.lang.String id;

	public FleetOut() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getTargetCapacity() {
		return this.targetCapacity;
	}

	public void setTargetCapacity(java.lang.Integer targetCapacity) {
		this.targetCapacity = targetCapacity;
	}

	public java.lang.Integer getCurrentCapacity() {
		return this.currentCapacity;
	}

	public void setCurrentCapacity(java.lang.Integer currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public FleetOut(java.lang.String name, java.lang.Integer targetCapacity, java.lang.Integer currentCapacity,
			java.lang.String id) {
		this.name = name;
		this.targetCapacity = targetCapacity;
		this.currentCapacity = currentCapacity;
		this.id = id;
	}

}