// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class Authorization
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject authorizationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.Authorization";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Token_type("Token_type"),
		Scope("Scope"),
		Expires_In("Expires_In"),
		Access_Token("Access_Token"),
		Refresh_Token("Refresh_Token"),
		State("State"),
		Nonce("Nonce"),
		Ext_expires_in("Ext_expires_in"),
		Successful("Successful"),
		Authorization_Authentication("MicrosoftGraph.Authorization_Authentication"),
		UserInfo_Authorization("MicrosoftGraph.UserInfo_Authorization"),
		Authorization_User("MicrosoftGraph.Authorization_User");

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

	public Authorization(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.Authorization"));
	}

	protected Authorization(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject authorizationMendixObject)
	{
		if (authorizationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.Authorization", authorizationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.Authorization");

		this.authorizationMendixObject = authorizationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Authorization.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.Authorization initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.Authorization.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.Authorization initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.Authorization(context, mendixObject);
	}

	public static microsoftgraph.proxies.Authorization load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.Authorization.initialize(context, mendixObject);
	}

	public static java.util.List<microsoftgraph.proxies.Authorization> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<microsoftgraph.proxies.Authorization> result = new java.util.ArrayList<microsoftgraph.proxies.Authorization>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MicrosoftGraph.Authorization" + xpathConstraint))
			result.add(microsoftgraph.proxies.Authorization.initialize(context, obj));
		return result;
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
	 * @return value of Token_type
	 */
	public final java.lang.String getToken_type()
	{
		return getToken_type(getContext());
	}

	/**
	 * @param context
	 * @return value of Token_type
	 */
	public final java.lang.String getToken_type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Token_type.toString());
	}

	/**
	 * Set value of Token_type
	 * @param token_type
	 */
	public final void setToken_type(java.lang.String token_type)
	{
		setToken_type(getContext(), token_type);
	}

	/**
	 * Set value of Token_type
	 * @param context
	 * @param token_type
	 */
	public final void setToken_type(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String token_type)
	{
		getMendixObject().setValue(context, MemberNames.Token_type.toString(), token_type);
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
	 * @return value of Expires_In
	 */
	public final java.lang.String getExpires_In()
	{
		return getExpires_In(getContext());
	}

	/**
	 * @param context
	 * @return value of Expires_In
	 */
	public final java.lang.String getExpires_In(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Expires_In.toString());
	}

	/**
	 * Set value of Expires_In
	 * @param expires_in
	 */
	public final void setExpires_In(java.lang.String expires_in)
	{
		setExpires_In(getContext(), expires_in);
	}

	/**
	 * Set value of Expires_In
	 * @param context
	 * @param expires_in
	 */
	public final void setExpires_In(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String expires_in)
	{
		getMendixObject().setValue(context, MemberNames.Expires_In.toString(), expires_in);
	}

	/**
	 * @return value of Access_Token
	 */
	public final java.lang.String getAccess_Token()
	{
		return getAccess_Token(getContext());
	}

	/**
	 * @param context
	 * @return value of Access_Token
	 */
	public final java.lang.String getAccess_Token(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Access_Token.toString());
	}

	/**
	 * Set value of Access_Token
	 * @param access_token
	 */
	public final void setAccess_Token(java.lang.String access_token)
	{
		setAccess_Token(getContext(), access_token);
	}

	/**
	 * Set value of Access_Token
	 * @param context
	 * @param access_token
	 */
	public final void setAccess_Token(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String access_token)
	{
		getMendixObject().setValue(context, MemberNames.Access_Token.toString(), access_token);
	}

	/**
	 * @return value of Refresh_Token
	 */
	public final java.lang.String getRefresh_Token()
	{
		return getRefresh_Token(getContext());
	}

	/**
	 * @param context
	 * @return value of Refresh_Token
	 */
	public final java.lang.String getRefresh_Token(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Refresh_Token.toString());
	}

	/**
	 * Set value of Refresh_Token
	 * @param refresh_token
	 */
	public final void setRefresh_Token(java.lang.String refresh_token)
	{
		setRefresh_Token(getContext(), refresh_token);
	}

	/**
	 * Set value of Refresh_Token
	 * @param context
	 * @param refresh_token
	 */
	public final void setRefresh_Token(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String refresh_token)
	{
		getMendixObject().setValue(context, MemberNames.Refresh_Token.toString(), refresh_token);
	}

	/**
	 * @return value of State
	 */
	public final java.lang.String getState()
	{
		return getState(getContext());
	}

	/**
	 * @param context
	 * @return value of State
	 */
	public final java.lang.String getState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.State.toString());
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final void setState(java.lang.String state)
	{
		setState(getContext(), state);
	}

	/**
	 * Set value of State
	 * @param context
	 * @param state
	 */
	public final void setState(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String state)
	{
		getMendixObject().setValue(context, MemberNames.State.toString(), state);
	}

	/**
	 * @return value of Nonce
	 */
	public final java.lang.String getNonce()
	{
		return getNonce(getContext());
	}

	/**
	 * @param context
	 * @return value of Nonce
	 */
	public final java.lang.String getNonce(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Nonce.toString());
	}

	/**
	 * Set value of Nonce
	 * @param nonce
	 */
	public final void setNonce(java.lang.String nonce)
	{
		setNonce(getContext(), nonce);
	}

	/**
	 * Set value of Nonce
	 * @param context
	 * @param nonce
	 */
	public final void setNonce(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nonce)
	{
		getMendixObject().setValue(context, MemberNames.Nonce.toString(), nonce);
	}

	/**
	 * @return value of Ext_expires_in
	 */
	public final java.lang.Integer getExt_expires_in()
	{
		return getExt_expires_in(getContext());
	}

	/**
	 * @param context
	 * @return value of Ext_expires_in
	 */
	public final java.lang.Integer getExt_expires_in(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Ext_expires_in.toString());
	}

	/**
	 * Set value of Ext_expires_in
	 * @param ext_expires_in
	 */
	public final void setExt_expires_in(java.lang.Integer ext_expires_in)
	{
		setExt_expires_in(getContext(), ext_expires_in);
	}

	/**
	 * Set value of Ext_expires_in
	 * @param context
	 * @param ext_expires_in
	 */
	public final void setExt_expires_in(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer ext_expires_in)
	{
		getMendixObject().setValue(context, MemberNames.Ext_expires_in.toString(), ext_expires_in);
	}

	/**
	 * @return value of Successful
	 */
	public final java.lang.Boolean getSuccessful()
	{
		return getSuccessful(getContext());
	}

	/**
	 * @param context
	 * @return value of Successful
	 */
	public final java.lang.Boolean getSuccessful(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Successful.toString());
	}

	/**
	 * Set value of Successful
	 * @param successful
	 */
	public final void setSuccessful(java.lang.Boolean successful)
	{
		setSuccessful(getContext(), successful);
	}

	/**
	 * Set value of Successful
	 * @param context
	 * @param successful
	 */
	public final void setSuccessful(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean successful)
	{
		getMendixObject().setValue(context, MemberNames.Successful.toString(), successful);
	}

	/**
	 * @return value of Authorization_Authentication
	 */
	public final microsoftgraph.proxies.Authentication getAuthorization_Authentication() throws com.mendix.core.CoreException
	{
		return getAuthorization_Authentication(getContext());
	}

	/**
	 * @param context
	 * @return value of Authorization_Authentication
	 */
	public final microsoftgraph.proxies.Authentication getAuthorization_Authentication(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Authentication result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Authorization_Authentication.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Authentication.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Authorization_Authentication
	 * @param authorization_authentication
	 */
	public final void setAuthorization_Authentication(microsoftgraph.proxies.Authentication authorization_authentication)
	{
		setAuthorization_Authentication(getContext(), authorization_authentication);
	}

	/**
	 * Set value of Authorization_Authentication
	 * @param context
	 * @param authorization_authentication
	 */
	public final void setAuthorization_Authentication(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Authentication authorization_authentication)
	{
		if (authorization_authentication == null)
			getMendixObject().setValue(context, MemberNames.Authorization_Authentication.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Authorization_Authentication.toString(), authorization_authentication.getMendixObject().getId());
	}

	/**
	 * @return value of UserInfo_Authorization
	 */
	public final microsoftgraph.proxies.UserInfo getUserInfo_Authorization() throws com.mendix.core.CoreException
	{
		return getUserInfo_Authorization(getContext());
	}

	/**
	 * @param context
	 * @return value of UserInfo_Authorization
	 */
	public final microsoftgraph.proxies.UserInfo getUserInfo_Authorization(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.UserInfo result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.UserInfo_Authorization.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.UserInfo.load(context, identifier);
		return result;
	}

	/**
	 * Set value of UserInfo_Authorization
	 * @param userinfo_authorization
	 */
	public final void setUserInfo_Authorization(microsoftgraph.proxies.UserInfo userinfo_authorization)
	{
		setUserInfo_Authorization(getContext(), userinfo_authorization);
	}

	/**
	 * Set value of UserInfo_Authorization
	 * @param context
	 * @param userinfo_authorization
	 */
	public final void setUserInfo_Authorization(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.UserInfo userinfo_authorization)
	{
		if (userinfo_authorization == null)
			getMendixObject().setValue(context, MemberNames.UserInfo_Authorization.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.UserInfo_Authorization.toString(), userinfo_authorization.getMendixObject().getId());
	}

	/**
	 * @return value of Authorization_User
	 */
	public final system.proxies.User getAuthorization_User() throws com.mendix.core.CoreException
	{
		return getAuthorization_User(getContext());
	}

	/**
	 * @param context
	 * @return value of Authorization_User
	 */
	public final system.proxies.User getAuthorization_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Authorization_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Authorization_User
	 * @param authorization_user
	 */
	public final void setAuthorization_User(system.proxies.User authorization_user)
	{
		setAuthorization_User(getContext(), authorization_user);
	}

	/**
	 * Set value of Authorization_User
	 * @param context
	 * @param authorization_user
	 */
	public final void setAuthorization_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User authorization_user)
	{
		if (authorization_user == null)
			getMendixObject().setValue(context, MemberNames.Authorization_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Authorization_User.toString(), authorization_user.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return authorizationMendixObject;
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
			final microsoftgraph.proxies.Authorization that = (microsoftgraph.proxies.Authorization) obj;
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
		return "MicrosoftGraph.Authorization";
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
