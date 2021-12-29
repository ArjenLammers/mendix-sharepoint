// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class DaysOfWeek extends microsoftgraph.proxies.NPStringArray
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.DaysOfWeek";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DaysOfWeek_WorkingHours("MicrosoftGraph.DaysOfWeek_WorkingHours");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DaysOfWeek(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.DaysOfWeek"));
	}

	protected DaysOfWeek(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject daysOfWeekMendixObject)
	{
		super(context, daysOfWeekMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.DaysOfWeek", daysOfWeekMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.DaysOfWeek");
	}

	/**
	 * @deprecated Use 'DaysOfWeek.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.DaysOfWeek initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.DaysOfWeek.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.DaysOfWeek initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.DaysOfWeek(context, mendixObject);
	}

	public static microsoftgraph.proxies.DaysOfWeek load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.DaysOfWeek.initialize(context, mendixObject);
	}

	/**
	 * @return value of DaysOfWeek_WorkingHours
	 */
	public final microsoftgraph.proxies.WorkingHours getDaysOfWeek_WorkingHours() throws com.mendix.core.CoreException
	{
		return getDaysOfWeek_WorkingHours(getContext());
	}

	/**
	 * @param context
	 * @return value of DaysOfWeek_WorkingHours
	 */
	public final microsoftgraph.proxies.WorkingHours getDaysOfWeek_WorkingHours(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.WorkingHours result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DaysOfWeek_WorkingHours.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.WorkingHours.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DaysOfWeek_WorkingHours
	 * @param daysofweek_workinghours
	 */
	public final void setDaysOfWeek_WorkingHours(microsoftgraph.proxies.WorkingHours daysofweek_workinghours)
	{
		setDaysOfWeek_WorkingHours(getContext(), daysofweek_workinghours);
	}

	/**
	 * Set value of DaysOfWeek_WorkingHours
	 * @param context
	 * @param daysofweek_workinghours
	 */
	public final void setDaysOfWeek_WorkingHours(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.WorkingHours daysofweek_workinghours)
	{
		if (daysofweek_workinghours == null)
			getMendixObject().setValue(context, MemberNames.DaysOfWeek_WorkingHours.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DaysOfWeek_WorkingHours.toString(), daysofweek_workinghours.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final microsoftgraph.proxies.DaysOfWeek that = (microsoftgraph.proxies.DaysOfWeek) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MicrosoftGraph.DaysOfWeek";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
