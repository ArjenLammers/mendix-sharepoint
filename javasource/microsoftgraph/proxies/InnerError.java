// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class InnerError
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject innerErrorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.InnerError";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Date("Date"),
		Request_id("Request_id"),
		Client_request_id("Client_request_id"),
		InnerError_Error("MicrosoftGraph.InnerError_Error");

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

	public InnerError(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.InnerError"));
	}

	protected InnerError(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject innerErrorMendixObject)
	{
		if (innerErrorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.InnerError", innerErrorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.InnerError");

		this.innerErrorMendixObject = innerErrorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'InnerError.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.InnerError initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.InnerError.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.InnerError initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.InnerError(context, mendixObject);
	}

	public static microsoftgraph.proxies.InnerError load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.InnerError.initialize(context, mendixObject);
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
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return value of Request_id
	 */
	public final java.lang.String getRequest_id()
	{
		return getRequest_id(getContext());
	}

	/**
	 * @param context
	 * @return value of Request_id
	 */
	public final java.lang.String getRequest_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Request_id.toString());
	}

	/**
	 * Set value of Request_id
	 * @param request_id
	 */
	public final void setRequest_id(java.lang.String request_id)
	{
		setRequest_id(getContext(), request_id);
	}

	/**
	 * Set value of Request_id
	 * @param context
	 * @param request_id
	 */
	public final void setRequest_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String request_id)
	{
		getMendixObject().setValue(context, MemberNames.Request_id.toString(), request_id);
	}

	/**
	 * @return value of Client_request_id
	 */
	public final java.lang.String getClient_request_id()
	{
		return getClient_request_id(getContext());
	}

	/**
	 * @param context
	 * @return value of Client_request_id
	 */
	public final java.lang.String getClient_request_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Client_request_id.toString());
	}

	/**
	 * Set value of Client_request_id
	 * @param client_request_id
	 */
	public final void setClient_request_id(java.lang.String client_request_id)
	{
		setClient_request_id(getContext(), client_request_id);
	}

	/**
	 * Set value of Client_request_id
	 * @param context
	 * @param client_request_id
	 */
	public final void setClient_request_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String client_request_id)
	{
		getMendixObject().setValue(context, MemberNames.Client_request_id.toString(), client_request_id);
	}

	/**
	 * @return value of InnerError_Error
	 */
	public final microsoftgraph.proxies.Error getInnerError_Error() throws com.mendix.core.CoreException
	{
		return getInnerError_Error(getContext());
	}

	/**
	 * @param context
	 * @return value of InnerError_Error
	 */
	public final microsoftgraph.proxies.Error getInnerError_Error(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Error result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InnerError_Error.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Error.load(context, identifier);
		return result;
	}

	/**
	 * Set value of InnerError_Error
	 * @param innererror_error
	 */
	public final void setInnerError_Error(microsoftgraph.proxies.Error innererror_error)
	{
		setInnerError_Error(getContext(), innererror_error);
	}

	/**
	 * Set value of InnerError_Error
	 * @param context
	 * @param innererror_error
	 */
	public final void setInnerError_Error(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Error innererror_error)
	{
		if (innererror_error == null)
			getMendixObject().setValue(context, MemberNames.InnerError_Error.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.InnerError_Error.toString(), innererror_error.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return innerErrorMendixObject;
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
			final microsoftgraph.proxies.InnerError that = (microsoftgraph.proxies.InnerError) obj;
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
		return "MicrosoftGraph.InnerError";
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
