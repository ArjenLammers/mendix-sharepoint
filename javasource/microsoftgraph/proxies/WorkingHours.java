// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class WorkingHours
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workingHoursMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.WorkingHours";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		StartTime("StartTime"),
		EndTime("EndTime"),
		WorkingHours_MailboxSettings("MicrosoftGraph.WorkingHours_MailboxSettings"),
		DaysOfWeek_WorkingHours("MicrosoftGraph.DaysOfWeek_WorkingHours"),
		TimeZone_WorkingHours("MicrosoftGraph.TimeZone_WorkingHours");

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

	public WorkingHours(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.WorkingHours"));
	}

	protected WorkingHours(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workingHoursMendixObject)
	{
		if (workingHoursMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.WorkingHours", workingHoursMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.WorkingHours");

		this.workingHoursMendixObject = workingHoursMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WorkingHours.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.WorkingHours initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.WorkingHours.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.WorkingHours initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.WorkingHours(context, mendixObject);
	}

	public static microsoftgraph.proxies.WorkingHours load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.WorkingHours.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of StartTime
	 */
	public final java.lang.String getStartTime()
	{
		return getStartTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartTime
	 */
	public final java.lang.String getStartTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StartTime.toString());
	}

	/**
	 * Set value of StartTime
	 * @param starttime
	 */
	public final void setStartTime(java.lang.String starttime)
	{
		setStartTime(getContext(), starttime);
	}

	/**
	 * Set value of StartTime
	 * @param context
	 * @param starttime
	 */
	public final void setStartTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String starttime)
	{
		getMendixObject().setValue(context, MemberNames.StartTime.toString(), starttime);
	}

	/**
	 * @return value of EndTime
	 */
	public final java.lang.String getEndTime()
	{
		return getEndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of EndTime
	 */
	public final java.lang.String getEndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EndTime.toString());
	}

	/**
	 * Set value of EndTime
	 * @param endtime
	 */
	public final void setEndTime(java.lang.String endtime)
	{
		setEndTime(getContext(), endtime);
	}

	/**
	 * Set value of EndTime
	 * @param context
	 * @param endtime
	 */
	public final void setEndTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String endtime)
	{
		getMendixObject().setValue(context, MemberNames.EndTime.toString(), endtime);
	}

	/**
	 * @return value of WorkingHours_MailboxSettings
	 */
	public final microsoftgraph.proxies.MailboxSettings getWorkingHours_MailboxSettings() throws com.mendix.core.CoreException
	{
		return getWorkingHours_MailboxSettings(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkingHours_MailboxSettings
	 */
	public final microsoftgraph.proxies.MailboxSettings getWorkingHours_MailboxSettings(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.MailboxSettings result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkingHours_MailboxSettings.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.MailboxSettings.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkingHours_MailboxSettings
	 * @param workinghours_mailboxsettings
	 */
	public final void setWorkingHours_MailboxSettings(microsoftgraph.proxies.MailboxSettings workinghours_mailboxsettings)
	{
		setWorkingHours_MailboxSettings(getContext(), workinghours_mailboxsettings);
	}

	/**
	 * Set value of WorkingHours_MailboxSettings
	 * @param context
	 * @param workinghours_mailboxsettings
	 */
	public final void setWorkingHours_MailboxSettings(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.MailboxSettings workinghours_mailboxsettings)
	{
		if (workinghours_mailboxsettings == null)
			getMendixObject().setValue(context, MemberNames.WorkingHours_MailboxSettings.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkingHours_MailboxSettings.toString(), workinghours_mailboxsettings.getMendixObject().getId());
	}

	/**
	 * @return value of DaysOfWeek_WorkingHours
	 */
	public final microsoftgraph.proxies.DaysOfWeek getDaysOfWeek_WorkingHours() throws com.mendix.core.CoreException
	{
		return getDaysOfWeek_WorkingHours(getContext());
	}

	/**
	 * @param context
	 * @return value of DaysOfWeek_WorkingHours
	 */
	public final microsoftgraph.proxies.DaysOfWeek getDaysOfWeek_WorkingHours(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.DaysOfWeek result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DaysOfWeek_WorkingHours.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.DaysOfWeek.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DaysOfWeek_WorkingHours
	 * @param daysofweek_workinghours
	 */
	public final void setDaysOfWeek_WorkingHours(microsoftgraph.proxies.DaysOfWeek daysofweek_workinghours)
	{
		setDaysOfWeek_WorkingHours(getContext(), daysofweek_workinghours);
	}

	/**
	 * Set value of DaysOfWeek_WorkingHours
	 * @param context
	 * @param daysofweek_workinghours
	 */
	public final void setDaysOfWeek_WorkingHours(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.DaysOfWeek daysofweek_workinghours)
	{
		if (daysofweek_workinghours == null)
			getMendixObject().setValue(context, MemberNames.DaysOfWeek_WorkingHours.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DaysOfWeek_WorkingHours.toString(), daysofweek_workinghours.getMendixObject().getId());
	}

	/**
	 * @return value of TimeZone_WorkingHours
	 */
	public final microsoftgraph.proxies.TimeZone getTimeZone_WorkingHours() throws com.mendix.core.CoreException
	{
		return getTimeZone_WorkingHours(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeZone_WorkingHours
	 */
	public final microsoftgraph.proxies.TimeZone getTimeZone_WorkingHours(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.TimeZone result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TimeZone_WorkingHours.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.TimeZone.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TimeZone_WorkingHours
	 * @param timezone_workinghours
	 */
	public final void setTimeZone_WorkingHours(microsoftgraph.proxies.TimeZone timezone_workinghours)
	{
		setTimeZone_WorkingHours(getContext(), timezone_workinghours);
	}

	/**
	 * Set value of TimeZone_WorkingHours
	 * @param context
	 * @param timezone_workinghours
	 */
	public final void setTimeZone_WorkingHours(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.TimeZone timezone_workinghours)
	{
		if (timezone_workinghours == null)
			getMendixObject().setValue(context, MemberNames.TimeZone_WorkingHours.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TimeZone_WorkingHours.toString(), timezone_workinghours.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workingHoursMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final microsoftgraph.proxies.WorkingHours that = (microsoftgraph.proxies.WorkingHours) obj;
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
		return "MicrosoftGraph.WorkingHours";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}