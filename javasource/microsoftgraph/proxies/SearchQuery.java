// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class SearchQuery
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject searchQueryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.SearchQuery";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		QueryString("QueryString"),
		SearchQuery_SearchRequest("MicrosoftGraph.SearchQuery_SearchRequest");

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

	public SearchQuery(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.SearchQuery"));
	}

	protected SearchQuery(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject searchQueryMendixObject)
	{
		if (searchQueryMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.SearchQuery", searchQueryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.SearchQuery");

		this.searchQueryMendixObject = searchQueryMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SearchQuery.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.SearchQuery initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.SearchQuery.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.SearchQuery initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.SearchQuery(context, mendixObject);
	}

	public static microsoftgraph.proxies.SearchQuery load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.SearchQuery.initialize(context, mendixObject);
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
	 * @return value of QueryString
	 */
	public final java.lang.String getQueryString()
	{
		return getQueryString(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryString
	 */
	public final java.lang.String getQueryString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.QueryString.toString());
	}

	/**
	 * Set value of QueryString
	 * @param querystring
	 */
	public final void setQueryString(java.lang.String querystring)
	{
		setQueryString(getContext(), querystring);
	}

	/**
	 * Set value of QueryString
	 * @param context
	 * @param querystring
	 */
	public final void setQueryString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String querystring)
	{
		getMendixObject().setValue(context, MemberNames.QueryString.toString(), querystring);
	}

	/**
	 * @return value of SearchQuery_SearchRequest
	 */
	public final microsoftgraph.proxies.SearchRequest getSearchQuery_SearchRequest() throws com.mendix.core.CoreException
	{
		return getSearchQuery_SearchRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchQuery_SearchRequest
	 */
	public final microsoftgraph.proxies.SearchRequest getSearchQuery_SearchRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.SearchRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SearchQuery_SearchRequest.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.SearchRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SearchQuery_SearchRequest
	 * @param searchquery_searchrequest
	 */
	public final void setSearchQuery_SearchRequest(microsoftgraph.proxies.SearchRequest searchquery_searchrequest)
	{
		setSearchQuery_SearchRequest(getContext(), searchquery_searchrequest);
	}

	/**
	 * Set value of SearchQuery_SearchRequest
	 * @param context
	 * @param searchquery_searchrequest
	 */
	public final void setSearchQuery_SearchRequest(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.SearchRequest searchquery_searchrequest)
	{
		if (searchquery_searchrequest == null)
			getMendixObject().setValue(context, MemberNames.SearchQuery_SearchRequest.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SearchQuery_SearchRequest.toString(), searchquery_searchrequest.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return searchQueryMendixObject;
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
			final microsoftgraph.proxies.SearchQuery that = (microsoftgraph.proxies.SearchQuery) obj;
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
		return "MicrosoftGraph.SearchQuery";
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