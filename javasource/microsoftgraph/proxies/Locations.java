// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class Locations
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject locationsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.Locations";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IsRequired("IsRequired"),
		SuggestLocation("SuggestLocation"),
		Locations_Message("MicrosoftGraph.Locations_Message");

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

	public Locations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.Locations"));
	}

	protected Locations(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject locationsMendixObject)
	{
		if (locationsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.Locations", locationsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.Locations");

		this.locationsMendixObject = locationsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Locations.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.Locations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.Locations.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.Locations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.Locations(context, mendixObject);
	}

	public static microsoftgraph.proxies.Locations load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.Locations.initialize(context, mendixObject);
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
	 * @return value of IsRequired
	 */
	public final java.lang.Boolean getIsRequired()
	{
		return getIsRequired(getContext());
	}

	/**
	 * @param context
	 * @return value of IsRequired
	 */
	public final java.lang.Boolean getIsRequired(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsRequired.toString());
	}

	/**
	 * Set value of IsRequired
	 * @param isrequired
	 */
	public final void setIsRequired(java.lang.Boolean isrequired)
	{
		setIsRequired(getContext(), isrequired);
	}

	/**
	 * Set value of IsRequired
	 * @param context
	 * @param isrequired
	 */
	public final void setIsRequired(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isrequired)
	{
		getMendixObject().setValue(context, MemberNames.IsRequired.toString(), isrequired);
	}

	/**
	 * @return value of SuggestLocation
	 */
	public final java.lang.Boolean getSuggestLocation()
	{
		return getSuggestLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of SuggestLocation
	 */
	public final java.lang.Boolean getSuggestLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SuggestLocation.toString());
	}

	/**
	 * Set value of SuggestLocation
	 * @param suggestlocation
	 */
	public final void setSuggestLocation(java.lang.Boolean suggestlocation)
	{
		setSuggestLocation(getContext(), suggestlocation);
	}

	/**
	 * Set value of SuggestLocation
	 * @param context
	 * @param suggestlocation
	 */
	public final void setSuggestLocation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean suggestlocation)
	{
		getMendixObject().setValue(context, MemberNames.SuggestLocation.toString(), suggestlocation);
	}

	/**
	 * @return value of Locations_Message
	 */
	public final microsoftgraph.proxies.Message getLocations_Message() throws com.mendix.core.CoreException
	{
		return getLocations_Message(getContext());
	}

	/**
	 * @param context
	 * @return value of Locations_Message
	 */
	public final microsoftgraph.proxies.Message getLocations_Message(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Message result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Locations_Message.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Message.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Locations_Message
	 * @param locations_message
	 */
	public final void setLocations_Message(microsoftgraph.proxies.Message locations_message)
	{
		setLocations_Message(getContext(), locations_message);
	}

	/**
	 * Set value of Locations_Message
	 * @param context
	 * @param locations_message
	 */
	public final void setLocations_Message(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Message locations_message)
	{
		if (locations_message == null)
			getMendixObject().setValue(context, MemberNames.Locations_Message.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Locations_Message.toString(), locations_message.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return locationsMendixObject;
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
			final microsoftgraph.proxies.Locations that = (microsoftgraph.proxies.Locations) obj;
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
		return "MicrosoftGraph.Locations";
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
