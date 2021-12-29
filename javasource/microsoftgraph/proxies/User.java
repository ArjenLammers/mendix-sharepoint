// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class User
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject userMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.User";

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

	public User(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.User"));
	}

	protected User(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject userMendixObject)
	{
		if (userMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.User", userMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.User");

		this.userMendixObject = userMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'User.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.User initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.User.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.User initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("MicrosoftGraph.Participant", mendixObject.getType()))
			return microsoftgraph.proxies.Participant.initialize(context, mendixObject);

		return new microsoftgraph.proxies.User(context, mendixObject);
	}

	public static microsoftgraph.proxies.User load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.User.initialize(context, mendixObject);
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
	 * @return value of DisplayName
	 */
	public final java.lang.String getDisplayName()
	{
		return getDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of DisplayName
	 */
	public final java.lang.String getDisplayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DisplayName.toString());
	}

	/**
	 * Set value of DisplayName
	 * @param displayname
	 */
	public final void setDisplayName(java.lang.String displayname)
	{
		setDisplayName(getContext(), displayname);
	}

	/**
	 * Set value of DisplayName
	 * @param context
	 * @param displayname
	 */
	public final void setDisplayName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String displayname)
	{
		getMendixObject().setValue(context, MemberNames.DisplayName.toString(), displayname);
	}

	/**
	 * @return value of GivenName
	 */
	public final java.lang.String getGivenName()
	{
		return getGivenName(getContext());
	}

	/**
	 * @param context
	 * @return value of GivenName
	 */
	public final java.lang.String getGivenName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.GivenName.toString());
	}

	/**
	 * Set value of GivenName
	 * @param givenname
	 */
	public final void setGivenName(java.lang.String givenname)
	{
		setGivenName(getContext(), givenname);
	}

	/**
	 * Set value of GivenName
	 * @param context
	 * @param givenname
	 */
	public final void setGivenName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String givenname)
	{
		getMendixObject().setValue(context, MemberNames.GivenName.toString(), givenname);
	}

	/**
	 * @return value of JobTitle
	 */
	public final java.lang.String getJobTitle()
	{
		return getJobTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of JobTitle
	 */
	public final java.lang.String getJobTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JobTitle.toString());
	}

	/**
	 * Set value of JobTitle
	 * @param jobtitle
	 */
	public final void setJobTitle(java.lang.String jobtitle)
	{
		setJobTitle(getContext(), jobtitle);
	}

	/**
	 * Set value of JobTitle
	 * @param context
	 * @param jobtitle
	 */
	public final void setJobTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String jobtitle)
	{
		getMendixObject().setValue(context, MemberNames.JobTitle.toString(), jobtitle);
	}

	/**
	 * @return value of Mail
	 */
	public final java.lang.String getMail()
	{
		return getMail(getContext());
	}

	/**
	 * @param context
	 * @return value of Mail
	 */
	public final java.lang.String getMail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Mail.toString());
	}

	/**
	 * Set value of Mail
	 * @param mail
	 */
	public final void setMail(java.lang.String mail)
	{
		setMail(getContext(), mail);
	}

	/**
	 * Set value of Mail
	 * @param context
	 * @param mail
	 */
	public final void setMail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mail)
	{
		getMendixObject().setValue(context, MemberNames.Mail.toString(), mail);
	}

	/**
	 * @return value of MobilePhone
	 */
	public final java.lang.String getMobilePhone()
	{
		return getMobilePhone(getContext());
	}

	/**
	 * @param context
	 * @return value of MobilePhone
	 */
	public final java.lang.String getMobilePhone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MobilePhone.toString());
	}

	/**
	 * Set value of MobilePhone
	 * @param mobilephone
	 */
	public final void setMobilePhone(java.lang.String mobilephone)
	{
		setMobilePhone(getContext(), mobilephone);
	}

	/**
	 * Set value of MobilePhone
	 * @param context
	 * @param mobilephone
	 */
	public final void setMobilePhone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mobilephone)
	{
		getMendixObject().setValue(context, MemberNames.MobilePhone.toString(), mobilephone);
	}

	/**
	 * @return value of OfficeLocation
	 */
	public final java.lang.String getOfficeLocation()
	{
		return getOfficeLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of OfficeLocation
	 */
	public final java.lang.String getOfficeLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OfficeLocation.toString());
	}

	/**
	 * Set value of OfficeLocation
	 * @param officelocation
	 */
	public final void setOfficeLocation(java.lang.String officelocation)
	{
		setOfficeLocation(getContext(), officelocation);
	}

	/**
	 * Set value of OfficeLocation
	 * @param context
	 * @param officelocation
	 */
	public final void setOfficeLocation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String officelocation)
	{
		getMendixObject().setValue(context, MemberNames.OfficeLocation.toString(), officelocation);
	}

	/**
	 * @return value of PreferredLanguage
	 */
	public final java.lang.String getPreferredLanguage()
	{
		return getPreferredLanguage(getContext());
	}

	/**
	 * @param context
	 * @return value of PreferredLanguage
	 */
	public final java.lang.String getPreferredLanguage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PreferredLanguage.toString());
	}

	/**
	 * Set value of PreferredLanguage
	 * @param preferredlanguage
	 */
	public final void setPreferredLanguage(java.lang.String preferredlanguage)
	{
		setPreferredLanguage(getContext(), preferredlanguage);
	}

	/**
	 * Set value of PreferredLanguage
	 * @param context
	 * @param preferredlanguage
	 */
	public final void setPreferredLanguage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String preferredlanguage)
	{
		getMendixObject().setValue(context, MemberNames.PreferredLanguage.toString(), preferredlanguage);
	}

	/**
	 * @return value of Surname
	 */
	public final java.lang.String getSurname()
	{
		return getSurname(getContext());
	}

	/**
	 * @param context
	 * @return value of Surname
	 */
	public final java.lang.String getSurname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Surname.toString());
	}

	/**
	 * Set value of Surname
	 * @param surname
	 */
	public final void setSurname(java.lang.String surname)
	{
		setSurname(getContext(), surname);
	}

	/**
	 * Set value of Surname
	 * @param context
	 * @param surname
	 */
	public final void setSurname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String surname)
	{
		getMendixObject().setValue(context, MemberNames.Surname.toString(), surname);
	}

	/**
	 * @return value of UserPrincipalName
	 */
	public final java.lang.String getUserPrincipalName()
	{
		return getUserPrincipalName(getContext());
	}

	/**
	 * @param context
	 * @return value of UserPrincipalName
	 */
	public final java.lang.String getUserPrincipalName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UserPrincipalName.toString());
	}

	/**
	 * Set value of UserPrincipalName
	 * @param userprincipalname
	 */
	public final void setUserPrincipalName(java.lang.String userprincipalname)
	{
		setUserPrincipalName(getContext(), userprincipalname);
	}

	/**
	 * Set value of UserPrincipalName
	 * @param context
	 * @param userprincipalname
	 */
	public final void setUserPrincipalName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String userprincipalname)
	{
		getMendixObject().setValue(context, MemberNames.UserPrincipalName.toString(), userprincipalname);
	}

	/**
	 * @return value of _odata_context
	 */
	public final java.lang.String get_odata_context()
	{
		return get_odata_context(getContext());
	}

	/**
	 * @param context
	 * @return value of _odata_context
	 */
	public final java.lang.String get_odata_context(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._odata_context.toString());
	}

	/**
	 * Set value of _odata_context
	 * @param _odata_context
	 */
	public final void set_odata_context(java.lang.String _odata_context)
	{
		set_odata_context(getContext(), _odata_context);
	}

	/**
	 * Set value of _odata_context
	 * @param context
	 * @param _odata_context
	 */
	public final void set_odata_context(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _odata_context)
	{
		getMendixObject().setValue(context, MemberNames._odata_context.toString(), _odata_context);
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
	 * @return value of _id
	 */
	public final java.lang.String get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final java.lang.String get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(java.lang.String _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of BusinessPhones_User
	 */
	public final microsoftgraph.proxies.BusinessPhones getBusinessPhones_User() throws com.mendix.core.CoreException
	{
		return getBusinessPhones_User(getContext());
	}

	/**
	 * @param context
	 * @return value of BusinessPhones_User
	 */
	public final microsoftgraph.proxies.BusinessPhones getBusinessPhones_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.BusinessPhones result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BusinessPhones_User.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.BusinessPhones.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BusinessPhones_User
	 * @param businessphones_user
	 */
	public final void setBusinessPhones_User(microsoftgraph.proxies.BusinessPhones businessphones_user)
	{
		setBusinessPhones_User(getContext(), businessphones_user);
	}

	/**
	 * Set value of BusinessPhones_User
	 * @param context
	 * @param businessphones_user
	 */
	public final void setBusinessPhones_User(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.BusinessPhones businessphones_user)
	{
		if (businessphones_user == null)
			getMendixObject().setValue(context, MemberNames.BusinessPhones_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BusinessPhones_User.toString(), businessphones_user.getMendixObject().getId());
	}

	/**
	 * @return value of User_Request
	 */
	public final microsoftgraph.proxies.Request getUser_Request() throws com.mendix.core.CoreException
	{
		return getUser_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of User_Request
	 */
	public final microsoftgraph.proxies.Request getUser_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.User_Request.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of User_Request
	 * @param user_request
	 */
	public final void setUser_Request(microsoftgraph.proxies.Request user_request)
	{
		setUser_Request(getContext(), user_request);
	}

	/**
	 * Set value of User_Request
	 * @param context
	 * @param user_request
	 */
	public final void setUser_Request(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Request user_request)
	{
		if (user_request == null)
			getMendixObject().setValue(context, MemberNames.User_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.User_Request.toString(), user_request.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return userMendixObject;
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
			final microsoftgraph.proxies.User that = (microsoftgraph.proxies.User) obj;
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
		return "MicrosoftGraph.User";
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
