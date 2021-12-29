// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class MeetingParticipantInfo
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject meetingParticipantInfoMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.MeetingParticipantInfo";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_odata_type("_odata_type"),
		Upn("Upn"),
		Role("Role"),
		MeetingParticipantInfo_Attendees("MicrosoftGraph.MeetingParticipantInfo_Attendees"),
		Identity_MeetingParticipantInfo("MicrosoftGraph.Identity_MeetingParticipantInfo");

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

	public MeetingParticipantInfo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.MeetingParticipantInfo"));
	}

	protected MeetingParticipantInfo(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject meetingParticipantInfoMendixObject)
	{
		if (meetingParticipantInfoMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.MeetingParticipantInfo", meetingParticipantInfoMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.MeetingParticipantInfo");

		this.meetingParticipantInfoMendixObject = meetingParticipantInfoMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MeetingParticipantInfo.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.MeetingParticipantInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.MeetingParticipantInfo.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.MeetingParticipantInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.MeetingParticipantInfo(context, mendixObject);
	}

	public static microsoftgraph.proxies.MeetingParticipantInfo load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.MeetingParticipantInfo.initialize(context, mendixObject);
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
	 * Set value of Role
	 * @param role
	 */
	public final microsoftgraph.proxies.ENUM_OnlineMeetingRole getRole()
	{
		return getRole(getContext());
	}

	/**
	 * @param context
	 * @return value of Role
	 */
	public final microsoftgraph.proxies.ENUM_OnlineMeetingRole getRole(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Role.toString());
		if (obj == null)
			return null;

		return microsoftgraph.proxies.ENUM_OnlineMeetingRole.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Role
	 * @param role
	 */
	public final void setRole(microsoftgraph.proxies.ENUM_OnlineMeetingRole role)
	{
		setRole(getContext(), role);
	}

	/**
	 * Set value of Role
	 * @param context
	 * @param role
	 */
	public final void setRole(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.ENUM_OnlineMeetingRole role)
	{
		if (role != null)
			getMendixObject().setValue(context, MemberNames.Role.toString(), role.toString());
		else
			getMendixObject().setValue(context, MemberNames.Role.toString(), null);
	}

	/**
	 * @return value of MeetingParticipantInfo_Attendees
	 */
	public final microsoftgraph.proxies.Attendees getMeetingParticipantInfo_Attendees() throws com.mendix.core.CoreException
	{
		return getMeetingParticipantInfo_Attendees(getContext());
	}

	/**
	 * @param context
	 * @return value of MeetingParticipantInfo_Attendees
	 */
	public final microsoftgraph.proxies.Attendees getMeetingParticipantInfo_Attendees(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Attendees result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MeetingParticipantInfo_Attendees.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Attendees.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MeetingParticipantInfo_Attendees
	 * @param meetingparticipantinfo_attendees
	 */
	public final void setMeetingParticipantInfo_Attendees(microsoftgraph.proxies.Attendees meetingparticipantinfo_attendees)
	{
		setMeetingParticipantInfo_Attendees(getContext(), meetingparticipantinfo_attendees);
	}

	/**
	 * Set value of MeetingParticipantInfo_Attendees
	 * @param context
	 * @param meetingparticipantinfo_attendees
	 */
	public final void setMeetingParticipantInfo_Attendees(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Attendees meetingparticipantinfo_attendees)
	{
		if (meetingparticipantinfo_attendees == null)
			getMendixObject().setValue(context, MemberNames.MeetingParticipantInfo_Attendees.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MeetingParticipantInfo_Attendees.toString(), meetingparticipantinfo_attendees.getMendixObject().getId());
	}

	/**
	 * @return value of Identity_MeetingParticipantInfo
	 */
	public final microsoftgraph.proxies.Identity getIdentity_MeetingParticipantInfo() throws com.mendix.core.CoreException
	{
		return getIdentity_MeetingParticipantInfo(getContext());
	}

	/**
	 * @param context
	 * @return value of Identity_MeetingParticipantInfo
	 */
	public final microsoftgraph.proxies.Identity getIdentity_MeetingParticipantInfo(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Identity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Identity_MeetingParticipantInfo.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Identity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Identity_MeetingParticipantInfo
	 * @param identity_meetingparticipantinfo
	 */
	public final void setIdentity_MeetingParticipantInfo(microsoftgraph.proxies.Identity identity_meetingparticipantinfo)
	{
		setIdentity_MeetingParticipantInfo(getContext(), identity_meetingparticipantinfo);
	}

	/**
	 * Set value of Identity_MeetingParticipantInfo
	 * @param context
	 * @param identity_meetingparticipantinfo
	 */
	public final void setIdentity_MeetingParticipantInfo(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Identity identity_meetingparticipantinfo)
	{
		if (identity_meetingparticipantinfo == null)
			getMendixObject().setValue(context, MemberNames.Identity_MeetingParticipantInfo.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Identity_MeetingParticipantInfo.toString(), identity_meetingparticipantinfo.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return meetingParticipantInfoMendixObject;
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
			final microsoftgraph.proxies.MeetingParticipantInfo that = (microsoftgraph.proxies.MeetingParticipantInfo) obj;
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
		return "MicrosoftGraph.MeetingParticipantInfo";
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
