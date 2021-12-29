// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sharepoint.proxies;

public class CreateUploadSessionResponse
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject createUploadSessionResponseMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Sharepoint.CreateUploadSessionResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UploadUrl("UploadUrl"),
		ExpirationDateTime("ExpirationDateTime");

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

	public CreateUploadSessionResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Sharepoint.CreateUploadSessionResponse"));
	}

	protected CreateUploadSessionResponse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject createUploadSessionResponseMendixObject)
	{
		if (createUploadSessionResponseMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Sharepoint.CreateUploadSessionResponse", createUploadSessionResponseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Sharepoint.CreateUploadSessionResponse");

		this.createUploadSessionResponseMendixObject = createUploadSessionResponseMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CreateUploadSessionResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sharepoint.proxies.CreateUploadSessionResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sharepoint.proxies.CreateUploadSessionResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sharepoint.proxies.CreateUploadSessionResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sharepoint.proxies.CreateUploadSessionResponse(context, mendixObject);
	}

	public static sharepoint.proxies.CreateUploadSessionResponse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sharepoint.proxies.CreateUploadSessionResponse.initialize(context, mendixObject);
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
	 * @return value of UploadUrl
	 */
	public final java.lang.String getUploadUrl()
	{
		return getUploadUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of UploadUrl
	 */
	public final java.lang.String getUploadUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UploadUrl.toString());
	}

	/**
	 * Set value of UploadUrl
	 * @param uploadurl
	 */
	public final void setUploadUrl(java.lang.String uploadurl)
	{
		setUploadUrl(getContext(), uploadurl);
	}

	/**
	 * Set value of UploadUrl
	 * @param context
	 * @param uploadurl
	 */
	public final void setUploadUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uploadurl)
	{
		getMendixObject().setValue(context, MemberNames.UploadUrl.toString(), uploadurl);
	}

	/**
	 * @return value of ExpirationDateTime
	 */
	public final java.util.Date getExpirationDateTime()
	{
		return getExpirationDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpirationDateTime
	 */
	public final java.util.Date getExpirationDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ExpirationDateTime.toString());
	}

	/**
	 * Set value of ExpirationDateTime
	 * @param expirationdatetime
	 */
	public final void setExpirationDateTime(java.util.Date expirationdatetime)
	{
		setExpirationDateTime(getContext(), expirationdatetime);
	}

	/**
	 * Set value of ExpirationDateTime
	 * @param context
	 * @param expirationdatetime
	 */
	public final void setExpirationDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date expirationdatetime)
	{
		getMendixObject().setValue(context, MemberNames.ExpirationDateTime.toString(), expirationdatetime);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return createUploadSessionResponseMendixObject;
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
			final sharepoint.proxies.CreateUploadSessionResponse that = (sharepoint.proxies.CreateUploadSessionResponse) obj;
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
		return "Sharepoint.CreateUploadSessionResponse";
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