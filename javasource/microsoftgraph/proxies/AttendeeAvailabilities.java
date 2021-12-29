// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class AttendeeAvailabilities
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject attendeeAvailabilitiesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.AttendeeAvailabilities";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AttendeeAvailabilities_Message("MicrosoftGraph.AttendeeAvailabilities_Message");

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

	public AttendeeAvailabilities(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.AttendeeAvailabilities"));
	}

	protected AttendeeAvailabilities(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject attendeeAvailabilitiesMendixObject)
	{
		if (attendeeAvailabilitiesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.AttendeeAvailabilities", attendeeAvailabilitiesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.AttendeeAvailabilities");

		this.attendeeAvailabilitiesMendixObject = attendeeAvailabilitiesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AttendeeAvailabilities.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.AttendeeAvailabilities initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.AttendeeAvailabilities.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.AttendeeAvailabilities initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.AttendeeAvailabilities(context, mendixObject);
	}

	public static microsoftgraph.proxies.AttendeeAvailabilities load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.AttendeeAvailabilities.initialize(context, mendixObject);
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
	 * @return value of AttendeeAvailabilities_Message
	 */
	public final microsoftgraph.proxies.Message getAttendeeAvailabilities_Message() throws com.mendix.core.CoreException
	{
		return getAttendeeAvailabilities_Message(getContext());
	}

	/**
	 * @param context
	 * @return value of AttendeeAvailabilities_Message
	 */
	public final microsoftgraph.proxies.Message getAttendeeAvailabilities_Message(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Message result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AttendeeAvailabilities_Message.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Message.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AttendeeAvailabilities_Message
	 * @param attendeeavailabilities_message
	 */
	public final void setAttendeeAvailabilities_Message(microsoftgraph.proxies.Message attendeeavailabilities_message)
	{
		setAttendeeAvailabilities_Message(getContext(), attendeeavailabilities_message);
	}

	/**
	 * Set value of AttendeeAvailabilities_Message
	 * @param context
	 * @param attendeeavailabilities_message
	 */
	public final void setAttendeeAvailabilities_Message(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Message attendeeavailabilities_message)
	{
		if (attendeeavailabilities_message == null)
			getMendixObject().setValue(context, MemberNames.AttendeeAvailabilities_Message.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AttendeeAvailabilities_Message.toString(), attendeeavailabilities_message.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return attendeeAvailabilitiesMendixObject;
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
			final microsoftgraph.proxies.AttendeeAvailabilities that = (microsoftgraph.proxies.AttendeeAvailabilities) obj;
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
		return "MicrosoftGraph.AttendeeAvailabilities";
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
