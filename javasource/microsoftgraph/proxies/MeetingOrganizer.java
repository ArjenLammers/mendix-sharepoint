// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class MeetingOrganizer
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject meetingOrganizerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.MeetingOrganizer";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_odata_type("_odata_type"),
		Upn("Upn"),
		MeetingOrganizer_MeetingParticipants("MicrosoftGraph.MeetingOrganizer_MeetingParticipants"),
		Identity_MeetingOrganizer("MicrosoftGraph.Identity_MeetingOrganizer");

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

	public MeetingOrganizer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.MeetingOrganizer"));
	}

	protected MeetingOrganizer(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject meetingOrganizerMendixObject)
	{
		if (meetingOrganizerMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.MeetingOrganizer", meetingOrganizerMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.MeetingOrganizer");

		this.meetingOrganizerMendixObject = meetingOrganizerMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MeetingOrganizer.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.MeetingOrganizer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.MeetingOrganizer.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.MeetingOrganizer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.MeetingOrganizer(context, mendixObject);
	}

	public static microsoftgraph.proxies.MeetingOrganizer load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.MeetingOrganizer.initialize(context, mendixObject);
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
	 * @return value of _odata_type
	 */
	public final java.lang.String get_odata_type()
	{
		return get_odata_type(getContext());
	}

	/**
	 * @param context
	 * @return value of _odata_type
	 */
	public final java.lang.String get_odata_type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._odata_type.toString());
	}

	/**
	 * Set value of _odata_type
	 * @param _odata_type
	 */
	public final void set_odata_type(java.lang.String _odata_type)
	{
		set_odata_type(getContext(), _odata_type);
	}

	/**
	 * Set value of _odata_type
	 * @param context
	 * @param _odata_type
	 */
	public final void set_odata_type(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _odata_type)
	{
		getMendixObject().setValue(context, MemberNames._odata_type.toString(), _odata_type);
	}

	/**
	 * @return value of Upn
	 */
	public final java.lang.String getUpn()
	{
		return getUpn(getContext());
	}

	/**
	 * @param context
	 * @return value of Upn
	 */
	public final java.lang.String getUpn(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Upn.toString());
	}

	/**
	 * Set value of Upn
	 * @param upn
	 */
	public final void setUpn(java.lang.String upn)
	{
		setUpn(getContext(), upn);
	}

	/**
	 * Set value of Upn
	 * @param context
	 * @param upn
	 */
	public final void setUpn(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String upn)
	{
		getMendixObject().setValue(context, MemberNames.Upn.toString(), upn);
	}

	/**
	 * @return value of MeetingOrganizer_MeetingParticipants
	 */
	public final microsoftgraph.proxies.MeetingParticipants getMeetingOrganizer_MeetingParticipants() throws com.mendix.core.CoreException
	{
		return getMeetingOrganizer_MeetingParticipants(getContext());
	}

	/**
	 * @param context
	 * @return value of MeetingOrganizer_MeetingParticipants
	 */
	public final microsoftgraph.proxies.MeetingParticipants getMeetingOrganizer_MeetingParticipants(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.MeetingParticipants result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MeetingOrganizer_MeetingParticipants.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.MeetingParticipants.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MeetingOrganizer_MeetingParticipants
	 * @param meetingorganizer_meetingparticipants
	 */
	public final void setMeetingOrganizer_MeetingParticipants(microsoftgraph.proxies.MeetingParticipants meetingorganizer_meetingparticipants)
	{
		setMeetingOrganizer_MeetingParticipants(getContext(), meetingorganizer_meetingparticipants);
	}

	/**
	 * Set value of MeetingOrganizer_MeetingParticipants
	 * @param context
	 * @param meetingorganizer_meetingparticipants
	 */
	public final void setMeetingOrganizer_MeetingParticipants(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.MeetingParticipants meetingorganizer_meetingparticipants)
	{
		if (meetingorganizer_meetingparticipants == null)
			getMendixObject().setValue(context, MemberNames.MeetingOrganizer_MeetingParticipants.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MeetingOrganizer_MeetingParticipants.toString(), meetingorganizer_meetingparticipants.getMendixObject().getId());
	}

	/**
	 * @return value of Identity_MeetingOrganizer
	 */
	public final microsoftgraph.proxies.Identity getIdentity_MeetingOrganizer() throws com.mendix.core.CoreException
	{
		return getIdentity_MeetingOrganizer(getContext());
	}

	/**
	 * @param context
	 * @return value of Identity_MeetingOrganizer
	 */
	public final microsoftgraph.proxies.Identity getIdentity_MeetingOrganizer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Identity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Identity_MeetingOrganizer.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Identity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Identity_MeetingOrganizer
	 * @param identity_meetingorganizer
	 */
	public final void setIdentity_MeetingOrganizer(microsoftgraph.proxies.Identity identity_meetingorganizer)
	{
		setIdentity_MeetingOrganizer(getContext(), identity_meetingorganizer);
	}

	/**
	 * Set value of Identity_MeetingOrganizer
	 * @param context
	 * @param identity_meetingorganizer
	 */
	public final void setIdentity_MeetingOrganizer(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Identity identity_meetingorganizer)
	{
		if (identity_meetingorganizer == null)
			getMendixObject().setValue(context, MemberNames.Identity_MeetingOrganizer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Identity_MeetingOrganizer.toString(), identity_meetingorganizer.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return meetingOrganizerMendixObject;
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
			final microsoftgraph.proxies.MeetingOrganizer that = (microsoftgraph.proxies.MeetingOrganizer) obj;
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
		return "MicrosoftGraph.MeetingOrganizer";
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
