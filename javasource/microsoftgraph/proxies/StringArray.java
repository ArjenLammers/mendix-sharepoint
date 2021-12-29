// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class StringArray
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject stringArrayMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.StringArray";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Response_modes_supported("MicrosoftGraph.Response_modes_supported"),
		Scopes("MicrosoftGraph.Scopes"),
		Token_endpoint_auth_methods_supported("MicrosoftGraph.Token_endpoint_auth_methods_supported"),
		Subject_types_supported("MicrosoftGraph.Subject_types_supported"),
		Id_token_signing_alg_values("MicrosoftGraph.Id_token_signing_alg_values"),
		Response_types_supported("MicrosoftGraph.Response_types_supported"),
		Claims_supported("MicrosoftGraph.Claims_supported");

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

	public StringArray(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.StringArray"));
	}

	protected StringArray(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject stringArrayMendixObject)
	{
		if (stringArrayMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.StringArray", stringArrayMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.StringArray");

		this.stringArrayMendixObject = stringArrayMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'StringArray.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.StringArray initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.StringArray.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.StringArray initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.StringArray(context, mendixObject);
	}

	public static microsoftgraph.proxies.StringArray load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.StringArray.initialize(context, mendixObject);
	}

	public static java.util.List<microsoftgraph.proxies.StringArray> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<microsoftgraph.proxies.StringArray> result = new java.util.ArrayList<microsoftgraph.proxies.StringArray>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MicrosoftGraph.StringArray" + xpathConstraint))
			result.add(microsoftgraph.proxies.StringArray.initialize(context, obj));
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
	 * @return value of Response_modes_supported
	 */
	public final microsoftgraph.proxies.Authentication getResponse_modes_supported() throws com.mendix.core.CoreException
	{
		return getResponse_modes_supported(getContext());
	}

	/**
	 * @param context
	 * @return value of Response_modes_supported
	 */
	public final microsoftgraph.proxies.Authentication getResponse_modes_supported(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Authentication result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Response_modes_supported.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Authentication.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Response_modes_supported
	 * @param response_modes_supported
	 */
	public final void setResponse_modes_supported(microsoftgraph.proxies.Authentication response_modes_supported)
	{
		setResponse_modes_supported(getContext(), response_modes_supported);
	}

	/**
	 * Set value of Response_modes_supported
	 * @param context
	 * @param response_modes_supported
	 */
	public final void setResponse_modes_supported(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Authentication response_modes_supported)
	{
		if (response_modes_supported == null)
			getMendixObject().setValue(context, MemberNames.Response_modes_supported.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Response_modes_supported.toString(), response_modes_supported.getMendixObject().getId());
	}

	/**
	 * @return value of Scopes
	 */
	public final microsoftgraph.proxies.Authentication getScopes() throws com.mendix.core.CoreException
	{
		return getScopes(getContext());
	}

	/**
	 * @param context
	 * @return value of Scopes
	 */
	public final microsoftgraph.proxies.Authentication getScopes(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Authentication result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Scopes.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Authentication.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Scopes
	 * @param scopes
	 */
	public final void setScopes(microsoftgraph.proxies.Authentication scopes)
	{
		setScopes(getContext(), scopes);
	}

	/**
	 * Set value of Scopes
	 * @param context
	 * @param scopes
	 */
	public final void setScopes(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Authentication scopes)
	{
		if (scopes == null)
			getMendixObject().setValue(context, MemberNames.Scopes.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Scopes.toString(), scopes.getMendixObject().getId());
	}

	/**
	 * @return value of Token_endpoint_auth_methods_supported
	 */
	public final microsoftgraph.proxies.Authentication getToken_endpoint_auth_methods_supported() throws com.mendix.core.CoreException
	{
		return getToken_endpoint_auth_methods_supported(getContext());
	}

	/**
	 * @param context
	 * @return value of Token_endpoint_auth_methods_supported
	 */
	public final microsoftgraph.proxies.Authentication getToken_endpoint_auth_methods_supported(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Authentication result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Token_endpoint_auth_methods_supported.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Authentication.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Token_endpoint_auth_methods_supported
	 * @param token_endpoint_auth_methods_supported
	 */
	public final void setToken_endpoint_auth_methods_supported(microsoftgraph.proxies.Authentication token_endpoint_auth_methods_supported)
	{
		setToken_endpoint_auth_methods_supported(getContext(), token_endpoint_auth_methods_supported);
	}

	/**
	 * Set value of Token_endpoint_auth_methods_supported
	 * @param context
	 * @param token_endpoint_auth_methods_supported
	 */
	public final void setToken_endpoint_auth_methods_supported(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Authentication token_endpoint_auth_methods_supported)
	{
		if (token_endpoint_auth_methods_supported == null)
			getMendixObject().setValue(context, MemberNames.Token_endpoint_auth_methods_supported.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Token_endpoint_auth_methods_supported.toString(), token_endpoint_auth_methods_supported.getMendixObject().getId());
	}

	/**
	 * @return value of Subject_types_supported
	 */
	public final microsoftgraph.proxies.Authentication getSubject_types_supported() throws com.mendix.core.CoreException
	{
		return getSubject_types_supported(getContext());
	}

	/**
	 * @param context
	 * @return value of Subject_types_supported
	 */
	public final microsoftgraph.proxies.Authentication getSubject_types_supported(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Authentication result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Subject_types_supported.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Authentication.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Subject_types_supported
	 * @param subject_types_supported
	 */
	public final void setSubject_types_supported(microsoftgraph.proxies.Authentication subject_types_supported)
	{
		setSubject_types_supported(getContext(), subject_types_supported);
	}

	/**
	 * Set value of Subject_types_supported
	 * @param context
	 * @param subject_types_supported
	 */
	public final void setSubject_types_supported(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Authentication subject_types_supported)
	{
		if (subject_types_supported == null)
			getMendixObject().setValue(context, MemberNames.Subject_types_supported.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Subject_types_supported.toString(), subject_types_supported.getMendixObject().getId());
	}

	/**
	 * @return value of Id_token_signing_alg_values
	 */
	public final microsoftgraph.proxies.Authentication getId_token_signing_alg_values() throws com.mendix.core.CoreException
	{
		return getId_token_signing_alg_values(getContext());
	}

	/**
	 * @param context
	 * @return value of Id_token_signing_alg_values
	 */
	public final microsoftgraph.proxies.Authentication getId_token_signing_alg_values(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Authentication result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Id_token_signing_alg_values.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Authentication.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Id_token_signing_alg_values
	 * @param id_token_signing_alg_values
	 */
	public final void setId_token_signing_alg_values(microsoftgraph.proxies.Authentication id_token_signing_alg_values)
	{
		setId_token_signing_alg_values(getContext(), id_token_signing_alg_values);
	}

	/**
	 * Set value of Id_token_signing_alg_values
	 * @param context
	 * @param id_token_signing_alg_values
	 */
	public final void setId_token_signing_alg_values(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Authentication id_token_signing_alg_values)
	{
		if (id_token_signing_alg_values == null)
			getMendixObject().setValue(context, MemberNames.Id_token_signing_alg_values.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Id_token_signing_alg_values.toString(), id_token_signing_alg_values.getMendixObject().getId());
	}

	/**
	 * @return value of Response_types_supported
	 */
	public final microsoftgraph.proxies.Authentication getResponse_types_supported() throws com.mendix.core.CoreException
	{
		return getResponse_types_supported(getContext());
	}

	/**
	 * @param context
	 * @return value of Response_types_supported
	 */
	public final microsoftgraph.proxies.Authentication getResponse_types_supported(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Authentication result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Response_types_supported.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Authentication.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Response_types_supported
	 * @param response_types_supported
	 */
	public final void setResponse_types_supported(microsoftgraph.proxies.Authentication response_types_supported)
	{
		setResponse_types_supported(getContext(), response_types_supported);
	}

	/**
	 * Set value of Response_types_supported
	 * @param context
	 * @param response_types_supported
	 */
	public final void setResponse_types_supported(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Authentication response_types_supported)
	{
		if (response_types_supported == null)
			getMendixObject().setValue(context, MemberNames.Response_types_supported.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Response_types_supported.toString(), response_types_supported.getMendixObject().getId());
	}

	/**
	 * @return value of Claims_supported
	 */
	public final microsoftgraph.proxies.Authentication getClaims_supported() throws com.mendix.core.CoreException
	{
		return getClaims_supported(getContext());
	}

	/**
	 * @param context
	 * @return value of Claims_supported
	 */
	public final microsoftgraph.proxies.Authentication getClaims_supported(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Authentication result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Claims_supported.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Authentication.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Claims_supported
	 * @param claims_supported
	 */
	public final void setClaims_supported(microsoftgraph.proxies.Authentication claims_supported)
	{
		setClaims_supported(getContext(), claims_supported);
	}

	/**
	 * Set value of Claims_supported
	 * @param context
	 * @param claims_supported
	 */
	public final void setClaims_supported(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Authentication claims_supported)
	{
		if (claims_supported == null)
			getMendixObject().setValue(context, MemberNames.Claims_supported.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Claims_supported.toString(), claims_supported.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return stringArrayMendixObject;
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
			final microsoftgraph.proxies.StringArray that = (microsoftgraph.proxies.StringArray) obj;
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
		return "MicrosoftGraph.StringArray";
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
