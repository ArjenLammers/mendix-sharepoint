// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class Identity
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject identityMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.Identity";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Identity_MeetingParticipantInfo("MicrosoftGraph.Identity_MeetingParticipantInfo"),
		Identity_MeetingOrganizer("MicrosoftGraph.Identity_MeetingOrganizer"),
		User_Identity("MicrosoftGraph.User_Identity");

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

	public Identity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.Identity"));
	}

	protected Identity(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject identityMendixObject)
	{
		if (identityMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.Identity", identityMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.Identity");

		this.identityMendixObject = identityMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Identity.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.Identity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.Identity.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.Identity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.Identity(context, mendixObject);
	}

	public static microsoftgraph.proxies.Identity load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.Identity.initialize(context, mendixObject);
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
	 * @return value of Identity_MeetingParticipantInfo
	 */
	public final microsoftgraph.proxies.MeetingParticipantInfo getIdentity_MeetingParticipantInfo() throws com.mendix.core.CoreException
	{
		return getIdentity_MeetingParticipantInfo(getContext());
	}

	/**
	 * @param context
	 * @return value of Identity_MeetingParticipantInfo
	 */
	public final microsoftgraph.proxies.MeetingParticipantInfo getIdentity_MeetingParticipantInfo(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.MeetingParticipantInfo result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Identity_MeetingParticipantInfo.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.MeetingParticipantInfo.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Identity_MeetingParticipantInfo
	 * @param identity_meetingparticipantinfo
	 */
	public final void setIdentity_MeetingParticipantInfo(microsoftgraph.proxies.MeetingParticipantInfo identity_meetingparticipantinfo)
	{
		setIdentity_MeetingParticipantInfo(getContext(), identity_meetingparticipantinfo);
	}

	/**
	 * Set value of Identity_MeetingParticipantInfo
	 * @param context
	 * @param identity_meetingparticipantinfo
	 */
	public final void setIdentity_MeetingParticipantInfo(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.MeetingParticipantInfo identity_meetingparticipantinfo)
	{
		if (identity_meetingparticipantinfo == null)
			getMendixObject().setValue(context, MemberNames.Identity_MeetingParticipantInfo.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Identity_MeetingParticipantInfo.toString(), identity_meetingparticipantinfo.getMendixObject().getId());
	}

	/**
	 * @return value of Identity_MeetingOrganizer
	 */
	public final microsoftgraph.proxies.MeetingOrganizer getIdentity_MeetingOrganizer() throws com.mendix.core.CoreException
	{
		return getIdentity_MeetingOrganizer(getContext());
	}

	/**
	 * @param context
	 * @return value of Identity_MeetingOrganizer
	 */
	public final microsoftgraph.proxies.MeetingOrganizer getIdentity_MeetingOrganizer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.MeetingOrganizer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Identity_MeetingOrganizer.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.MeetingOrganizer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Identity_MeetingOrganizer
	 * @param identity_meetingorganizer
	 */
	public final void setIdentity_MeetingOrganizer(microsoftgraph.proxies.MeetingOrganizer identity_meetingorganizer)
	{
		setIdentity_MeetingOrganizer(getContext(), identity_meetingorganizer);
	}

	/**
	 * Set value of Identity_MeetingOrganizer
	 * @param context
	 * @param identity_meetingorganizer
	 */
	public final void setIdentity_MeetingOrganizer(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.MeetingOrganizer identity_meetingorganizer)
	{
		if (identity_meetingorganizer == null)
			getMendixObject().setValue(context, MemberNames.Identity_MeetingOrganizer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Identity_MeetingOrganizer.toString(), identity_meetingorganizer.getMendixObject().getId());
	}

	/**
	 * @return value of User_Identity
	 */
	public final microsoftgraph.proxies.Participant getUser_Identity() throws com.mendix.core.CoreException
	{
		return getUser_Identity(getContext());
	}

	/**
	 * @param context
	 * @return value of User_Identity
	 */
	public final microsoftgraph.proxies.Participant getUser_Identity(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Participant result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.User_Identity.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Participant.load(context, identifier);
		return result;
	}

	/**
	 * Set value of User_Identity
	 * @param user_identity
	 */
	public final void setUser_Identity(microsoftgraph.proxies.Participant user_identity)
	{
		setUser_Identity(getContext(), user_identity);
	}

	/**
	 * Set value of User_Identity
	 * @param context
	 * @param user_identity
	 */
	public final void setUser_Identity(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Participant user_identity)
	{
		if (user_identity == null)
			getMendixObject().setValue(context, MemberNames.User_Identity.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.User_Identity.toString(), user_identity.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return identityMendixObject;
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
			final microsoftgraph.proxies.Identity that = (microsoftgraph.proxies.Identity) obj;
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
		return "MicrosoftGraph.Identity";
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
