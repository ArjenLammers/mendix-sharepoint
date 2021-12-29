// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class Participant extends microsoftgraph.proxies.User
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.Participant";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DisplayName("DisplayName"),
		GivenName("GivenName"),
		JobTitle("JobTitle"),
		Mail("Mail"),
		MobilePhone("MobilePhone"),
		OfficeLocation("OfficeLocation"),
		PreferredLanguage("PreferredLanguage"),
		Surname("Surname"),
		UserPrincipalName("UserPrincipalName"),
		_odata_context("_odata_context"),
		_odata_type("_odata_type"),
		_id("_id"),
		User_Identity("MicrosoftGraph.User_Identity"),
		BusinessPhones_User("MicrosoftGraph.BusinessPhones_User"),
		User_Request("MicrosoftGraph.User_Request");

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

	public Participant(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.Participant"));
	}

	protected Participant(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject participantMendixObject)
	{
		super(context, participantMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.Participant", participantMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.Participant");
	}

	/**
	 * @deprecated Use 'Participant.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.Participant initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.Participant.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.Participant initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.Participant(context, mendixObject);
	}

	public static microsoftgraph.proxies.Participant load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.Participant.initialize(context, mendixObject);
	}

	/**
	 * @return value of User_Identity
	 */
	public final microsoftgraph.proxies.Identity getUser_Identity() throws com.mendix.core.CoreException
	{
		return getUser_Identity(getContext());
	}

	/**
	 * @param context
	 * @return value of User_Identity
	 */
	public final microsoftgraph.proxies.Identity getUser_Identity(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Identity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.User_Identity.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Identity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of User_Identity
	 * @param user_identity
	 */
	public final void setUser_Identity(microsoftgraph.proxies.Identity user_identity)
	{
		setUser_Identity(getContext(), user_identity);
	}

	/**
	 * Set value of User_Identity
	 * @param context
	 * @param user_identity
	 */
	public final void setUser_Identity(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Identity user_identity)
	{
		if (user_identity == null)
			getMendixObject().setValue(context, MemberNames.User_Identity.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.User_Identity.toString(), user_identity.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final microsoftgraph.proxies.Participant that = (microsoftgraph.proxies.Participant) obj;
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
		return "MicrosoftGraph.Participant";
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