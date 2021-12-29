// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class LobbyBypassSettings
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject lobbyBypassSettingsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.LobbyBypassSettings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Scope("Scope"),
		IsDialInBypassEnabled("IsDialInBypassEnabled"),
		LobbyBypassSettings_OnlineMeeting("MicrosoftGraph.LobbyBypassSettings_OnlineMeeting");

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

	public LobbyBypassSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.LobbyBypassSettings"));
	}

	protected LobbyBypassSettings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject lobbyBypassSettingsMendixObject)
	{
		if (lobbyBypassSettingsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.LobbyBypassSettings", lobbyBypassSettingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.LobbyBypassSettings");

		this.lobbyBypassSettingsMendixObject = lobbyBypassSettingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LobbyBypassSettings.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.LobbyBypassSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.LobbyBypassSettings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.LobbyBypassSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.LobbyBypassSettings(context, mendixObject);
	}

	public static microsoftgraph.proxies.LobbyBypassSettings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.LobbyBypassSettings.initialize(context, mendixObject);
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
	 * @return value of Scope
	 */
	public final java.lang.String getScope()
	{
		return getScope(getContext());
	}

	/**
	 * @param context
	 * @return value of Scope
	 */
	public final java.lang.String getScope(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Scope.toString());
	}

	/**
	 * Set value of Scope
	 * @param scope
	 */
	public final void setScope(java.lang.String scope)
	{
		setScope(getContext(), scope);
	}

	/**
	 * Set value of Scope
	 * @param context
	 * @param scope
	 */
	public final void setScope(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String scope)
	{
		getMendixObject().setValue(context, MemberNames.Scope.toString(), scope);
	}

	/**
	 * @return value of IsDialInBypassEnabled
	 */
	public final java.lang.Boolean getIsDialInBypassEnabled()
	{
		return getIsDialInBypassEnabled(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDialInBypassEnabled
	 */
	public final java.lang.Boolean getIsDialInBypassEnabled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsDialInBypassEnabled.toString());
	}

	/**
	 * Set value of IsDialInBypassEnabled
	 * @param isdialinbypassenabled
	 */
	public final void setIsDialInBypassEnabled(java.lang.Boolean isdialinbypassenabled)
	{
		setIsDialInBypassEnabled(getContext(), isdialinbypassenabled);
	}

	/**
	 * Set value of IsDialInBypassEnabled
	 * @param context
	 * @param isdialinbypassenabled
	 */
	public final void setIsDialInBypassEnabled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdialinbypassenabled)
	{
		getMendixObject().setValue(context, MemberNames.IsDialInBypassEnabled.toString(), isdialinbypassenabled);
	}

	/**
	 * @return value of LobbyBypassSettings_OnlineMeeting
	 */
	public final microsoftgraph.proxies.OnlineMeeting getLobbyBypassSettings_OnlineMeeting() throws com.mendix.core.CoreException
	{
		return getLobbyBypassSettings_OnlineMeeting(getContext());
	}

	/**
	 * @param context
	 * @return value of LobbyBypassSettings_OnlineMeeting
	 */
	public final microsoftgraph.proxies.OnlineMeeting getLobbyBypassSettings_OnlineMeeting(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.OnlineMeeting result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LobbyBypassSettings_OnlineMeeting.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.OnlineMeeting.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LobbyBypassSettings_OnlineMeeting
	 * @param lobbybypasssettings_onlinemeeting
	 */
	public final void setLobbyBypassSettings_OnlineMeeting(microsoftgraph.proxies.OnlineMeeting lobbybypasssettings_onlinemeeting)
	{
		setLobbyBypassSettings_OnlineMeeting(getContext(), lobbybypasssettings_onlinemeeting);
	}

	/**
	 * Set value of LobbyBypassSettings_OnlineMeeting
	 * @param context
	 * @param lobbybypasssettings_onlinemeeting
	 */
	public final void setLobbyBypassSettings_OnlineMeeting(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.OnlineMeeting lobbybypasssettings_onlinemeeting)
	{
		if (lobbybypasssettings_onlinemeeting == null)
			getMendixObject().setValue(context, MemberNames.LobbyBypassSettings_OnlineMeeting.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LobbyBypassSettings_OnlineMeeting.toString(), lobbybypasssettings_onlinemeeting.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return lobbyBypassSettingsMendixObject;
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
			final microsoftgraph.proxies.LobbyBypassSettings that = (microsoftgraph.proxies.LobbyBypassSettings) obj;
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
		return "MicrosoftGraph.LobbyBypassSettings";
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
