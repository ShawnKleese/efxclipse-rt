/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.formats.svg.svg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pattern Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.formats.svg.svg.SvgPackage#getPatternUnits()
 * @model
 * @generated
 */
public enum PatternUnits implements Enumerator {
	/**
	 * The '<em><b>User Space On Use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_SPACE_ON_USE_VALUE
	 * @generated
	 * @ordered
	 */
	USER_SPACE_ON_USE(0, "userSpaceOnUse", "userSpaceOnUse"),

	/**
	 * The '<em><b>Object Bounding Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_BOUNDING_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT_BOUNDING_BOX(1, "objectBoundingBox", "objectBoundingBox");

	/**
	 * The '<em><b>User Space On Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>User Space On Use</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_SPACE_ON_USE
	 * @model name="userSpaceOnUse"
	 * @generated
	 * @ordered
	 */
	public static final int USER_SPACE_ON_USE_VALUE = 0;

	/**
	 * The '<em><b>Object Bounding Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Bounding Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT_BOUNDING_BOX
	 * @model name="objectBoundingBox"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_BOUNDING_BOX_VALUE = 1;

	/**
	 * An array of all the '<em><b>Pattern Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PatternUnits[] VALUES_ARRAY =
		new PatternUnits[] {
			USER_SPACE_ON_USE,
			OBJECT_BOUNDING_BOX,
		};

	/**
	 * A public read-only list of all the '<em><b>Pattern Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PatternUnits> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pattern Units</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatternUnits get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatternUnits result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pattern Units</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatternUnits getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatternUnits result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pattern Units</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatternUnits get(int value) {
		switch (value) {
			case USER_SPACE_ON_USE_VALUE: return USER_SPACE_ON_USE;
			case OBJECT_BOUNDING_BOX_VALUE: return OBJECT_BOUNDING_BOX;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PatternUnits(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PatternUnits
