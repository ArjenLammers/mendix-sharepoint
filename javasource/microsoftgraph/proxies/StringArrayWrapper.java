// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package microsoftgraph.proxies;

public class StringArrayWrapper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject stringArrayWrapperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MicrosoftGraph.StringArrayWrapper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Value("Value"),
		StringArrayWrapper_StringArray("MicrosoftGraph.StringArrayWrapper_StringArray");

		private final java.lang.String metaName;

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

	public StringArrayWrapper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected StringArrayWrapper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject stringArrayWrapperMendixObject)
	{
		if (stringArrayWrapperMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, stringArrayWrapperMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.stringArrayWrapperMendixObject = stringArrayWrapperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'StringArrayWrapper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static microsoftgraph.proxies.StringArrayWrapper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return microsoftgraph.proxies.StringArrayWrapper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static microsoftgraph.proxies.StringArrayWrapper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new microsoftgraph.proxies.StringArrayWrapper(context, mendixObject);
	}

	public static microsoftgraph.proxies.StringArrayWrapper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return microsoftgraph.proxies.StringArrayWrapper.initialize(context, mendixObject);
	}

	public static java.util.List<microsoftgraph.proxies.StringArrayWrapper> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> microsoftgraph.proxies.StringArrayWrapper.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
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
	 * @return value of Value
	 */
	public final java.lang.String getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.lang.String getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.lang.String value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of StringArrayWrapper_StringArray
	 */
	public final microsoftgraph.proxies.StringArray getStringArrayWrapper_StringArray() throws com.mendix.core.CoreException
	{
		return getStringArrayWrapper_StringArray(getContext());
	}

	/**
	 * @param context
	 * @return value of StringArrayWrapper_StringArray
	 * @throws com.mendix.core.CoreException
	 */
	public final microsoftgraph.proxies.StringArray getStringArrayWrapper_StringArray(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		microsoftgraph.proxies.StringArray result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.StringArrayWrapper_StringArray.toString());
		if (identifier != null) {
			result = microsoftgraph.proxies.StringArray.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of StringArrayWrapper_StringArray
	 * @param stringarraywrapper_stringarray
	 */
	public final void setStringArrayWrapper_StringArray(microsoftgraph.proxies.StringArray stringarraywrapper_stringarray)
	{
		setStringArrayWrapper_StringArray(getContext(), stringarraywrapper_stringarray);
	}

	/**
	 * Set value of StringArrayWrapper_StringArray
	 * @param context
	 * @param stringarraywrapper_stringarray
	 */
	public final void setStringArrayWrapper_StringArray(com.mendix.systemwideinterfaces.core.IContext context, microsoftgraph.proxies.StringArray stringarraywrapper_stringarray)
	{
		if (stringarraywrapper_stringarray == null) {
			getMendixObject().setValue(context, MemberNames.StringArrayWrapper_StringArray.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.StringArrayWrapper_StringArray.toString(), stringarraywrapper_stringarray.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return stringArrayWrapperMendixObject;
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
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final microsoftgraph.proxies.StringArrayWrapper that = (microsoftgraph.proxies.StringArrayWrapper) obj;
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
		return entityName;
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
