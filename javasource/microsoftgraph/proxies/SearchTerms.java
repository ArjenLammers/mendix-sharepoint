// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class SearchTerms extends microsoftgraph.proxies.NPStringArray
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.SearchTerms";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SearchTerms_SearchRequest("MicrosoftGraph.SearchTerms_SearchRequest");

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

	public SearchTerms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MicrosoftGraph.SearchTerms"));
	}

	protected SearchTerms(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject searchTermsMendixObject)
	{
		super(context, searchTermsMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MicrosoftGraph.SearchTerms", searchTermsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MicrosoftGraph.SearchTerms");
	}

	/**
	 * @deprecated Use 'SearchTerms.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.SearchTerms initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.SearchTerms.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static microsoftgraph.proxies.SearchTerms initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.SearchTerms(context, mendixObject);
	}

	public static microsoftgraph.proxies.SearchTerms load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.SearchTerms.initialize(context, mendixObject);
	}

	/**
	 * @return value of SearchTerms_SearchRequest
	 */
	public final microsoftgraph.proxies.SearchRequest getSearchTerms_SearchRequest() throws com.mendix.core.CoreException
	{
		return getSearchTerms_SearchRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchTerms_SearchRequest
	 */
	public final microsoftgraph.proxies.SearchRequest getSearchTerms_SearchRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.SearchRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SearchTerms_SearchRequest.toString());
		if (identifier != null)
			result = microsoftgraph.proxies.SearchRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SearchTerms_SearchRequest
	 * @param searchterms_searchrequest
	 */
	public final void setSearchTerms_SearchRequest(microsoftgraph.proxies.SearchRequest searchterms_searchrequest)
	{
		setSearchTerms_SearchRequest(getContext(), searchterms_searchrequest);
	}

	/**
	 * Set value of SearchTerms_SearchRequest
	 * @param context
	 * @param searchterms_searchrequest
	 */
	public final void setSearchTerms_SearchRequest(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.SearchRequest searchterms_searchrequest)
	{
		if (searchterms_searchrequest == null)
			getMendixObject().setValue(context, MemberNames.SearchTerms_SearchRequest.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SearchTerms_SearchRequest.toString(), searchterms_searchrequest.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final microsoftgraph.proxies.SearchTerms that = (microsoftgraph.proxies.SearchTerms) obj;
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
		return "MicrosoftGraph.SearchTerms";
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
