//* Description *//
// Title: Constraint
// Author: Tyler Reed
// Defines an Abstract Constraint

//* Package *//
package ConstraintSatisfaction;

//* Libraries *//

//* Abstract Class *//
public abstract class Constraint
{
	//* Class Variables *//
	protected ConstrainedVariable left;
	protected ConstrainedVariable right;

	//* Constructor *//
	// Creates the Extendable Super Constructor
	public Constraint(ConstrainedVariable left, ConstrainedVariable right)
	{
		this.left = left;
		this.right = right;
	}

	//* Abstract Methods *//
	// Returns whether or not the Constraint is Enforced
	public abstract boolean isEnforced();

	//* Variable Methods *//
	// Returns the Left Variable in the Constraint
	public ConstrainedVariable getLeftVariable()
	{
		return left;
	}

	// Returns the Right Variable in the Constraint
	public ConstrainedVariable getRightVariable()
	{
		return right;
	}

	// Returns whether or not the specified Variable in a Participant in this Constraint
	public boolean isParticipant(ConstrainedVariable variable)
	{
		return variable.equals(left) || variable.equals(right);
	}

	// Returns whether or not Both Variables are Assigned
	public boolean isAssigned()
	{
		return left.isAssigned() && right.isAssigned();
	}

	//* Comparable Methods *//
	// Returns whether or not this Constraint is Equal To the specified Constraint
	public boolean equals(Constraint constraint)
	{
		return left.equals(constraint.left) && right.equals(constraint.right);
	}
}