// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class Request
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject requestMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.Request";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_odata_context("_odata_context"),
		EmptySuggestionsReason("EmptySuggestionsReason"),
		SaveToSentItems("SaveToSentItems"),
		Error_Request("MicrosoftGraph.Error_Request"),
		Message_Request("MicrosoftGraph.Message_Request");

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

	public Request(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.Request"));
	}

	protected Request(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestMendixObject)
	{
		if (requestMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.Request", requestMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.Request");

		this.requestMendixObject = requestMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Request.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.Request initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.Request.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.Request initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.Request(context, mendixObject);
	}

	public static microsoftgraph.proxies.Request load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.Request.initialize(context, mendixObject);
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
	 * @return value of EmptySuggestionsReason
	 */
	public final java.lang.String getEmptySuggestionsReason()
	{
		return getEmptySuggestionsReason(getContext());
	}

	/**
	 * @param context
	 * @return value of EmptySuggestionsReason
	 */
	public final java.lang.String getEmptySuggestionsReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmptySuggestionsReason.toString());
	}

	/**
	 * Set value of EmptySuggestionsReason
	 * @param emptysuggestionsreason
	 */
	public final void setEmptySuggestionsReason(java.lang.String emptysuggestionsreason)
	{
		setEmptySuggestionsReason(getContext(), emptysuggestionsreason);
	}

	/**
	 * Set value of EmptySuggestionsReason
	 * @param context
	 * @param emptysuggestionsreason
	 */
	public final void setEmptySuggestionsReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emptysuggestionsreason)
	{
		getMendixObject().setValue(context, MemberNames.EmptySuggestionsReason.toString(), emptysuggestionsreason);
	}

	/**
	 * @return value of SaveToSentItems
	 */
	public final java.lang.Boolean getSaveToSentItems()
	{
		return getSaveToSentItems(getContext());
	}

	/**
	 * @param context
	 * @return value of SaveToSentItems
	 */
	public final java.lang.Boolean getSaveToSentItems(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SaveToSentItems.toString());
	}

	/**
	 * Set value of SaveToSentItems
	 * @param savetosentitems
	 */
	public final void setSaveToSentItems(java.lang.Boolean savetosentitems)
	{
		setSaveToSentItems(getContext(), savetosentitems);
	}

	/**
	 * Set value of SaveToSentItems
	 * @param context
	 * @param savetosentitems
	 */
	public final void setSaveToSentItems(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean savetosentitems)
	{
		getMendixObject().setValue(context, MemberNames.SaveToSentItems.toString(), savetosentitems);
	}

	/**
	 * @return value of Error_Request
	 */
	public final microsoftgraph.proxies.Error getError_Request() throws com.mendix.core.CoreException
	{
		return getError_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of Error_Request
	 */
	public final microsoftgraph.proxies.Error getError_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Error result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Error_Request.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Error.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Error_Request
	 * @param error_request
	 */
	public final void setError_Request(microsoftgraph.proxies.Error error_request)
	{
		setError_Request(getContext(), error_request);
	}

	/**
	 * Set value of Error_Request
	 * @param context
	 * @param error_request
	 */
	public final void setError_Request(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Error error_request)
	{
		if (error_request == null)
			getMendixObject().setValue(context, MemberNames.Error_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Error_Request.toString(), error_request.getMendixObject().getId());
	}

	/**
	 * @return value of Message_Request
	 */
	public final microsoftgraph.proxies.Message getMessage_Request() throws com.mendix.core.CoreException
	{
		return getMessage_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of Message_Request
	 */
	public final microsoftgraph.proxies.Message getMessage_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.Message result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Message_Request.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.Message.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Message_Request
	 * @param message_request
	 */
	public final void setMessage_Request(microsoftgraph.proxies.Message message_request)
	{
		setMessage_Request(getContext(), message_request);
	}

	/**
	 * Set value of Message_Request
	 * @param context
	 * @param message_request
	 */
	public final void setMessage_Request(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.Message message_request)
	{
		if (message_request == null)
			getMendixObject().setValue(context, MemberNames.Message_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Message_Request.toString(), message_request.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return requestMendixObject;
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
			final microsoftgraph.proxies.Request that = (microsoftgraph.proxies.Request) obj;
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
		return "MicrosoftGraph.Request";
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